val voiceServer: PlasmoVoiceServer

val sourceLine = voiceServer.sourceLineManager
    .getLineByName("proximity")
    .orElseThrow { IllegalStateException("Proximity source line not found") }

val source = sourceLine.createBroadcastSource(false)

val player = voiceServer.playerManager
    .getPlayerByName("Apehum")
    .orElseThrow { IllegalStateException("Player not found") }

val players: MutableSet<VoicePlayer> = HashSet()
players.add(player)
source.players = players
