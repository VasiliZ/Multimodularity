plugins {
    `android-library`
}

apply<ProjectLibraryPlugin>()

android {
    namespace = "com.example.multimodularity.detail_screen_feature.impl"
}

dependencies {

    implementation("org.apache.httpcomponents:httpclient")
    constraints {
        implementation("org.apache.httpcomponents:httpclient:4.5.3")
        implementation("commons-codec:commons-codec:1.10")
    }

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