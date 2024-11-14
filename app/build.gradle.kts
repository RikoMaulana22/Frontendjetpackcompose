plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.riko.bottomnavigateapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.riko.bottomnavigateapp"
        minSdk = 28
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    implementation("androidx.navigation:navigation-compose:2.8.4")
    implementation ("androidx.compose.runtime:runtime:1.7.5")
    implementation ("androidx.compose.foundation:foundation:1.7.5")
    implementation ("androidx.navigation:navigation-compose:2.8.4")
    implementation ("androidx.compose.ui:ui:1.4.0" )
    implementation ("androidx.compose.material3:material3:1.0.0" )
    implementation ("androidx.compose.foundation:foundation:1.4.0")
    implementation ("androidx.compose.runtime:runtime-livedata:1.4.0") 
    implementation ("androidx.compose.material:material:1.4.0" )
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}