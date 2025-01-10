plugins {
    id("imsh.android.library")
    id("imsh.android.hilt")
}

android {
    namespace = "com.imsh.core.database"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
}
