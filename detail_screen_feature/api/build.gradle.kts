plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multymodularity.detail_screen_feature.api"
}

dependencies {

    implementation(project(":core"))
    implementation(project(":core_network"))
    implementation(project(":ui_core"))
    implementation(libs.dagger)
    ksp(libs.daggerCompiler)
    implementation(libs.compose)
    implementation(libs.paging)
}