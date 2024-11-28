plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.ktorfit)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "http"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.koin.core)
            implementation(libs.ktor.client.core)
            implementation(libs.ktorfit.lib)

            implementation("io.ktor:ktor-client-content-negotiation:3.0.0") // Ajouté pour la négociation de contenu
            implementation("io.ktor:ktor-serialization-kotlinx-json:3.0.0") // Pour la sérialisation JSON
        }
        androidMain.dependencies {
            implementation(libs.ktor.client.okhttp)

        }
        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.hole.counter.core.http"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
