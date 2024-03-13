val voiceServer: PlasmoVoiceServer

val activation = voiceServer.activationManager
    .getActivationByName("proximity")
    .orElseThrow { IllegalStateException("Proximity activation not found") }
