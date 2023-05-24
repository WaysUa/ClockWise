package com.main.feat_stopwatch.di

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.core.app.NotificationCompat
import com.main.feat_stopwatch.domain.util.Constants
import com.main.feat_stopwatch.di.ServiceHelper
import com.main.feat_stopwatch.presentation.viewmodel.StopwatchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@OptIn(ExperimentalAnimationApi::class)
val stopwatchModule = module {
    viewModel {
        StopwatchViewModel(dispatchers = get())
    }
    single {
        NotificationCompat.Builder(get(), Constants.NOTIFICATION_CHANNEL_ID)
            .setContentTitle("Stopwatch")
            .setContentText("00:00:00")
            .setSmallIcon(androidx.core.R.drawable.ic_call_answer)
            .setOngoing(true)
            .addAction(0, "Stop", ServiceHelper.stopPendingIntent(get()))
            .addAction(0, "Cancel", ServiceHelper.cancelPendingIntent(get()))
            .setContentIntent(ServiceHelper.clickPendingIntent(get()))
    }
}