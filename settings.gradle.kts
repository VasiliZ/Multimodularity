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
include(":main_cat_screen")
include(":ui_core")
include(":cat_item_feature")
include(":cat_item_feature:api")
include(":cat_item_feature:impl")
