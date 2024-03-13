PlasmoVoiceServer voiceServer = /* */;
Object addon = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager().createBuilder(
    addon,
    "priority", // name
    "pv.activation.priority", // translation key
    "plasmovoice:textures/icons/speaker_priority.png", // icon resource location
    10 // weight
).build();
