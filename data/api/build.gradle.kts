plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multymodularity.data.api"
}

dependencies {

    implementation(libs.android)
    implementation(libs.dagger)
    implementation(libs.compose)
    implementation(libs.paging)
    implementation(libs.retrofit)
}