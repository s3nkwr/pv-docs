ServerActivation activation = /* ... */;
ServerProximitySource<?> source = /* ... */;

activation.onPlayerActivation((player, packet) -> {
    source.sendAudioFrame(
        packet.getData(),
        packet.getSequenceNumber(),
        packet.getDistance(),
        new PlayerActivationInfo(player, packet)
    );

    return ServerActivation.Result.HANDLED;
});
