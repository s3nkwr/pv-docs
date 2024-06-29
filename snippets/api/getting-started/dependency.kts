repositories {
    maven("https://repo.plasmoverse.com/releases")
    maven("https://repo.plasmoverse.com/snapshots")
}

dependencies {
    compileOnly("su.plo.voice.api:${api_module}:${version}")
}
