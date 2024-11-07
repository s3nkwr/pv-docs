---
outline: deep
---

[//]: # (# Getting Started)
::: warning
The API documentation is WIP and requires [2.1.x Alpha](https://modrinth.com/plugin/plasmo-voice/versions?c=alpha).
:::

## Setting up dependency

There are four different API modules:
- `server` — for server addons (Fabric/Forge/Spigot)
- `proxy` — for proxy addons (BungeeCord/Velocity)
- `client` — for client addons (Fabric/Forge)
- `server-common` — for universal addons, shared module for server and proxy

Most of the examples below use the server module.

### Build system

![Version](https://img.shields.io/badge/dynamic/xml?color=186EF0&label=version&query=/metadata/versioning/versions/version[not(contains(text(),'%2B'))][last()]&url=https://repo.plasmoverse.com/snapshots/su/plo/voice/api/server/maven-metadata.xml)

::: code-group
<<< @/snippets/api/getting-started/dependency.kts{kotlin} [Gradle Kotlin DSL]

<<< @/snippets/api/getting-started/dependency.groovy [Gradle Groovy DSL]

<<< @/snippets/api/getting-started/dependency.xml [Maven POM]
:::

### Kotlin
If you're using Kotlin, you may prefer using the Kotlin bundled with Plasmo Voice,
eliminating the need for you to bundle it yourself.

To utilize the bundled Kotlin in Plasmo Voice, you simply need to relocate the Kotlin classes in your project:

::: code-group
<<< @/snippets/api/getting-started/relocate-kotlin.kts{kotlin} [Gradle Kotlin DSL]

<<< @/snippets/api/getting-started/relocate-kotlin.xml [Maven POM]
:::

Alternatively, you can use a [Plasmo Voice Gradle plugin](https://github.com/plasmoapp/pv-gradle-plugin) for this:

![Version](https://img.shields.io/badge/dynamic/xml?color=186EF0&label=version&query=/metadata/versioning/versions/version[not(contains(text(),'%2B'))][last()]&url=https://repo.plasmoverse.com/snapshots/su/plo/voice/plugin/pv-gradle-plugin/maven-metadata.xml)

::: code-group
```kotlin [settings.gradle.kts]
pluginManagement {
    repositories {
        maven("https://repo.plasmoverse.com/snapshots")
    }
}
```

```kotlin [build.gradle.kts]
plugins {
    id("su.plo.voice.plugin.relocate-kotlin") version "${version}"
}
```
:::

### Optional platform modules
You can also use platform modules to view sources of the Plasmo Voice in your IDE.

They also contain some Kotlin extensions. Extensions can be found at `su.plo.voice.$PLATFORM.extension`.

Available modules:
- `su.plo.voice.server:paper` — Spigot/Paper/etc
- `su.plo.voice.proxy:bungee` — BungeeCord
- `su.plo.voice.proxy:velocity` — Velocity
- `su.plo.voice:protocol` — Module with TCP/UDP packets used in Plasmo Voice

## Creating an addon

To use the Plasmo Voice API, you need to create an addon.

To create an addon, you need to annotate class with `@Addon` 
and optionally implement `AddonInitializer` interface.

An addon id must start with a lowercase letter and may contain only lowercase letters, digits, hyphens, and underscores.
It should be between 4 and 32 characters long.
It's also preferred to the add prefix `pv-addon-` to your addon, but it is not mandatory.

To access the API, you need to inject `PlasmoVoiceServer` using `@InjectPlasmoVoice`.
Alternatively, if you're using kotlin, you can use `injectPlasmoVoice` delegate.

The `PlasmoVoiceServer` will be injected right before invoking `onAddonInitialize`.

::: code-group
<<< @/snippets/api/getting-started/test-addon.java [java]

<<< @/snippets/api/getting-started/test-addon.kt{kotlin} [kotlin]
:::

After creating an addon, you need to [load it](#loading-addon).

## Loading an addon
On different platforms, you need to load it different ways. See below how to do it on the platform you're using.

### Spigot
Add `PlasmoVoice` to your `plugin.yml` dependencies:
::: code-group
```yaml [plugin.yml]
# ...
depend:
  - PlasmoVoice
```
:::

To load a Plasmo Voice addon in Spigot/Paper, you need to load it via server addons loader in JavaPlugin's `onLoad`:
::: code-group
<<< @/snippets/api/getting-started/bukkit.java [java]

<<< @/snippets/api/getting-started/bukkit.kt{kotlin} [kotlin]
:::

### Fabric
Add `plasmovoice` to your `fabric.mod.json` dependencies:
::: code-group
```json [fabric.mod.json]
{
    "depends": {
        "plasmovoice": ">=${version}"
    }
}
```
:::

To load a Plasmo Voice addon in Fabric, you need to load it via server addons loader in ModInitializer's `onInitialize`:
::: code-group
<<< @/snippets/api/getting-started/fabric.java [java]

<<< @/snippets/api/getting-started/fabric.kt{kotlin} [kotlin]
:::

### Forge
Add `plasmovoice` to your `mods.toml` dependencies:
::: code-group
```toml [mods.toml]
# ...
[[dependencies.forgemod]]
modId = "plasmovoice"
versionRange = "[${version},)"
ordering = "AFTER"
mandatory = true
```
:::

To load a Plasmo Voice addon in Forge, you need to load it via the server addons loader in mod class constructor:
::: code-group
<<< @/snippets/api/getting-started/forge.java [java]

<<< @/snippets/api/getting-started/forge.kt{kotlin} [kotlin]
:::

### BungeeCord
Add `PlasmoVoice` to your `plugin.yml` dependencies:
::: code-group
```yaml [plugin.yml]
# ...
depends:
  - PlasmoVoice
```
:::

To load a Plasmo Voice addon in BungeeCord, you need to load it via proxy addons loader in Plugin's `onLoad`:
::: code-group
<<< @/snippets/api/getting-started/bungee.java [java]

<<< @/snippets/api/getting-started/bungee.kt{kotlin} [kotlin]
:::

### Velocity
To load a Plasmo Voice addon in Velocity, you need to load it via proxy addons loader in `ProxyInitializeEvent`:
::: code-group
<<< @/snippets/api/getting-started/velocity.java [java]

<<< @/snippets/api/getting-started/velocity.kt{kotlin} [kotlin]
:::


[//]: # (## Project templates)

[//]: # ()
[//]: # (- Universal template)
