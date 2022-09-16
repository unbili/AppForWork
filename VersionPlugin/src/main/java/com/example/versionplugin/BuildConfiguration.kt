package com.example.versionplugin

/**
 * 配置和 build相关的
 */
object AndroidBuildVersion {
    const val nameSpace = "com.example.appforwork"
    const val compileSdk = 32
    const val applicationId = nameSpace
    const val minSdk = 24
    const val targetSdk = 32
    const val versionCode = 102
    const val versionName = "1.0.2"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

/**
 * 项目相关配置
 */
object Dependencies {

    //AndroidX
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val coreKtx = "androidx.core:core-ktx:1.3.2"
    const val material = "com.google.android.material:material:1.2.1"
    const val junittest = "androidx.test.ext:junit:1.1.2"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"
    const val cardview = "androidx.cardview:cardview:1.0.0"

    //Depend
    const val junit = "junit:junit:4.12"
    const val espresso_core = "com.android.support.test.espresso:espresso-core:3.0.2"
    const val guava = "com.google.guava:guava:24.1-jre"
    const val commons = "org.apache.commons:commons-lang3:3.6"
    const val zxing = "com.google.zxing:core:3.3.2"

    //leakcanary
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:2.4"

    //jetPack
    const val room_runtime = "androidx.room:room-runtime:2.2.5"
    const val room_compiler = "androidx.room:room-compiler:2.2.5"
    const val room_rxjava2 = "androidx.room:room-rxjava2:2.2.5"
    const val lifecycle_extensions = "android.arch.lifecycle:extensions:1.1.1"
    const val lifecycle_compiler = "android.arch.lifecycle:compiler:1.1.1"
    const val rxlifecycle = "com.trello.rxlifecycle3:rxlifecycle:3.1.0"
    const val rxlifecycle_components = "com.trello.rxlifecycle3:rxlifecycle-components:3.1.0"

    //Kotlin
    const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7"

    const val filter = "filter"
    const val filterOr=  "filterOr"


    val dependenciesList  = this::class.java.declaredFields.toMutableList().filter {
        //如果不想添加此依赖，可以在过滤里面添加
        it.name.equals(filter) or it.equals(filterOr)
    }


}