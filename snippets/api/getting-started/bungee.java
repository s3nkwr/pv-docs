package com.plasmovoice.bungeeplugin;

import su.plo.voice.api.proxy.PlasmoVoiceProxy;

import net.md_5.bungee.api.plugin.Plugin;

public final class BungeePlugin extends Plugin {

    // Addon class annotated with @Addon.
    private final TestAddon addon = new TestAddon();

    @Override
    public void onLoad() {
        PlasmoVoiceProxy.getAddonsLoader().load(addon);
    }
}
