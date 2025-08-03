plugins {
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.multi.module.android.presentation.ui)
}

android {
    namespace = "com.example.main"
}

dependencies {
    implementation(projects.data)
    implementation(projects.domain)
    implementation(projects.feature.home)
    implementation(projects.designsystem)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}