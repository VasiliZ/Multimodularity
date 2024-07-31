import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.core"
    compileSdk = 34
    buildFeatures.buildConfig = true
    defaultConfig {
        minSdk = 28
        val apiKey = gradleLocalProperties(rootDir).getProperty("apiKey")
        buildConfigField("String", "API_KEY", "\"${apiKey}\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versions.composeCompiler
    }

}

dependencies {

    implementation(libs.compose)
    implementation(libs.paging)
    implementation(libs.android)
    implementation(libs.dagger)
    ksp(libs.daggerCompiler)
}