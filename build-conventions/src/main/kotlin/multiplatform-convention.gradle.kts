plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    jvmToolchain(21)

    explicitApi = ExplicitApiMode.Strict
}
