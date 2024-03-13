val voiceServer: PlasmoVoiceServer

val sourceLine = voiceServer.sourceLineManager
    .getLineByName("proximity")
    .orElseThrow { IllegalStateException("proximity source line not found") }

val voicePlayer = voiceServer.playerManager
    .getPlayerByName("Apehum")
    .orElseThrow { IllegalStateException("player not found") }

val source = sourceLine.createPlayerSource(voicePlayer, false)
