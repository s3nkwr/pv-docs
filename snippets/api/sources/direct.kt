val voiceServer: PlasmoVoiceServer

val sourceLine = voiceServer.sourceLineManager
    .getLineByName("proximity")
    .orElseThrow { IllegalStateException("Proximity source line not found") }

val voicePlayer: VoicePlayer = voiceServer.playerManager
    .getPlayerByName("Apehum")
    .orElseThrow { IllegalStateException("Player not found") }

val source = sourceLine.createDirectSource(voicePlayer, false)
