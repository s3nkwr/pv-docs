PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .getLineByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity source line not found"));

VoiceServerPlayer voicePlayer = voiceServer.getPlayerManager()
        .getPlayerByName("Apehum")
        .orElseThrow(() -> new IllegalStateException("Player not found"));

ServerPlayerSource source = sourceLine.createPlayerSource(voicePlayer, false);
