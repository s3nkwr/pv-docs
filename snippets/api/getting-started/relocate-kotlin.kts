plugins {
    kotlin("jvm") version "1.8.20"
    id("com.github.johnrengelman.shadow") version("7.1.0")
}

tasks.shadowJar {
    relocate("kotlin", "su.plo.voice.libs.kotlin")
    relocate("kotlinx.coroutines", "su.plo.voice.libs.kotlinx.coroutines")
    relocate("kotlinx.serialization", "su.plo.voice.libs.kotlinx.serialization")
}
