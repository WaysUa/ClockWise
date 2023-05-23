package com.main.feat_timer.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.main.core.res.theme.ClockWiseTheme

@Composable
fun TimerScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(ClockWiseTheme.colors.primaryBackground),
        contentAlignment = Alignment.Center) {
        Text(text = "Timer")
    }
}