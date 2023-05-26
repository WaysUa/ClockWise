package com.main.feat_stopwatch.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.main.core.domain.network.DispatchersList
import com.main.core.domain.event.EventHandler
import com.main.feat_stopwatch.data.StopwatchEvent
import com.main.feat_stopwatch.data.StopwatchViewState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class StopwatchViewModel(
    private val dispatchers: DispatchersList
) : ViewModel(), EventHandler<StopwatchEvent> {

    private val _stopwatchViewState: MutableStateFlow<StopwatchViewState> = MutableStateFlow(StopwatchViewState.Display)
    val stopwatchViewState: StateFlow<StopwatchViewState> = _stopwatchViewState

    override fun obtainEvent(event: StopwatchEvent) {
        viewModelScope.launch(dispatchers.io()) {
            when(event) {
                StopwatchEvent.EnterScreen -> _stopwatchViewState.emit(StopwatchViewState.Display)
            }
        }
    }
}