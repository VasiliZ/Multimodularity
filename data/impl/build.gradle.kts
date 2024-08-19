plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()
android {
    namespace = "com.example.multimodularity.data.impl"
}

dependencies {
    implementation(project(":core_network"))
    implementation(libs.android)
    implementation(libs.dagger)
    implementation(libs.compose)
    implementation(libs.paging)
    implementation(libs.retrofit)
    ksp(libs.daggerCompiler)
}