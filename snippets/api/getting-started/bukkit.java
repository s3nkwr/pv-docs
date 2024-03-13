package com.plasmovoice.bukkitplugin;

import su.plo.voice.api.server.PlasmoVoiceServer;

import org.bukkit.plugin.java.JavaPlugin;

public final class BukkitPlugin extends JavaPlugin {

    // Addon class annotated with @Addon.
    private final TestAddon addon = new TestAddon();

    @Override
    public void onLoad() {
        PlasmoVoiceServer.getAddonsLoader().load(addon);
    }
}
