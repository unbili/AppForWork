package com.example.appforwork.app


/** Not a real crash reporting library! */
object  FakeCrashLibrary {

    @JvmStatic
    fun log(priority: Int, tag: String?, message: String?) {
        // TODO add log entry to circular buffer.
    }

    @JvmStatic
    fun logWarning(t: Throwable?) {
        // TODO report non-fatal warning.
    }

    @JvmStatic
    fun logError(t: Throwable?) {
        // TODO report non-fatal error.
    }

    init {
        throw AssertionError("No instances.")
    }
}