val voiceServer: PlasmoVoiceServer

val sourceLine = voiceServer.sourceLineManager
    .getLineByName("proximity")
    .orElseThrow { IllegalStateException("Proximity source line not found") }
