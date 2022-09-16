package com.example.appforwork

object FieldsTest {
    //jetPack
    const val room_runtime = "androidx.room:room-runtime:2.2.5"
    const val room_compiler = "androidx.room:room-compiler:2.2.5"
    const val room_rxjava2 = "androidx.room:room-rxjava2:2.2.5"
    const val lifecycle_extensions = "android.arch.lifecycle:extensions:1.1.1"
    const val lifecycle_compiler = "android.arch.lifecycle:compiler:1.1.1"
    const val rxlifecycle = "com.trello.rxlifecycle3:rxlifecycle:3.1.0"
    const val rxlifecycle_components = "com.trello.rxlifecycle3:rxlifecycle-components:3.1.0"

    const val filter = "filter"
    const val filterOr = "filterOr"

    val dependenciesList = this::class.java.declaredFields
        .toMutableList().filterNot {
        //如果不想添加此依赖，可以在过滤里面添加
        it.name.equals("INSTANCE") or
        it.name.equals(filter) or
        it.name.equals(filterOr) or
        it.name.equals("dependenciesList")
    }

}

fun main() {
    val dList = FieldsTest.dependenciesList
    dList.forEach {
        it.isAccessible = true
        println(it.get(FieldsTest::class.java)?.toString())
    }
}