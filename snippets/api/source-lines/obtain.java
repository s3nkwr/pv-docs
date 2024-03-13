PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .getLineByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity source line not found"));
