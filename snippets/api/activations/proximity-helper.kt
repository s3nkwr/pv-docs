package com.plasmovoice.testaddon

import su.plo.voice.api.addon.AddonInitializer
import su.plo.voice.api.addon.annotation.Addon
import su.plo.voice.api.addon.injectPlasmoVoice
import su.plo.voice.api.server.PlasmoVoiceServer
import su.plo.voice.api.server.audio.capture.ProximityServerActivationHelper
import su.plo.voice.api.server.audio.capture.ServerActivation
import su.plo.voice.api.server.audio.line.ServerSourceLine

@Addon(
    id = "pv-addon-test",
    name = "Test Addon",
    version = "1.0.0",
    authors = ["Plasmo"]
)
class TestAddon : AddonInitializer {

    private val voiceServer: PlasmoVoiceServer by injectPlasmoVoice()

    private var proximityHelper: ProximityServerActivationHelper? = null

    override fun onAddonInitialize() {
        val activation: ServerActivation = /* register or get activation */
        val sourceLine: ServerSourceLine = /* register or get source line */

        proximityHelper = ProximityServerActivationHelper(voiceServer, activation, sourceLine)
            .also { it.registerListeners(this) }
    }

    override fun onAddonShutdown() {
        proximityHelper?.unregisterListeners(this)
    }
}
