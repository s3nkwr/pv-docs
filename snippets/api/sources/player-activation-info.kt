val activation: ServerActivation = /* */
val source: ServerProximitySource<*> = /* */

activation.onPlayerActivation { player, packet ->
    source.sendAudioFrame(
        packet.data,
        packet.sequenceNumber,
        packet.distance,
        PlayerActivationInfo(player, packet)
    )

    ServerActivation.Result.HANDLED
}
