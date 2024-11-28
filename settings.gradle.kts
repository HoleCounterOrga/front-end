enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HoleCounter"
include(":androidApp")
include(":shared")
include(":shared:data")
include(":shared:domain")
include(":shared:presentation")
include(":shared:presentation:ui")
include(":shared:presentation:viewmodels")
include(":shared:data:user")
include(":shared:domain:user")
include(":shared:domain:authentication")
include(":shared:data:authentication")
include(":shared:core")
include(":shared:core:http")
