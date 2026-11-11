plugins {
    kotlin("jvm") version "1.9.24" apply false
}

// Keep generated files outside OneDrive, which can mark output directories read-only.
val oneDriveRoots = listOfNotNull(
    System.getenv("OneDrive"),
    System.getenv("OneDriveConsumer"),
    System.getenv("OneDriveCommercial")
).map { file(it).toPath().toAbsolutePath().normalize() }

if (oneDriveRoots.any { rootDir.toPath().toAbsolutePath().normalize().startsWith(it) }) {
    val projectKey = "${rootProject.name}-${Integer.toHexString(rootDir.absolutePath.hashCode())}"
    val localBuildRoot = gradle.gradleUserHomeDir.resolve("local-builds/$projectKey")
    allprojects {
        layout.buildDirectory.set(localBuildRoot.resolve(if (path == ":") "root" else path.drop(1).replace(':', '/')))
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }
}
