# Placeholder API

[PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) is a plugin for Spigot servers that allows server owners to display information from various plugins with a uniform format.

## Плейсхолдеры игрока

### %plasmovoice_hasVoiceChat%

`"true"` если игрок подключен к войс серверу

`"false"` в любых других случаях

### %plasmovoice_muted%

`"true"` если игрок замучен на сервере

`"false"` в любых других случаях

### %plasmovoice_microphoneMuted%

`"true"` если игрок отключил микрофон на клиенте

`"false"` в любых других случаях

### %plasmovoice_voiceDisabled%

`"true"` если игрок отключил звук голосового чата на клиенте

`"false"` в любых других случаях

## Другие плейсхолдеры

### %plasmovoice_players%

Количество игроков, у которых установлен мод

## Кастомные плейсхолдеры (JS)

Скорее всего, вы не будете использовать значения `"true"` или `"false"` сами по себе.

Вместо этого вы захотите использовать их для создания своего Плейсхолдера с помощью Javascript-аддона PAPI.

В этом примере показано, как создать значок, который будет меняться в зависимости от того, установлен ли в плеере Plasmo Voice или нет.

> Спасибо **anomouse** в Plasmo R&D Discord за туториал, и **KPidS** за перевод и редактирование.

![image](/docs/server/papi/example.png)

### 1. Загрузите расширение Javascript для PlaceholderAPI

```
/papi ecloud download Javascript
/papi reload
```

### 2. Создайте скрипт

Перейдите в раздел `/plugins/PlaceholderAPI/javascripts/` и создайте файл `check_voice.js`.

Вставьте этот код в файл. Вы также можете настроить иконки.

```js
var placeholder = "%plasmovoice_installed%";
var voice = PlaceholderAPI.static.setPlaceholders(BukkitPlayer, placeholder);

var checkVoice = function (voice) {
  return voice === "true" ? " &a●&f | " : " &c●&f | ";
};

checkVoice(voice);
```

### 3. Импортируйте созданный вами скрипт

Перейдите в папку `/plugins/PlaceholderAPI/` и откройте файл `javascript_placeholders.yml`.

Прокрутите файл до самого низа и добавьте эти строки:

```yml
check_voice:
  file: check_voice.js
```

### 4. Перезагрузите Placeholder API

```
/papi reload
```

### 5. Используйте плейсхолдер

```
%javascript_check_voice%
```

## Кастомные плейсхолдеры (TAB)

Есть способ сделать все легче через плагин TAB.

### 1. Найти строчку 

Для начала надо найти строчку `placeholder-output-replacements`.

### 2. Вставить конфиг

*TODO: Сделать больше текста*

```yml
placeholder-output-replacements:
  "%plasmovoice_installed%":
    "true": " &a●&f | "
    "false": " &c●&f | "
```

### 3. Перезагрузить TAB

```js
/tab reload
```

### 4. Используйте плейсхолдер

В самом TAB можно использовать `%plasmovoice_installed%`. Просто вставьте его в конфиг TAB.

Для всех других плагинов он будет таким:

```
%tab_replace_plasmovoice_installed%
```
