package com.plasmovoice.testaddon

import su.plo.voice.api.addon.AddonInitializer
import su.plo.voice.api.addon.annotation.Addon
import su.plo.voice.api.addon.injectPlasmoVoice
import su.plo.voice.api.server.PlasmoVoiceServer
import su.plo.voice.api.server.audio.capture.ProximityServerActivationHelper
import su.plo.voice.api.server.audio.capture.ProximityServerActivationHelper.DistanceSupplier
import su.plo.voice.api.server.audio.capture.ServerActivation
import su.plo.voice.api.server.audio.line.ServerSourceLine
import su.plo.voice.api.server.player.VoiceServerPlayer
import su.plo.voice.proto.packets.tcp.serverbound.PlayerAudioEndPacket
import su.plo.voice.proto.packets.udp.serverbound.PlayerAudioPacket

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
        val activation: ServerActivation /* register or get activation */
        val sourceLine: ServerSourceLine /* register or get source line */

        proximityHelper = ProximityServerActivationHelper(
            voiceServer,
            activation,
            sourceLine,
            TestDistanceSupplier()
        )
        proximityHelper!!.registerListeners(this)
    }

    override fun onAddonShutdown() {
        if (proximityHelper != null) {
            proximityHelper!!.unregisterListeners(this)
        }
    }

    private class TestDistanceSupplier : DistanceSupplier {

        override fun getDistance(player: VoiceServerPlayer, packet: PlayerAudioEndPacket): Short {
            return 12
        }

        override fun getDistance(player: VoiceServerPlayer, packet: PlayerAudioPacket): Short {
            return 12
        }
    }
}
