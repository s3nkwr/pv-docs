---
outline: deep
---
# Languages

## Registering languages
First, create a folder in resources to store languages. 
Then, add the language named using the [Minecraft "In-game Locale Code"](https://minecraft.wiki/w/Language) in TOML format and a 'list' file with all available languages: 
:::code-group
```txt [file structure]
- resources
  - test
    - en_us.toml
    - list
```

```toml [en_us.toml]
[server]
addon.test.pepega = "Pepega"

[client]
addon.test.pepega = "Pepega"
```

```txt [list]
en_us
```
:::

After creating all the necessary files, register the languages using the API:

:::code-group
```java
PlasmoVoiceServer voiceServer = /**/;
File addonFolder = new File(voiceServer.getMinecraftServer().getConfigsFolder(), "pv-addon-test");

voiceServer.getLanguages().register(
        this::getLanguageResource,
        new File(addonFolder, "languages") // folder where to store languages
);

// create this method somewhere in your class or use the ResourceLoader interface, implementing it with the same logic
private InputStream getLanguageResource(String resourcePath) throws IOException {
    return getClass().getClassLoader().getResourceAsStream(String.format("test/%s", resourcePath));
}
```
:::

## Server languages
Server-side languages are automatically translating translatable component on server based on player language.

It also supports [Adventure GlobalTranslator](https://jd.advntr.dev/api/4.14.0/net/kyori/adventure/translation/GlobalTranslator.html),
so if you platform supports Adventure, translations will be added to `GlobalTranslator`.

To add translations, insert your translation into `language_code.toml` within the `[server]` block:

:::code-group
```toml [en_us.toml]
[server]
addon.test.pepega = "Pepega"
```
:::

### Sending
You don't need to add the `server` prefix when sending the text component.

If your platform supports `Adventure`, you can simply use `Component.translatable` to create a translatable component and send it to the audience:

:::code-group
```java
Audience audience = /**/;

Component component = Component.translatable("addon.test.pepega");

audience.sendMessage(component);
```
:::

Otherwise, you need to use a universal player to send the translatable:
:::code-group
```java
VoiceServerPlayer voicePlayer = /**/;
McServerPlayer serverPlayer = voiceServerPlayer.getInstance();

McTextComponent component = McTextComponent.translatable("addon.test.pepega");

serverPlayer.sendMessage(component);
```
:::

## Client languages
Client languages will be sent to the Plasmo Voice client with a config packet and on a client language change.

These client languages are used exclusively inside Plasmo Voice for [Activations](/docs/api/activations) and [Source Lines](/docs/api/source-lines).

To add translations, insert your translation into `language_code.toml` within the `[client]` block:

:::code-group
```toml [en_us.toml]
[client]
addon.test.pepega = "Pepega"
```
:::
