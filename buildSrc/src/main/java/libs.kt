@file:Suppress("ClassName")

object versions {
    const val core = "1.12.0"
    const val lifecycle = "2.7.0"
    const val coroutines = "1.8.1"
    const val composeCompiler = "1.5.14"
    const val compose = "1.7.0-beta06"
    const val dagger = "2.48"
    const val retrofit = "2.9.0"
    const val material3Compose = "1.2.1"
    const val gson = "2.10.1"
    const val gsonConverter = "2.11.0"
    const val httpClient = "4.5.14"
    const val paging = "3.3.1"
}

object libs {
    val android = listOf(
        "androidx.core:core-ktx:${versions.core}",
        "androidx.lifecycle:lifecycle-runtime-ktx:${versions.lifecycle}"
    )
    val compose = listOf(
        "androidx.compose.material3:material3:${versions.material3Compose}",
        "androidx.compose.ui:ui:${versions.compose}",
        "androidx.compose.material:material:${versions.compose}",
        "androidx.compose.ui:ui-tooling-preview:${versions.compose}",
        "androidx.activity:activity-compose:1.8.2",
        "androidx.navigation:navigation-compose:2.7.7",
        "io.coil-kt:coil-compose:2.7.0"
    )

    const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${versions.coroutines}"

    const val dagger =
        "com.google.dagger:dagger:${versions.dagger}"

    const val daggerCompiler =
        "com.google.dagger:dagger-compiler:${versions.dagger}"

    val retrofit = listOf(
        "com.squareup.retrofit2:retrofit:${versions.retrofit}",
        "com.squareup.retrofit2:converter-gson:${versions.gsonConverter}",
        "com.google.code.gson:gson:${versions.gson}",
        "org.apache.httpcomponents:httpclient:${versions.httpClient}",
        "com.squareup.okhttp3:logging-interceptor:4.10.0",
    )
    val paging = listOf(
        "androidx.paging:paging-common:${versions.paging}",
        "androidx.paging:paging-compose:${versions.paging}"
    )
}