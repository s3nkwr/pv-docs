package com.plasmovoice.testaddon;

import su.plo.voice.api.addon.AddonInitializer;
import su.plo.voice.api.addon.InjectPlasmoVoice;
import su.plo.voice.api.addon.annotation.Addon;
import su.plo.voice.api.event.EventPriority;
import su.plo.voice.api.server.PlasmoVoiceServer;
import su.plo.voice.api.server.event.connection.UdpClientConnectEvent;

@Addon(
        id = "pv-addon-test",
        name = "Test Addon",
        version = "1.0.0",
        authors = {"Plasmo"}
)
public final class TestAddon implements AddonInitializer {

    @InjectPlasmoVoice
    private PlasmoVoiceServer voiceServer;

    @Override
    public void onAddonInitialize() {
        voiceServer.getEventBus().register(
                this,
                UdpClientConnectEvent.class,
                EventPriority.NORMAL,
                this::onClientConnected
        );
    }

    private void onClientConnected(UdpClientConnectEvent event) {
        System.out.println(
                event.getConnection().getPlayer() + " connected to UDP"
        );
    }
}
