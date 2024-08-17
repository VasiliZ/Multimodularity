plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multymodularity.detail_screen_feature.impl"
}

dependencies {


    implementation("com.google.firebase:firebase-auth:23.0.0")

    api(project(":detail_screen_feature:api"))
    implementation(project(":core"))
    implementation(project(":core_network"))
    implementation(project(":ui_core"))
    implementation(project(":data:impl"))
    implementation(libs.dagger)
    ksp(libs.daggerCompiler)
    implementation(libs.compose)
    implementation(libs.coroutines)
    implementation(libs.paging)


}