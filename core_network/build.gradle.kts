plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.core_network"
}

dependencies {

    implementation(project(":core"))
    implementation(libs.android)
    implementation(libs.dagger)
    implementation(libs.compose)
    implementation(libs.paging)
    implementation(libs.retrofit)
    ksp(libs.daggerCompiler)
}