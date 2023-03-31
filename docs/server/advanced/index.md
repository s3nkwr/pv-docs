# Advanced Theory

## Terminology

- **Node** — a virtual or dedicated server that can host servers and proxies. Has an IP address.
- **Proxy** — a Velocity or Bungee instance running on a **Node**.
- **UDP Proxy** — A separate proxy server used to forward UDP traffic.
- **Server (Game Server)** — a Paper server running on a **Node**.
- **Voice Server** — an instance of **Voice Server** is launched by a Plasmo Voice plugin on a **Game Server**.

## Voice Server Configuration

By default, the plugin config is configured like this:

```toml
[host]
ip = "0.0.0.0"
port = 0
```

**IP is used for 2 different purposes:**

- **Bind Address** — The IP that the plugin will use to start a voice server. Should always be the IP of the **Node** that you run the server on.
    - The default value of `0.0.0.0` means that the IP will be inferred from the IP of the **Node** it is running on. Most of the time you don't need to change it.
- **Public Address** — The IP that the player will connect to.
    - The default value of `0.0.0.0` means that the player will try to connect to the same IP used to connect to a **Game Server** or **Proxy**. That is when problems may arise.
    - You can change the **Public Address** using `[host.public]`

If the port is set to 0 then the **Voice Server** will use the port of the **Server**.

So, if the IP of your node is `111.1.111.111`

And your `server.properties` looks like this:

```properties
server-port=25565
```

The default config will be equivalent to this:

```toml
[host]
ip = "111.1.111.111"
port = 25565
```

## Example

Lets say we have a **Node A**: `111.1.111.111` and **Node B**: `222.2.222.222`

**Node A** is hosting:

- **Proxy** `111.1.111.111:1000`.
- **Server A** `111.1.111.111:1001`.

**Node B** is hosting:

- **Server B** `222.2.222.222:2000`.

With default configuration player will connect to a server via the **Proxy** IP `111.1.111.111:1000`. // TODO factcheck

When the player connects to **Server B** it will then try to establish a connection with a **Voice Server** using the same IP it used to connect to a **Proxy**.

With the default setting this means that the player will try to connect to a **Voice Chat** sever on `111.1.111.111:1000`

Uh oh, this is a problem. The **Voice Server** is actually running on `222.2.222.222:2000`

Luckily this problem can be fixed by changing the **Public Address** in the Plasmo Voice config on the **Server**.

```toml
[host]
ip = "0.0.0.0"
port = 0

[host.public]
ip = "222.2.222.222"
port = 2000
```