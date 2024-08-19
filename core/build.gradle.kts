import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multimodularity.core"
    defaultConfig {
        val apiKey = gradleLocalProperties(rootDir).getProperty("apiKey")
        buildConfigField("String", "API_KEY", "\"${apiKey}\"")
    }
}

dependencies {

    implementation(libs.compose)
    implementation(libs.paging)
    implementation(libs.android)
    implementation(libs.dagger)
    ksp(libs.daggerCompiler)
}