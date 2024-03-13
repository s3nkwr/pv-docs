PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .createBuilder(/*...*/)
        .withPlayers(true)
        .build();

VoicePlayer player = /* voice player */;

ServerPlayerSetManager playerSetManager = sourceLine.getPlayerSetManager();
ServerPlayerSet broadcastSet = playerSetManager.createBroadcastSet();
broadcastSet.addPlayer(player);

// sets the broadcast player set to the player
playerSetManager.setPlayerSet(player, broadcastSet);
