package com.main.feat_stopwatch.di

import com.main.feat_stopwatch.presentation.viewmodel.StopwatchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val stopwatchModule = module {
    viewModel {
        StopwatchViewModel(dispatchers = get())
    }
}