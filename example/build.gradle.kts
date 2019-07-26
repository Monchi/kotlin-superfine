import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("org.jetbrains.kotlin.js")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":kotlin-superfine"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.0-RC")
}

kotlin.target.browser {
    configure<SourceSetContainer> {
        tasks.withType<Kotlin2JsCompile> {
            kotlinOptions {
                sourceMap = true
                moduleKind = "commonjs"
                metaInfo = true
            }
        }
    }
}

tasks.build {
    dependsOn(tasks.findByPath(":kotlin-superfine:build"))
}
