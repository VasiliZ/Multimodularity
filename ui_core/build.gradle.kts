plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multymodularity.ui_core"
}

android {
    namespace = "com.example.multymodularity.ui_core"
}

dependencies {

    implementation(libs.android)
    implementation(libs.compose)
}