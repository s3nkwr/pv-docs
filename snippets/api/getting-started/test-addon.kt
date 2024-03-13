package com.plasmovoice.testaddon

import su.plo.voice.api.addon.AddonInitializer
import su.plo.voice.api.addon.annotation.Addon
import su.plo.voice.api.addon.injectPlasmoVoice
import su.plo.voice.api.server.PlasmoVoiceServer

@Addon(
        // An addon id must start with a lowercase letter and may contain only lowercase letters, digits, hyphens, and underscores.
        // It should be between 4 and 32 characters long.
        id = "pv-addon-helloworld",
        name = "Hello World Add-on",
        version = "1.0.0",
        authors = ["Plasmo"]
)
class TestAddon : AddonInitializer {

    private val voiceServer: PlasmoVoiceServer by injectPlasmoVoice()
    // or
    // @InjectPlasmoVoice
    // private lateinit var voiceServer: PlasmoVoiceServer

    override fun onAddonInitialize() {
        // voiceServer is initialized now

        println("Addon initialized")
    }

    override fun onAddonShutdown() {
        println("Addon shut down")
    }
}
