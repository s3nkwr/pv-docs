PlasmoVoiceServer voiceServer = /* */;

ServerSourceLine sourceLine = voiceServer.getSourceLineManager()
        .getLineByName("proximity")
        .orElseThrow(() -> new IllegalStateException("Proximity source line not found"));

McServerWorld world = voiceServer.getMinecraftServer()
        .getWorlds()
        .stream()
        .filter(w -> w.getName().equals("world"))
        .findAny()
        .orElseThrow(() -> new IllegalStateException("World not found"));

ServerPos3d position = new ServerPos3d(world, 0.0D, 64.0D, 0.0D);
ServerStaticSource source = sourceLine.createStaticSource(position, false);

// You can also change the source position after it has been created:
ServerPos3d newPosition = new ServerPos3d(world, 10.0D, 64.0D, 0.0D);
source.setPosition(newPosition);
