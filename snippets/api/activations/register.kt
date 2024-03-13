val voiceServer: PlasmoVoiceServer
val addon: Any

val activation = voiceServer.activationManager.createBuilder(
    addon,
    "priority", // name
    "pv.activation.priority", // translation key
    "plasmovoice:textures/icons/microphone_priority.png", // icon resource location
    "pv.activation.priority", // permission
    10 // weight
).build()
