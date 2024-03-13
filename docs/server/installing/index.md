# Installing on a Server

Most of the time Plasmo Voice should work out of the box.

If it doesn't, then read this guide to figure out why.

## Requirments

### DDoS Protection

By default, Plasmo Voice won't work with TCP Shield, NeoProtect, or a similar proxy service.

It's still possible to make it work, but you need to set up a separate UDP Proxy.

Read: [DDoS Protection Setup]()

### UDP Ports

You need a server with open `UDP` ports.

`UDP` is a network protocol used by Plasmo Voice, as opposed to `TCP` used by a Minecraft server. 

`UDP` and `TCP` ports are different.

For example, you can have a `25565 TCP` port open, and your Minecraft server will work just fine.

But your `25565 UDP` port may be closed. Plasmo Voice will not work because of that.

Because the ports are different, it also means that you can use a `25565 TCP` for your Minecraft server and `25565 UDP` for the voice chat server. The ports won't conflict.

### Using a Minecraft hosting provider

Usually, your main port will be available as both `UDP` and `TCP` ports. Sometimes you will need to create an additional port and use it instead.

Look through your hosting documentation to find info about `UDP` ports or guides on how to install a voice chat mod. 

If you can't find anything, and you are struggling with installation, then ask the hosting support for help. 

### Hosting on your PC

Opening a `UDP` port is the same as opening a `TCP` port.

When you open a port in the firewall or router settings —  you can choose a protocol.

Just make sure to open both `UDP` and `TCP`.

### Bungee or Velocity

Read: [Installing on a Proxy](/docs/server/proxy/) 

## Install the Client mod

You need to install a [Forge or a Fabric mod](https://modrinth.com/mod/plasmo-voice) on your client for the voice chat to work. Players without the mod are still able to join and play as usual.

Paper, Fabric, and Forge servers are all compatible with both Fabric and Forge clients.

![](https://imgur.com/dxgaWJ2.png)

*Assuming Plasmo Voice is installed on both client and the server.*

## Installation

1. Download a plugin or a mod from [Modrinth](https://modrinth.com/mod/plasmo-voice).
2. Install the mod or the plugin
   - For Paper, install the plugin in `~/plugins/`.
   - For Fabric or Forge, install the mod in `~/mods/`.
3. Restart the server.
4. Join the server.
5. Press `V` to open the voice chat menu.

If you see the menu, then the plugin works.

If it says `Connecting...`, `Can't connect`, or `Not installed` then continue with the next step.

## Edit the config

- Config location on Fabric and Forge: `~/config/plasmovoice/config.toml`
- Config location on Paper: `~/plugins/PlasmoVoice/config.toml`

There are two values in the config that you can try to change if Plasmo Voice doesn't work: `ip` and `port`

```toml
# Default values
[host]
ip = "0.0.0.0"
port = 0
```

### IP 

The value of the `ip` will be used as a **Bind Address** that Plasmo Voice will try to launch the voice server on.

If it's set to `0.0.0.0`, then Plasmo Voice will try to get the IP of the server that it's running on.

Problems with the default bind address might occur if there are multiple addresses on the server. It's common with Minecraft-specific hosting providers.

If you think that this might be the problem, contact the support of your hosting and ask them to help you.

### Port

The default port is set to `0`. It means that Plasmo Voice will use the same port as your Minecraft server.

If your Minecraft server is running on `25565 TCP`, the **Voice Server** will be launched on `25565 UDP`.

We already explained all you need to know about ports. If you skipped it, go back and read it. You can change this value to any other port you want Plasmo Voice to use.


## Common problems

`java.net.BindException: Address already in use` Port is already in use, you should choose a different port.

`java.net.BindException: Cannot assign requested address` Can't access **Bind Adress** that is specified in the config. Change it to `0.0.0.0` or your local IP address.
