val voiceServer: PlasmoVoiceServer
val addon: Any

val activation = Files.newInputStream(File("icon.png").toPath()).use { icon ->
    voiceServer.activationManager.createBuilder(
        this,
        "priority", // name
        "pv.activation.priority", // translation key
        icon, // icon
        "pv.activation.priority", // permission
        10 // weight
    ).build()
}
