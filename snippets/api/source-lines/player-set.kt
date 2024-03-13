val voiceServer: PlasmoVoiceServer

val sourceLine: ServerSourceLine = voiceServer.sourceLineManager
    .createBuilder(/* */)
    .withPlayers(true)
    .build()

val player: VoicePlayer /* voice player */

val playerSetManager = sourceLine.playerSetManager
val broadcastSet = playerSetManager.createBroadcastSet()
broadcastSet.addPlayer(player)

// sets the broadcast player set to the player
playerSetManager.setPlayerSet(player, broadcastSet)
