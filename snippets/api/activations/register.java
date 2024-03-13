PlasmoVoiceServer voiceServer = /* */;
Object addon = /* */;

ServerActivation activation = voiceServer.getActivationManager().createBuilder(
    addon,
    "priority", // name
    "pv.activation.priority", // translation key
    "plasmovoice:textures/icons/microphone_priority.png", // icon resource location
    "pv.activation.priority", // permission
    10 // weight
).build();
