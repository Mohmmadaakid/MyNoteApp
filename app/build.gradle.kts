plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id ("kotlin-kapt")
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.example.aakidnoteapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.aakidnoteapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding=true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    val nav_version = "2.7.7"
    val room_version = "2.6.1"
    val lifecycle_version = "2.3.1"

    implementation("androidx.fragment:fragment-ktx:1.6.2-alpha10")
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")


    implementation ("com.google.android.material:material:1.11.0")


    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4")



    implementation ("androidx.room:room-runtime:$room_version")
    kapt ("androidx.room:room-compiler:$room_version")

    implementation ("androidx.lifecycle:lifecycle-common-java8:2.7.0")



    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
//
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
//
//    // RecyclerView Animator
    implementation ("jp.wasabeef:recyclerview-animators:4.0.2")
//
//    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
//
//
//    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")





    implementation ("io.github.yahiaangelo.markdownedittext:markdownedittext:1.1.3")
    implementation ("io.noties.markwon:core:4.6.0")
    implementation ("io.noties.markwon:ext-strikethrough:4.6.0")
    implementation ("io.noties.markwon:ext-tasklist:4.6.0")
    implementation ("androidx.room:room-ktx:2.6.1")
}