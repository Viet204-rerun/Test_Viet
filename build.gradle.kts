//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    val kotlin_version by extra("2.0.0")
//    dependencies{
//        classpath("com.google.dagger:hilt-android-gradle-plugin:2.47")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//    }
//    repositories {
//        mavenCentral()
//    }
//}
//plugins {
//    id("com.android.application") version "8.1.1" apply false
//    id("com.android.library") version "8.1.1" apply false
//    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
//    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
//}

buildscript {
    val kotlin_version by extra("1.8.10")
    val ksp_version by extra("1.8.10-1.0.9")

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.47")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:$ksp_version")
    }

    repositories {
        mavenCentral()
        google()
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
}
