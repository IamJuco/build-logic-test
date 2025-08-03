plugins {
    alias(libs.plugins.multi.module.android.presentation.ui)
}

android {
    namespace = "com.example.home"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)
    implementation(projects.designsystem)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}