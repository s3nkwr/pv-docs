# Installing on a Proxy

::: tip

It's highly recommended to read the [Advanced Theory](/docs/server/advanced/) page first.

Or *at least* the [Terminology](/docs/server/advanced/#terminology) part of it.

:::

## Introduction

You can use Plasmo Voice with Bungee or Velocity in two different ways:

- Install Plasmo Voice on each **Server** behind the **Proxy**.
- Install Plasmo Voice on **Proxy** using Bungee or Velocity plugin.

The first way is more simple.

The second way gives you more features, such as:

- You only need one public UDP port.
- You can install Plasmo Voice add-ons on the proxy.
  - For example, if you install `pv-addon-groups` on the proxy, then the groups will work between servers. 
  - Only works with add-ons that explicitly support it.

Before using the **Proxy** plugin you **still** need to install Plasmo Voice on each **Server** behind the **Proxy**, so we'll start with that.

## Installing on each Server behind the Proxy

You can follow the normal installation guide.

Just download the plugin and install it into the `~/plugins` folder on each of your **Servers**.

Besides that, there are a few caveats that you should keep in mind. 

### Each Server should have a different port

Multiple servers can't share a single port.

Use a different UDP port for each **Server**.

Make sure that each port is open.

### Proxy and Server on different Nodes

If your **Proxy** and **Server** are located on different **Nodes** you need to change the **Public IP** in the Plasmo Voice config on the **Server**.

::: tip
More info with an example in [Advanced Theory](/docs/server/advanced/).
:::

```toml
[host]
ip = "0.0.0.0"
port = 0

[host.public]
ip = "222.2.222.222" # IP of the Server
port = 2000 # Port of the Server
```

By this point, the voice chat should work. But you might want to stick around to install the **Proxy** plugin to get more features. 

## Installing the Proxy plugin

First, download the plugin for Bungee or Velocity from [Modrinth](https://modrinth.com/plugin/plasmo-voice/versions), drop it into the `~/plugins` folder, and restart the server. 

Then open the Plasmo Voice **Proxy** config.

```toml
[host]
ip = "0.0.0.0"
port = 0

# [servers]
# farmworld = "127.0.0.1:25565"
# overworld = "127.0.0.1:25566"
```

### Specify the Servers

::: tip
This step is optional. The plugin will use the server configuration from your Bungee/Velocity config. 

You only need to change it if for some reason the IP and Port of the **Voice Server** doesn't match the IP and the port of the **Game Server**.
:::

You can uncomment `[servers]` to specify a list servers with Plasmo Voice. 

**Key** should match the name of the server in the Velocity / Bungee config. 

IP and ports usually match too, but they can be different if you configured it that way.

### Specify the Forwarding Secret

In the `~/plugins/plasmovoice` folder of the **Proxy** a file called `forwarding-secret` will appear. 

Copy this file into the `~/plugins/plasmovoice/` (or `~/config/plasmovoice/server/` for Fabric/Forge/NeoForge)
folders for each of the **Servers** behind the proxy.

You can change `forwarding-secret` file location using
`PLASMO_VOICE_FORWARDING_SECRET_FILE` environment variable.

You can also use the `PLASMO_VOICE_FORWARDING_SECRET` environment variable.
The environment variable has a higher priority than the file. 

Restart each **Server** after specifying the **Forwarding Secret**.

### Configuring Host

The only UDP port that is required to be public, is the one that you've set in the **Proxy** plugin configuration.

If you want to use [DDoS Protection](/docs/server/udp-proxy/), then the **Proxy** host configuration is the one you need to protect.

The ports that are used by the **Server** plugin to start a **Voice Server** are only needed to communicate with the **Proxy**. You don't need to expose them to the public.

If the **Server** and the **Proxy** are on the same **Node**, then you don't have to do anything. 

If the **Server** and the **Proxy** are running on different **Nodes**, then you may want to configure your firewall in a way that the **Node** of the **Server** will only allow UDP traffic from the **Node** of the **Proxy**.


