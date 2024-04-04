# New in 2xx

## TLDR

Complete rewrite with LGPL License, advanced API, ten official add-ons, groups, replay mod support, Bungee/Velocity plugins, stereo, new icons, new menu, better sound quality, and encryption.

Go get it. It's good. Trust me, bro. You can find it on Modrinth: https://modrinth.com/mod/plasmo-voice

## Bungee And Velocity Plugins

With a Bungee or Velocity plugin, you can use just one public UDP port and create add-ons that work on all servers connected to the proxy.

For instance, with the [pv-addon-broadcast](/docs/addons/#pv-addon-broadcast), you can broadcast audio to all the players connected to the proxy.

Also, the [pv-addon-groups](/docs/addons/#pv-addon-groups) enables players from different servers to join a single voice group channel.

Read: [Installing on a Proxy](/docs/server/proxy/)

## Stereo Sources

For a long time, we couldn't figure out why the sound quality of the music was so bad in Plasmo Voice.

Turns out the answer is simple: **Stereo!**

We added stereo sources that allow you to stream audio in *perfect* quality.

Listen to a demo with [pv-addon-discs](/docs/addons/#pv-addon-discs).

### Mono Source

<p> </p>

<video controls>
    <source src="/new-in-2xx/mono.webm">
</video>

### Stereo Source

<p> </p>

<video controls>
    <source src="/new-in-2xx/stereo.webm">
</video>

The downside of **Stereo Sources** is that they don't have panning.

The audio level doesn't change when you rotate the camera and only fades in with the distance.

However, if you prefer realism and immersion over sound quality, you can turn on `Mono Stereo Sources` in the mod settings.

This option will convert all **Stereo Sources** to **Mono Sources** on the client.

## Permissions Sync

In 1xx after your permissions have changed — you need to rejoin the server for permissions to update. There were also a lot of bugs with incorrect icons due to permissions.

Now the permissions are synced instantly.

## New Icons

Now you can tell apart the `Client Mute` and `Server Mute` icons.

There is also a new `Player Muted Audio` icon. This icon indicates that the player disabled voice chat on the client.

![](/new-in-2xx/player-icons.png)

![](/new-in-2xx/hud-icons.png)

## New Menu

With a ton of new features, we had to rethink the menu again.

We replaced the `General` category with four new ones: `Devices`, `Volume`, `Activation`, and `Overlay`.

There is also a new `Add-ons` category and many visual and usability improvements.

![](/new-in-2xx/devices-tab.png)

### Volume Tab

The new volume tab enables you to adjust the audio levels of each add-on separately.

We've also moved the player volume controls to this tab from the Social Menu.

We made this decision because Mojang added more buttons to the Social Menu, making it cluttered with too many buttons.

![](/new-in-2xx/volume-tab.png)

### Activation Tab

Add-ons can create **Activations** that you can use to talk.

For example, there is an **Activation** for a default `Proximity` voice chat, and also a separate **Activation** for the `Groups` voice chat.

You can set an **Activation** to different modes: `Push-to-Talk`, `Voice Activation`, and `Inherit`.

`Inherit` mode means `Inherit from Proximity`. **Activations** with this mode will be activated when you use the `Proximity` **Activation**.

Useful if you want to use multiple **Activations** with a single button. For example, to talk in a group and proximity at the same time.

![](/new-in-2xx/activation-tab.png)

### Overlay Tab

Here you can configure old HUD and Player icons.

And also enable a new [Discord-like overlay](/docs/new-in-2xx/#stereo-source) that shows you the sources you hear.

![](/new-in-2xx/overlay-tab.png)

### Add-ons Tab

Add-ons can add custom settings to the menu. At the moment it's only used in [pv-addon-soundphysics](/docs/addons/#pv-addon-sound-physics).

## Add-ons and API

The biggest change of them all. With the new Plasmo Voice API, the possibilities are endless.

We already mentioned some new add-ons through this post, but in total, we already made **10 official add-ons**.

- pv-addon-groups
- pv-addon-sculk
- pv-addon-broadcast
- pv-addon-spectator
- pv-addon-whisper
- pv-addon-priority
- pv-addon-lavaplayer-lib
- pv-addon-discs
- pv-addon-sound-physics
- pv-addon-replaymod

Go check them out to see our new API in action: [Add-ons List](/docs/addons/)

### API Features

- Create activations.
- Create source lines.
- Create audio sources.
  - Player source.
  - Entity source.
  - Direct source.
  - Static source.
- Listen for events.
- Use custom base64 icons.
- Universal command framework for Fabric, Forge, Spigot, Bungee, and Velocity.
- Custom config framework.


### API Documentation

Coming soon™.



## Exponential Volume Slider

Volume adjustments should feel much smoother and gradual.

Same with positional audio fading.

Can be disabled in the advanced settings.

## Sound Quality

We fixed a lot of bugs that affected the sound quality in this version.

No more weird *popping* or *cracking*. At least I hope so.

For example, the "Trailing audio bug" was also fixed. Like when you could hear the last syllable of the audio the second time the activation was pressed.

## Encryption

Voice chat is now encrypted. Encryption also works with offline mode.

## Crowdin

Crowdin integration will pull translations from Crowdin as soon as they are approved. Easy to translate, easy to use.

https://crowdin.com/project/plasmo-voice

https://crowdin.com/project/plasmo-voice-addons

