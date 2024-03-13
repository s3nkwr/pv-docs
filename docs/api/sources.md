---
outline: deep
---

# Sources
Sources are used to play audio to the players.

## Stereo sources
PV 2.0 introduced the stereo sources.
You can find the difference between stereo and mono sources here: [Stereo sources](/docs/new-in-2xx/#stereo-sources).

## Creating a source
All sources are attached to source lines, the process of registering a source requires prior registration of a
[Source Line](/docs/api/source-lines#registering-a-source-line).

### Static source
Static sources are attached to the certain positions in the world.

::: code-group
<<< @/snippets/api/sources/static.java [java]
<<< @/snippets/api/sources/static.kt{kotlin} [kotlin]
:::

### Entity source
Entity sources are attached to the entities.

::: code-group
<<< @/snippets/api/sources/entity.java [java]
<<< @/snippets/api/sources/entity.kt{kotlin} [kotlin]
:::

### Player source
Player sources are attached to the players.

::: code-group
<<< @/snippets/api/sources/player.java [java]
<<< @/snippets/api/sources/player.kt{kotlin} [kotlin]
:::

### Direct source
Direct sources are attached to a specific player and can only be heard by that player.

You can also set the sender using [BaseServerDirectSource#setSender](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.source/-base-server-direct-source/sender.html),
which will be displayed in the player overlay.

::: code-group
<<< @/snippets/api/sources/direct.java [java]
<<< @/snippets/api/sources/direct.kt{kotlin} [kotlin]
:::

### Broadcast source
Broadcast sources are similar to direct sources,
but they are attached to a group of players and can only be heard by those specific players.

By default, the group of players is not set, which means the audio will be heard by all players with Plasmo Voice installed.
To change a group of players, use [ServerBroadcastSource#setPlayers](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.source/-server-broadcast-source/players.html).

::: code-group
<<< @/snippets/api/sources/broadcast.java [java]
<<< @/snippets/api/sources/broadcast.kt{kotlin} [kotlin]
:::

## Audio sender

### ArrayAudioFrameProvider
Use the `ArrayAudioFrameProvider` when you need to send a fixed set of audio samples.

You can also loop the samples using [ArrayAudioFrameProvider#loop](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.provider/-array-audio-frame-provider/index.html#814034649%2FProperties%2F-406018262).

::: code-group
<<< @/snippets/api/sources/array-frame-provider.java [java]
<<< @/snippets/api/sources/array-frame-provider.kt{kotlin} [kotlin]
:::

### Custom provider
You can create your own audio frame providers by implementing [AudioFrameProvider](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.provider/-audio-frame-provider/index.html).

You should return encoded and encrypted 20ms audio frames to `provide20ms`.

::: code-group
<<< @/snippets/api/sources/custom-frame-provider.java [java]
<<< @/snippets/api/sources/custom-frame-provider.kt{kotlin} [kotlin]
:::
