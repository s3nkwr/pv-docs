# DDoS Protection Setup

::: tip

It's highly recommended to read the [Advanced Theory](/docs/server/advanced/) page first.

Or *at least* the [Terminology](/docs/server/advanced/#advanced-theory) part of it.

:::

TCP Shield, Ngrok, or NeoProtect — is the **TCP Proxy** you use to protect your main server. It only supports the **TCP** protocol. 

Plasmo Voice can't work on the TCP protocol.

And there is no properer *"DDoS protection proxy as a service"* for the UDP protocol used by Plasmo Voice.

That's why you need to make your own **UDP Proxy**.

## Rent a Node

You need to rent a Virtual or a Dedicated **Node** with good UDP protection.

[OVHcloud](https://www.ovhcloud.com/en/vps/) is a solid choice. You can get a [VPS](https://www.ovhcloud.com/en/vps/) with good protection for like 7$.

We'll call this a **UDP Proxy Node**.

## Set up the UDP Proxy Node

### Install Nginx

Nginx is the software we will use to forward traffic from the **UDP Proxy** to a **Voice Server**.

Use this guide to install it: 

https://www.digitalocean.com/community/tutorials/how-to-install-nginx-on-ubuntu-22-04

(Or use Google if you don't use Ubuntu)

### Edit Nginx config

Lets we have a **Main Node**: `111.1.111.111` and **UDP Proxy Node**: `222.2.222.222`

**Main Node** is running a **Server** with Plasmo Voice configured like this: 

```toml
[host]
ip = "111.1.111.111" # Same as 0.0.0.0
port = 1000 # Same as 0 if 1000 is the port of the Game Server
```

In the main config of Nginx `nginx.conf` you need to add these lines:

```nginx
stream {
  server {
    listen 2000 udp; # You can use any port. You will need this later. 
    proxy_pass 111.1.111.111:1000; # IP of the Voice Chat server on the Main Node
  }
  server {
    # If you need to add more servers
  }
}
```

Now the **UDP Proxy Node** will forward all traffic it receives on UDP port `2000 UDP` to the `proxy_pass` IP: `111.1.111.111:1000`.

## Edit Plasmo Voice Config

Next, we need to make it so that players will connect to the **UDP Proxy Node** instead of connecting directly to the **Voice Server**. 

You can do it by changing the Plasmo Voice config on the **Main Node**.

```toml
[host]
ip = "111.1.111.111" # Same as 0.0.0.0
port = 1000 # Same as 0 if 1000 is the port of the Game Server

[host.public]
ip = "222.2.222.222" # UDP Proxy Node IP
port = 2000 # `listen` port
```

And that's it. Configure your **Main Node** firewall so that it only allows UDP traffic from the **UDP Proxy Node** and the voice chat will work.

::: warning
UDP Proxy Node should have all UDP ports open.

If you only open the port you've used for `listen` this will cause problems.

Make sure not to block all ports in the firewall.
:::

### Troubleshooting

There is a rare problem when the proxy only works periodically.

Adding this to a server block may help. 

```nginx
stream {
  server {
    # ...
    proxy_timeout 15s;
  }
}
```