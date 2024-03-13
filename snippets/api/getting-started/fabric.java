package com.plasmovoice.fabricmod;

import su.plo.voice.api.server.PlasmoVoiceServer;

import net.fabricmc.api.ModInitializer;

public final class FabricMod implements ModInitializer {

    // Addon class annotated with @Addon.
    private final TestAddon addon = new TestAddon();

    @Override
    public void onInitialize() {
        PlasmoVoiceServer.getAddonsLoader().load(addon);
    }
}
