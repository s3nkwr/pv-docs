package com.plasmovoice.velocityplugin;

import su.plo.voice.api.proxy.PlasmoVoiceProxy;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;

@Plugin(
        id = "velocityplugin",
        name = "VelocityPlugin",
        version = "1.0.0",
        authors = {"Plasmo"},
        dependencies = {
                @Dependency(id = "plasmovoice")
        }
)
public final class VelocityPlugin {

    // Addon class annotated with @Addon.
    private final TestAddon addon = new TestAddon();

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        PlasmoVoiceProxy.getAddonsLoader().load(addon);
    }
}
