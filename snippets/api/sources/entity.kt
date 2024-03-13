val voiceServer: PlasmoVoiceServer

val sourceLine = voiceServer.sourceLineManager
    .getLineByName("proximity")
    .orElseThrow { IllegalStateException("Proximity source line not found") }

val platformEntity: Any = /* platform-specific entity instance, e.g org.bukkit.entity.Entity */
val entity = voiceServer.minecraftServer.getEntityByInstance(platformEntity)

val source = sourceLine.createEntitySource(entity, false)
