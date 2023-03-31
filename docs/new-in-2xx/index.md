## Full rewrite, LGPL License

You can now do whatever you want with our mod, as long as you share its modified sourced. 

## Crowdin

Crowdin integration will pull translations from Crowdin as soon as they are approved. Easy to translate, easy to use. 

https://crowdin.com/project/plasmo-voice

https://crowdin.com/project/plasmo-voice-addons

## Bungee And Velocity Plugins

With a **Proxy** plugin you only need one public UDP port.

And, you can make add-ons that work between all your servers.

For example, [pv-addon-broadcast](/docs/addons/#pv-addon-broadcast) allows you to broadcast audio to everyone connected to the proxy. 

And [pv-addon-groups](/docs/addons/#pv-addon-groups) makes it so that players from different servers can be in one voice group channel.

Read: [Installing on a Proxy](/docs/server/proxy/)

## Encryption

Voice chat is now encrypted. Encryption also works with offline mode.

## Exponential Volume Slider

Volume adjustments should feel much smoother and gradual.

Same with positional audio fading. 

Can be disabled in the advanced settings.

## Sound Quality

We fixed a lot of bugs that affected the sound quality in this version.

No more some weird *popping* or *cracking*. At least I hope so.

For example, the "Trailing audio bug" was also fixed. It's like when you could hear the last syllable of the audio the second time the activation was pressed.

## Permissions Sync

In 1xx after your permissions are changed — you need to rejoin the server for permissions to update. There was also a lot of bugs with incorrect icons due to permissions.

Now the permissions are synced instantly.

## New Icons

Now you can tell apart `Client Mute` and `Server Mute` icons.

There is also a new `Player Muted Audio` icon. This icon indicates that the player disabled voice chat on the client.

![](/new-in-2xx/player-icons.png)

![](/new-in-2xx/hud-icons.png)

## New Menu

With a ton of new features we had to rethink the menu once again.

We replaced `General` category with four new ones: `Devices`, `Volume`, `Activation` and `Overlay`.

There is also a new `Add-ons` category and many small visual and usability improvement.

![](/new-in-2xx/devices-tab.png)

### Volume Tab

The volume tab now allows you to individually tweak audio from each add-on.

The player volume controls were also moved here from the **Social Menu**.

We made a decision to move the player volume controls after Mojang added more buttons to the **Social Menu**. Because it felt like *too much* buttons. 

![](/new-in-2xx/volume-tab.png)

### Activation Tab

Add-ons can create activations that you can use to talk.

For example, there is an activation for a default `Proximity` voice chat, and also a separate activation for the `Groups` voice chat.

You can set an activation to different modes: `Push-to-Talk`, `Voice Activation` and `Inherit`.

`Inherit` mode means `Inherit from Proximity`. Activations with this mode will be activated when you use the `Proximity` activation. 

Useful if you want to use multiple activations with a single button. For example, to talk in a group and proximity at the same time.

![]()

### Overlay Tab

Here you can configure old HUD and Player icons.

And also enable a new Discord-like overlay that shows you who what sources are you hearing right now. 

![TODO]()

![TODO]()

### Add-ons Tab

Add-ons can add custom settings to the menu. At the moment it's only used in [pv-addon-soundphysics](/docs/addons/#pv-addon-sound-physics).

## Stereo Sources

For a long time we couldn't figure out why the sound quality of the music was so bad in Plasmo Voice.

Turns out the answer is simple: **Stereo!** 

In version 2.0.0 we added stereo sources that allow you to stream audio in *perfect* quality.

Listen to a little demo with [pv-addon-discs](/docs/addons/#pv-addon-discs).

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

The downside of stereo sources is that they don't have panning. 

The audio level doesn't change when you rotate the camera, and only fades in with the distance. 

However, if you prefer realism and immersion over sound quality, you can turn on `Mono Stereo Sources` in the mod settings.

This option will convert all Stereo Sources to Mono Sources. 

## Add-ons and API

