package com.plasmovoice.testaddon;

import su.plo.voice.api.addon.AddonInitializer;
import su.plo.voice.api.addon.InjectPlasmoVoice;
import su.plo.voice.api.addon.annotation.Addon;
import su.plo.voice.api.server.PlasmoVoiceServer;
import su.plo.voice.api.server.audio.capture.ProximityServerActivationHelper;
import su.plo.voice.api.server.audio.capture.ServerActivation;
import su.plo.voice.api.server.audio.line.ServerSourceLine;
import su.plo.voice.api.server.player.VoiceServerPlayer;
import su.plo.voice.proto.packets.tcp.serverbound.PlayerAudioEndPacket;
import su.plo.voice.proto.packets.udp.serverbound.PlayerAudioPacket;

@Addon(
        id = "pv-addon-test",
        name = "Test Addon",
        version = "1.0.0",
        authors = {"Plasmo"}
)
public final class TestAddon implements AddonInitializer {

    @InjectPlasmoVoice
    private PlasmoVoiceServer voiceServer;

    private ProximityServerActivationHelper proximityHelper;

    @Override
    public void onAddonInitialize() {
        ServerActivation activation = /* register or get activation */;
        ServerSourceLine sourceLine = /* register or get source line */;

        this.proximityHelper = new ProximityServerActivationHelper(
                voiceServer,
                activation,
                sourceLine,
                new TestDistanceSupplier()
        );
        proximityHelper.registerListeners(this);
    }

    @Override
    public void onAddonShutdown() {
        if (proximityHelper != null) {
            proximityHelper.unregisterListeners(this);
        }
    }

    private static class TestDistanceSupplier implements ProximityServerActivationHelper.DistanceSupplier {

        @Override
        public short getDistance(VoiceServerPlayer player, PlayerAudioEndPacket packet) {
            return 12;
        }

        @Override
        public short getDistance(VoiceServerPlayer player, PlayerAudioPacket packet) {
            return 12;
        }
    }
}
