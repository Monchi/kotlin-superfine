plugins {
    id("org.jetbrains.kotlin.js") version "1.3.41"
    id("com.jfrog.bintray") version "1.8.4" apply false
}

allprojects {
    group = rootProject.group
    version = rootProject.version
}