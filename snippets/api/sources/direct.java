PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .getLineByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity source line not found"));

VoicePlayer voicePlayer = voiceServer.getPlayerManager()
        .getPlayerByName("Apehum")
        .orElseThrow(() -> new IllegalStateException("Player not found"));

ServerDirectSource source = sourceLine.createDirectSource(voicePlayer, false);
