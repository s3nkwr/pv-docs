PlasmoVoiceServer voiceServer = /* */;
Object addon = /* */;

try (InputStream is = Files.newInputStream(new File("icon.png").toPath())) {
    ServerActivation activation = voiceServer.getActivationManager().createBuilder(
        addon,
        "priority", // name
        "pv.activation.priority", // translation key
        is, // icon
        "pv.activation.priority", // permission
        10 // weight
    ).build();
} catch (IOException e) {
    e.printStackTrace();
}
