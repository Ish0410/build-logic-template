plugins {
    id("imsh.android.library")
    id("imsh.android.hilt")
}

android {
    namespace = "com.imsh.core.designsystem"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}
