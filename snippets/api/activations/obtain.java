PlasmoVoiceServer voiceServer = /* */;

ServerActivation activation = voiceServer.getActivationManager()
        .getActivationByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity activation not found"));
