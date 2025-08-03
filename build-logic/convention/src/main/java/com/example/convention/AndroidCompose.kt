package com.example.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
/** 컴포즈관련 빌드 로직 */
internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.run {
        buildFeatures {
            compose = true
        }

        composeOptions {
//            // 코틀린 2.0 부터는 명시를 하지 않아도됌
//            kotlinCompilerExtensionVersion = libs.findVersion("kotlin.compose").get().toString()
        }

        dependencies {
            val bom = libs.findLibrary("androidx.compose.bom").get()
            add("implementation", platform(bom))
            add("androidTestImplementation", platform(bom))
            add("debugImplementation", libs.findLibrary("androidx.ui.tooling.preview").get())
        }

    }
}