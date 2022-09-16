package com.example.appforwork.app

import android.app.Application
import android.util.Log
import androidx.annotation.NonNull
import com.example.appforwork.BuildConfig
//import timber.log.Timber
//import timber.log.Timber.Forest.plant

class ExampleApp : Application() {
//    override fun onCreate() {
//        super.onCreate()
//        if (BuildConfig.DEBUG) {
//            plant(Timber.DebugTree())
//        } else {
//            plant(CrashReportingTree())
//        }
//    }
//
//    /** A tree which logs important information for crash reporting.  */
//    private class CrashReportingTree : Timber.Tree() {
//        override fun log(
//            priority: Int,
//            tag: String?,
//            @NonNull message: String,
//            t: Throwable?
//        ) {
//            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
//                return
//            }
//            FakeCrashLibrary.log(priority, tag, message)
//            if (t != null) {
//                if (priority == Log.ERROR) {
//                    FakeCrashLibrary.logError(t)
//                } else if (priority == Log.WARN) {
//                    FakeCrashLibrary.logWarning(t)
//                }
//            }
//        }
//    }
}