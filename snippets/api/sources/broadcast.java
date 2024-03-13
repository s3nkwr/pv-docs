PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .getLineByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity source line not found"));

ServerBroadcastSource source = sourceLine.createBroadcastSource(false);

// Set "listeners" for broadcast source
VoicePlayer player = voiceServer.getPlayerManager()
    .getPlayerByName("Apehum")
    .orElseThrow(() -> new IllegalStateException("Player not found"));
Set<VoicePlayer> players = new HashSet<>();
players.add(player);
source.setPlayers(players);
