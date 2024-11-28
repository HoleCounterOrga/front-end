plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
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
            baseName = "viewmodels"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            api(libs.koin.core)
            implementation(libs.koin.compose)
            implementation(libs.koin.composeVM)

            implementation(project(":shared:core:http"))
            implementation(project(":shared:data:authentication"))
            implementation(project(":shared:data:targets"))
            implementation(project(":shared:domain:authentication"))
        }

        androidMain.dependencies {
            implementation(libs.koin.android)
            implementation(libs.koin.androidx.compose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.hole.counter.viewmodels"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
