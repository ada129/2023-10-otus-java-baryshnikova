import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id ("com.github.johnrengelman.shadow")
}

group = "ru.otus"
version = "1.0-SNAPSHOT"

dependencies {
    implementation ("com.google.guava:guava")
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("gradleHelloWorld")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        manifest {
            attributes(mapOf("Main-Class" to "ru.otus.HelloOtus"))
        }
    }
    build {
        dependsOn(shadowJar)
    }
}