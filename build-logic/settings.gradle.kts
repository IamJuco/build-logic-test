dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
출처: https://dev-inventory.com/57 [개발자가 들려주는 IT 이야기:티스토리]

rootProject.name = "build-logic"