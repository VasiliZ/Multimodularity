plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multimodularity.ui_core"
}

dependencies {
    implementation(libs.android)
    implementation(libs.compose)
}