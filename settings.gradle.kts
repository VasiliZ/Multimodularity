pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Multimodularity"
include(":app")
include(":core")
include(":core_network")
include(":ui_core")
include(":main_screen_feature")
include(":main_screen_feature:api")
include(":main_screen_feature:impl")
include(":detail_screen_feature")
include(":detail_screen_feature:api")
include(":detail_screen_feature:impl")
