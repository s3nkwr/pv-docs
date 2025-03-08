---
outline: deep
---

# Source lines

Source lines are used to create [sources](/docs/api/sources) and to control the volume of the sources on the client,
which are created within the source line.

![](/new-in-2xx/volume-tab.png)

## Registering a source line

To register a source line, you need to create addon first, how to do it see
[Creating an addon](/docs/api/#creating-an-addon).

Source lines are dynamically synced with players, allowing you to register or unregister source lines at any time.

::: code-group
<<< @/snippets/api/source-lines/register.java [java]
<<< @/snippets/api/source-lines/register.kt{kotlin} [kotlin]
:::

### Icon
You can also use `InputStream` as an icon. It can be done the same way as in [Activation](/docs/api/activations#icon).

### Weight
Source line weight is determined how high it will be in the list. Lower weight means higher place,
if source lines have the same weight, then they would be sorted alphabetically.

### Players in overlay
To add players to the overlay, you need to enable this function using [ServerSourceLine.Builder#withPlayers](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.line/-base-server-source-line/-builder/index.html#-5457882%2FFunctions%2F-406018262).

After building the source line with `players` feature enabled, you can access the [ServerPlayerSetManager](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.line/-server-player-set-manager/index.html).

An example using this feature with a built-in broadcast player set, which synchronizes the players within the set.
::: code-group
<<< @/snippets/api/source-lines/player-set.java [java]
<<< @/snippets/api/source-lines/player-set.kt{kotlin} [kotlin]
:::

### Default volume
You can set a default volume of the source line using [ServerSourceLine.Builder#setDefaultVolume](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.line/-base-server-source-line/-builder/index.html#1438539984%2FFunctions%2F-406018262), with an allowed range of `0.0` to `1.0`.

## Obtaining an existing source line
If you don't want to create your own source line, you can obtain an existing one:

::: code-group
<<< @/snippets/api/source-lines/obtain.java [java]
<<< @/snippets/api/source-lines/obtain.kt{kotlin} [kotlin]
:::
