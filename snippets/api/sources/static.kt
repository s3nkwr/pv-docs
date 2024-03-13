val voiceServer: PlasmoVoiceServer

val sourceLine = voiceServer.sourceLineManager
    .getLineByName("proximity")
    .orElseThrow { IllegalStateException("Proximity source line not found") }

val world = voiceServer.minecraftServer.worlds
    .find { it.name == "world" }
    ?: throw IllegalStateException("World not found")

val position = ServerPos3d(world, 0.0, 64.0, 0.0)
val source = sourceLine.createStaticSource(position, false)

// You can also change the source position after it has been created:
val newPosition = ServerPos3d(world, 10.0, 64.0, 0.0)
source.position = newPosition
