import com.example.convention.addUILayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
/**화면이 있는 (feature: home, login 등) Compose를 사용한 모듈용*/
class AndroidPresentationUIConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("multi.module.android.library.compose")
            }

            dependencies {
                addUILayerDependencies(target)
            }
        }
    }
}