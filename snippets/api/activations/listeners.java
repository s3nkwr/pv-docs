ServerActivation activation = /* */;

activation.onPlayerActivationStart(player -> {
    System.out.println(player + " start speaking to activation");
});

activation.onPlayerActivation((player, packet) -> {
    System.out.println(player + " is speaking to activation");

    // you need to return "HANDLED" if activation was handled successfully.
    // this will cancel PlayerSpeakEvent
    return ServerActivation.Result.HANDLED;
});

activation.onPlayerActivationEnd((player, packet) -> {
    System.out.println(player + " has finished speaking to activation");

    // you need to return "HANDLED" if activation was handled successfully.
    // this will cancel PlayerSpeakEndEvent
    return ServerActivation.Result.HANDLED;
});
