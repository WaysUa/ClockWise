package com.main.feat_clock.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.main.core.presentation.ui.theme.ClockWiseTheme

@Composable
fun ClockScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(ClockWiseTheme.colors.primaryBackground),
        contentAlignment = Alignment.Center) {
        Text(text = "Clock")
    }
}