import gradle.kotlin.dsl.accessors._6c0d761444878b5ec19850c949c9c99c.allOpen
import gradle.kotlin.dsl.accessors._6c0d761444878b5ec19850c949c9c99c.java

plugins {
    id("chirp.spring-boot-service")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("jakarta.persistence.Embeddable")
}