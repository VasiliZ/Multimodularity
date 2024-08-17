import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.accessors.runtime.addDependencyTo

class ProjectLibraryPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        applyPlugins(project = project)
        setProjectConfig(project = project)
    }

    private fun applyPlugins(project: Project) {
        project.apply {
            plugin("com.google.devtools.ksp")
            plugin("com.android.library")
            plugin("org.jetbrains.kotlin.android")
        }
    }

    private fun setProjectConfig(project: Project) {
        project.android().apply {
            compileSdk = 34

            defaultConfig {
                minSdk = 28

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                consumerProguardFiles("consumer-rules.pro")
            }

            buildTypes {
                release {
                    isMinifyEnabled = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }
            }
            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
            buildFeatures {
                compose = true
                buildConfig = true
            }
            composeOptions {
                kotlinCompilerExtensionVersion = versions.composeCompiler
            }
        }
    }

    private fun Project.android(): LibraryExtension {
        return extensions.getByType(LibraryExtension::class.java)
    }
}