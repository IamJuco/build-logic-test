plugins {
    `kotlin-dsl`
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("com.android.tools.build:gradle:8.11.1")
    implementation(kotlin("gradle-plugin", version = "1.9.10"))
}