# Placoholder API

[PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) is a plugin for Spigot servers that allows server owners to display information from various plugins with a uniform format.

## Player placeholders

### %plasmovoice_hasVoiceChat%

`"true"` if the player is connected to the voice chat server

`"false"` otherwise

### %plasmovoice_muted%

`"true"` if the player is muted on the server

`"false"` otherwise

### %plasmovoice_microphoneMuted%

`"true"` if the player muted the microphone on the client

`"false"` otherwise

### %plasmovoice_voiceDisabled%

`"true"` if the player muted the voice chat audio on the client

`"false"` otherwise

## Other placeholders

### %plasmovoice_players%

The number of players with the mod installed

## Custom Placeholders

It's likely that you won't make use of the `"true"` or `"false"` values by themselves.

Instead, you want to use it to create a custom Placeholder using PAPI's Javascript addon.

This example shows you how to create an icon that will change depending on if the player has Plasmo Voice installed or not. 

> Credit to **anomouse** on Plasmo R&D Discord for making the tutorial, and **KPidS** for translating and editing.

![image](/docs/server/papi/example.png)

### 1. Download the Javascript extension for PlaceholderAPI

```
/papi ecloud download Javascript
/papi reload
```

### 2. Create a script

Go to `/plugins/PlaceholderAPI/javascripts/` and create a file called `check_voice.js`.

Paste this code into the file. You can also customize the icons.

```js
var placeholder = "%plasmovoice_installed%";
var voice = PlaceholderAPI.static.setPlaceholders(BukkitPlayer, placeholder);

var checkVoice = function (voice) {
  return voice === "true" ? " &a●&f | " : " &c●&f | ";
};

checkVoice(voice);
```

### 3. Import the script you created
Go to `/plugins/PlaceholderAPI/` folder and open `javascript_placeholders.yml` file

Scroll to the bottom of the file and add these lines:

```yml
check_voice:
  file: check_voice.js
```

### 4. Reload Placeholder API

```
/papi reload
```

### 5. Use the placeholder you created

```
%javascript_check_voice%
```
