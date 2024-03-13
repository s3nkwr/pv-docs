package com.plasmovoice.forgemod

import su.plo.voice.api.server.PlasmoVoiceServer

import net.minecraftforge.fml.common.Mod

@Mod("forgemod")
class ForgeMod {

    // Addon class annotated with @Addon.
    private val addon = TestAddon()

    init {
        PlasmoVoiceServer.getAddonsLoader().load(addon)
    }
}
