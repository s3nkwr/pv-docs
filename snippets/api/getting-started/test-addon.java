package com.plasmovoice.testaddon;

import su.plo.voice.api.addon.AddonInitializer;
import su.plo.voice.api.addon.InjectPlasmoVoice;
import su.plo.voice.api.addon.annotation.Addon;
import su.plo.voice.api.server.PlasmoVoiceServer;

@Addon(
        // An addon id must start with a lowercase letter and may contain only lowercase letters, digits, hyphens, and underscores.
        // It should be between 4 and 32 characters long.
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
        // voiceServer is initialized now

        System.out.println("Addon initialized");
    }

    @Override
    public void onAddonShutdown() {
        System.out.println("Addon shut down");
    }
}
