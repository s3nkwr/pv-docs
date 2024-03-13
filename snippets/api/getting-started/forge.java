package com.plasmovoice.forgemod;

import su.plo.voice.api.server.PlasmoVoiceServer;

import net.minecraftforge.fml.common.Mod;

@Mod("forgemod")
public final class ForgeMod {

    // Addon class annotated with @Addon.
    private final TestAddon addon = new TestAddon();

    public ForgeMod() {
        PlasmoVoiceServer.getAddonsLoader().load(addon);
    }
}
