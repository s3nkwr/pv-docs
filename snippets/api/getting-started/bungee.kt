package com.plasmovoice.bungeeplugin

import su.plo.voice.api.proxy.PlasmoVoiceProxy

import net.md_5.bungee.api.plugin.Plugin

class BungeePlugin : Plugin() {

    // Addon class annotated with @Addon.
    private val addon = TestAddon()

    override fun onLoad() {
        PlasmoVoiceProxy.getAddonsLoader().load(addon)
    }
}
