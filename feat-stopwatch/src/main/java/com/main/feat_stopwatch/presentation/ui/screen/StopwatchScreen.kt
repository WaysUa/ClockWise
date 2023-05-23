package com.main.feat_stopwatch.presentation.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.main.feat_stopwatch.data.StopwatchEvent
import com.main.feat_stopwatch.data.StopwatchViewState
import com.main.feat_stopwatch.presentation.ui.views.StopwatchDisplayView
import com.main.feat_stopwatch.presentation.viewmodel.StopwatchViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun StopwatchScreen(
    stopwatchViewModel: StopwatchViewModel = koinViewModel()
) {
    val viewState = stopwatchViewModel.stopwatchViewState.collectAsState()

    when (val state = viewState.value) {
        StopwatchViewState.Display -> StopwatchDisplayView()
    }

    LaunchedEffect(key1 = Unit, block = {
        stopwatchViewModel.obtainEvent(StopwatchEvent.EnterScreen)
    })
}