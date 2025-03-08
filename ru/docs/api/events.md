---
outline: deep
---

# Events
Plasmo Voice has its own event system, allowing it to function on various platforms.

## Registering event handlers

To register event handlers, you need to create addon first, how to do it see [Creating an addon](/docs/api/#creating-an-addon).

You can register or unregister event handlers at any time you want.

There are two ways to register event handlers:

### `@EventSubscribe`

::: code-group
<<< @/snippets/api/events/event-subscribe.java [java]
<<< @/snippets/api/events/event-subscribe.kt{kotlin} [kotlin]
:::

You can also use `@EventSubscribe` in your addon class.
Using it this way doesn't require registering an event handler in the event bus,
as the addon class is registered by default.

::: code-group
<<< @/snippets/api/events/event-subscribe-addon.java [java]
<<< @/snippets/api/events/event-subscribe-addon.kt{kotlin} [kotlin]
:::

### Method as event handler

::: code-group
<<< @/snippets/api/events/method-handler.java [java]
<<< @/snippets/api/events/method-handler.kt{kotlin} [kotlin]
:::

## List of events
You can see all available events in [dokka](https://dokka.plasmovoice.com),
which can be found in the `su.plo.voice.api.{module}.event.*` packages.
