repositories {
    maven {
        name = 'plasmoverse-releases'
        url = 'https://repo.plasmoverse.com/releases'
    }
    maven {
        name = 'plasmoverse-snapshots'
        url = 'https://repo.plasmoverse.com/snapshots'
    }
}

dependencies {
    compileOnly 'su.plo.voice.api:${api_module}:${version}'
}
