val activation: ServerActivation = /* */;

activation.onPlayerActivationStart { player ->
    println("$player start speaking to activation")
}

activation.onPlayerActivation { player, packet ->
    println("$player is speaking to activation")

    ServerActivation.Result.HANDLED
}

activation.onPlayerActivationEnd { player, packet ->
    println("$player has finished speaking to activation")

    ServerActivation.Result.HANDLED
}
