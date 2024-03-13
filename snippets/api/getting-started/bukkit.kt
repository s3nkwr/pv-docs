package com.plasmovoice.bukkitplugin

import su.plo.voice.api.server.PlasmoVoiceServer

import org.bukkit.plugin.java.JavaPlugin

class BukkitPlugin : JavaPlugin() {

    // Addon class annotated with @Addon.
    private val addon = TestAddon()

    override fun onLoad() {
        PlasmoVoiceServer.getAddonsLoader().load(addon)
    }
}
