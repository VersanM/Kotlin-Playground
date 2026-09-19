plugins {
    id("java-library")
    id("chirp.spring-boot-service")
    kotlin("plugin.jpa")
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
    implementation(projects.common)

    implementation(libs.spring.boot.starter.security)
    implementation(libs.spring.boot.starter.validation)

    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}