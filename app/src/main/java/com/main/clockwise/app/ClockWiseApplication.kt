package com.main.clockwise.app

import android.app.Application
import com.main.core.di.coreModule
import com.main.feat_stopwatch.di.stopwatchModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class ClockWiseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@ClockWiseApplication)
            modules(
                listOf(
                    coreModule,
                    stopwatchModule
                )
            )
        }
    }
}