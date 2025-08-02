plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "multi.module.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "multi.module.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = "multi.module.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "multi.module.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidPresentationUI") {
            id = "multi.module.android.presentation.ui"
            implementationClass = "AndroidPresentationUIConventionPlugin"
        }

        register("jvmLibrary") {
            id = "multi.module.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
    }
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}

dependencies {
    // build-logic의 모든 플러그인은 컴파일에서만 실행됌
    compileOnly(libs.agp)
    compileOnly(libs.compose.compiler.extension)
    compileOnly(libs.kotlin.gradleplugin)
}