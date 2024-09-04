plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multimodularity.main_screen_feature.impl"
}

dependencies {

    implementation("org.apache.httpcomponents:httpclient:4.5.14")

    api(project(":main_screen_feature:api"))
    api(project(":detail_screen_feature:api"))
    implementation(project(":core"))
    implementation(project(":core_network"))
    implementation(project(":ui_core"))
    implementation(project(":data:impl"))
    implementation(libs.dagger)
    implementation(libs.compose)
    implementation(libs.paging)
    ksp(libs.daggerCompiler)
}