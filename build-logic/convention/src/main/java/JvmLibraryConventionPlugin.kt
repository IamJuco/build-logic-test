import com.example.convention.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

/** 의존성이 없는 모듈용 (domain) */
class JvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJvm()
        }
    }
}