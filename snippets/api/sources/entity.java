PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .getLineByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity source line not found"));

Object platformEntity = /* platform-specific entity instance, e.g org.bukkit.entity.Entity */;
McServerEntity entity = voiceServer.getMinecraftServer().getEntityByInstance(platformEntity);

ServerEntitySource source = sourceLine.createEntitySource(entity, false);
