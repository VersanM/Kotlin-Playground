plugins {
    id("java-library")
    id("chirp.kotlin-common")
}

group = "com.stavrom"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    api(libs.kotlin.reflect)
    api(libs.jackson.module.kotlin)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}