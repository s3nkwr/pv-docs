package com.plasmovoice.testaddon

import su.plo.voice.api.addon.AddonInitializer
import su.plo.voice.api.addon.annotation.Addon
import su.plo.voice.api.addon.injectPlasmoVoice
import su.plo.voice.api.event.EventPriority
import su.plo.voice.api.server.PlasmoVoiceServer
import su.plo.voice.api.server.event.connection.UdpClientConnectEvent

@Addon(
    id = "pv-addon-test",
    name = "Test Addon",
    version = "1.0.0",
    authors = ["Plasmo"]
)
class TestAddon : AddonInitializer {

    private val voiceServer: PlasmoVoiceServer by injectPlasmoVoice()

    override fun onAddonInitialize() {
        voiceServer.eventBus.register(
            this,
            UdpClientConnectEvent::class.java,
            EventPriority.NORMAL,
            ::onClientConnected
        )
    }

    private fun onClientConnected(event: UdpClientConnectEvent) {
        println("${event.connection.player} connected to UDP")
    }
}
