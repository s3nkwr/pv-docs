package com.plasmovoice.fabricmod

import su.plo.voice.api.server.PlasmoVoiceServer

import net.fabricmc.api.ModInitializer

class FabricMod : ModInitializer {

    // Addon class annotated with @Addon.
    private val addon = TestAddon()

    override fun onInitialize() {
        PlasmoVoiceServer.getAddonsLoader().load(addon)
    }
}
