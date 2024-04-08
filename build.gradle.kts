buildscript {
    repositories {
        google()
        mavenCentral()
        // other repositories
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.0.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10") // Use a compatible Kotlin version, such as 1.6.10
        // other dependencies
    }
}

tasks.register("clean") {
    doLast {
        delete(rootProject.buildDir)
    }
}
