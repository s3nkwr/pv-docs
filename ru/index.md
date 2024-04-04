---
layout: home

hero:
  name: "Plasmo Voice"
  text: "Мод на голосовой чат в Minecraft"
  # tagline: ""
  image:
    src: /logo512.png
    alt: Plasmo Voice
  actions:
    - theme: brand
      text: Прочитать документацию
      link: /ru/docs/
    - theme: alt
      text: Поддержка в дискорде
      link: https://discord.com/invite/uueEqzwCJJ
---

<div class="vp-doc">

## Доступен для Paper, Fabric, Forge, Bungee, и Velocity
Серверы Paper, Fabric и Forge совместимы с клиентами Fabric и Forge.

Чтобы голосовой чат работал, игрокам необходимо установить на клиент мод Fabric или Forge. Игроки без мода могут присоединиться и играть как обычно.

![](/landing/compatability-chart.png)

*Предполагается, что Plasmo Voice установлен как на клиенте, так и на сервере*

## Особенности

![](/landing/hud-icons.png)

![](/landing/player-icons.png)

![](/landing/voice-settings.png)

<img src="/landing/visualise-distance.gif" width="1280px" />

<img src="/landing/rbm-scroll.gif" width="1280px" />

## Возможности мода

- **Шумоподавление RNNoise.**
- **Звуковой движок OpenAL, отличное позиционирование звука.**
- **Поддерджка [Sound Physics Remastered](https://modrinth.com/mod/sound-physics-remastered) с аддоном [pv-addon-soundphysics](https://modrinth.com/mod/pv-addon-soundphysics).**
- **Измените расстояние голосового чата.**
- **Дополнительная звукоизоляция.** Приглушает звук, если на пути стоят блоки.
- **Выбор устройств вывода и ввода.**
- **Выбор между Push to Talk и голосовой активацией.**
- **Дополнительные источники.** Делает источник звука тише, если игрок не смотрит прямо на вас.
- **Выбирайте положение значков графического интерфейса и настраивайте видимость значков плеера.**
- **Мут и изменение громкости игроков в социальном меню Minecraft.**
- **Удерживайте `ПКМ`, глядя на игрока, а затем используйте колесико прокрутки для изменения громкости.**
- **Поддержка Стерео.**
- **Оверлей похожий на Дискорде.**
- **Плавные регуляторы громкости.**

![](/landing/keybindings.png)

Проверьте настройки мода, нажав `V`. Убедитесь, что выбраны нужные устройства и работает микрофон.

## Возможности плагина

- **Кодек OPUS.** Высокое качество и низкий расход трафика.
- **Настраиваемое расстояние голоса.**
- **Серверный мут с помощью команд**
- **Возможность кикать игроков, у которых не установлен клиентский мод.**
- **Пермишены.**
- **Голосовой чат работает в одиночной игре и при использовании функции Open to LAN.**
- **Поддержка Placeholder API.**
- **Поддержка плагинов на Vanish.**
- **Поддержка Bungee и Velocity.**
- **Продвинутое API.**
- **Шифрование.**

## Серверные аддоны

Универсальные аддоны работают на Fabric, Forge и Paper.

Также прочтите: [Типы аддонов](https://plasmovoice.com/ru/docs/addons/types)

| Иконка                                                                                      | Ссылка                                                                         | Описание                                                                                                                                                                                                                                                                   |
|---------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [![](https://i.imgur.com/mKJDsiC.png)](https://modrinth.com/mod/pv-addon-groups/)           | [pv-addon-groups](https://modrinth.com/plugin/pv-addon-groups)                 | Создавайте групповые каналы голосового чата. Общайтесь с игроками на расстоянии.                                                                                                                                                                                           |
| [![](https://i.imgur.com/enqKs5d.png)](https://modrinth.com/mod/pv-addon-sculk)             | [pv-addon-sculk](https://modrinth.com/mod/pv-addon-sculk)                      | С помощью этого аддона Скалк сенсоры и Надзиратель активируются при разговорах в голосовом чате.                                                                                                                                                                           |
| [![](https://i.imgur.com/DZU7wrI.png)](https://modrinth.com/mod/pv-addon-broadcast)         | [pv-addon-broadcast](https://modrinth.com/mod/pv-addon-broadcast)              | Транслируйте свой голос всем игрокам в радиусе, мире, на сервере или прокси.                                                                                                                                                                                               |
| [![](https://i.imgur.com/tI24pN7.png)](https://modrinth.com/plugin/pv-addon-spectator)      | [pv-addon-spectator](https://modrinth.com/plugin/pv-addon-spectator)           | С помощью этого дополнения все игроки могут слышать спектаторов.                                                                                                                                                                                                           |
| [![](https://i.imgur.com/qswCndF.png)](https://modrinth.com/mod/pv-addon-whisper/)          | [pv-addon-whisper](https://modrinth.com/mod/pv-addon-whisper/)                 | По умолчанию шепот равен половине текущего расстояния голоса. Вы можете изменить процент в конфигурации.                                                                                                                                                                   |
| [![](https://i.imgur.com/lRQ0ZEY.png)](https://modrinth.com/mod/pv-addon-priority/)         | [pv-addon-priority](https://modrinth.com/mod/pv-addon-priority/)               | Трансляция голоса с большим и настраиваемым расстоянием.                                                                                                                                                                                                                   |
| [![](https://i.imgur.com/GNfK81A.png)](https://modrinth.com/plugin/pv-addon-lavaplayer-lib) | [pv-addon-lavaplayer-lib](https://modrinth.com/plugin/pv-addon-lavaplayer-lib) | Аддон с библиотекой LavaPlayer fork, необходимой для некоторых дополнений Plasmo Voice                                                                                                                                                                                     |
| [![](https://i.imgur.com/LB320On.png)](https://modrinth.com/plugin/pv-addon-discs)          | [pv-addon-discs](https://modrinth.com/plugin/pv-addon-discs)                   | Воспроизводите аудио из Youtube и других источников в Minecraft с помощью музыкальных дисков. <br/> Аддон может воспроизводить звук из различных источников вместо того, чтобы сохранять аудиофайлы на сервере. Он даже поддерживает прямые трансляции с YouTube и Twitch. |

## Аддоны для клиента

| Icon                                                                                    | Link                                                                      | Description                                                                                                                      |
|-----------------------------------------------------------------------------------------|---------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| [![](https://i.imgur.com/NjGmgGA.png)](https://modrinth.com/mod/pv-addon-soundphysics/) | [pv-addon-sound-physics](https://modrinth.com/mod/pv-addon-soundphysics/) | Add compatability with the Sound Physics Remastered mod. <br/> With this add-on, Plasmo Voice will be affected by Sound Physics. |
| [![](https://i.imgur.com/VTndchu.png)](https://modrinth.com/mod/pv-addon-replaymod/)    | [pv-addon-replaymod](https://modrinth.com/mod/pv-addon-replaymod/)        | A fork of Replay Voice Chat that works with Plasmo Voice allowing you to record voice chat with ReplayMod.                       |

## Скачать

- [Plasmo Voice на Modrinth](https://modrinth.com/mod/plasmo-voice)
- [Релизы на GitHub](https://github.com/plasmoapp/plasmo-voice/releases/)

## Документация
- [Документация](/ru/docs/)

## bStats

[![](https://bstats.org/signatures/bukkit/plasmovoice.svg)](https://bstats.org/plugin/bukkit/PlasmoVoice/10928)

## Credits
- Создано для [Plasmo](https://rp.plo.su)

</div>
