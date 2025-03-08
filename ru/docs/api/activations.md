---
outline: deep
---

# Activations

Activations allow capturing client's voice on separate hotkey.

![](/new-in-2xx/activation-tab.png)

## Registering an activation

To register an activation, you need to create addon first, how to do it see [Creating an addon](/docs/api/#creating-an-addon).

Activations are dynamically synced with players, allowing you to register or unregister activations at any time.
The sync also operates with permissions. Consequently, when a player loses or gains their activation permission,
the activation will be removed or added to the client, respectively.

::: code-group
<<< @/snippets/api/activations/register.java [java]
<<< @/snippets/api/activations/register.kt{kotlin} [kotlin]
:::

### Icon
You can also use `InputStream` as an icon.

::: code-group
<<< @/snippets/api/activations/register-is-icon.java [java]
<<< @/snippets/api/activations/register-is-icon.kt{kotlin} [kotlin]
:::

### Weight
Activation weight is determined how high it will be in the list. Lower weight means higher place,
if activations have the same weight, then they would be sorted alphabetically.

### Distances
You can set a list of available distances using [ServerActivation.Builder#setDistances](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.capture/-server-activation/-builder/index.html#-938744125%2FFunctions%2F-406018262).

An empty list indicates that the activation doesn't have player-controlled distances.

To set a dynamic range of distances, set the first element to `-1`:\
`(ImmutableList.of(-1, 64))`. This will define a range from 1 to 64.

### Other options
See [ServerActivation.Builder](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.capture/-server-activation/-builder/index.html) for all available builder options.

## Obtaining an existing activation
If you don't want to create your own activation, you can obtain an existing one:

::: code-group
<<< @/snippets/api/activations/obtain.java [java]
<<< @/snippets/api/activations/obtain.kt{kotlin} [kotlin]
:::

## Activation listeners

There are three type of listeners:
- onPlayerActivationStart — invoked when a player starts to speak.
- onPlayerActivation — invoked when a player is speaking.
- onPlayerActivationEnd — invoked when a player has finished speaking.

::: code-group
<<< @/snippets/api/activations/listeners.java [java]
<<< @/snippets/api/activations/listeners.kt{kotlin} [kotlin]
:::

## Proximity activation helper
If you want to create a simple proximity activation, you can use built-in [ProximityServerActivationHelper](https://dokka.plasmovoice.com/-plasmo-voice/su.plo.voice.api.server.audio.capture/-proximity-server-activation-helper/index.html) class.
This class will automatically create player sources using provided source line and send packets from activation to the created sources. 

To create a proximity activation helper, you first need to register the [Activation](#registering-an-activation) and the [Source Line](/docs/api/source-lines#registering-a-source-line).

::: code-group
<<< @/snippets/api/activations/proximity-helper.java [java]
<<< @/snippets/api/activations/proximity-helper.kt{kotlin} [kotlin]
:::

### Controlling the distance
By default, the activation helper will use the distance provided by the player. You can override this using `DistanceSupplier`
::: code-group
<<< @/snippets/api/activations/proximity-helper-distance.java [java]
<<< @/snippets/api/activations/proximity-helper-distance.kt{kotlin} [kotlin]
:::
