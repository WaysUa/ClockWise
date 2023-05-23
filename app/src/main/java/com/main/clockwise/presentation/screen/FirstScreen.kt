package com.main.clockwise.presentation.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.main.core.res.theme.ClockWiseTheme

@Composable
fun FirstScreen(modifier: Modifier) {
    Log.d("MyLog", "1")
    Box(
        modifier = modifier.fillMaxSize().background(ClockWiseTheme.colors.primaryBackground),
        contentAlignment = Alignment.Center) {
        Text(text = "First")
    }
}

@Composable
fun SecondScreen(modifier: Modifier) {
    Log.d("MyLog", "2")
    Box(
        modifier = modifier.fillMaxSize().background(ClockWiseTheme.colors.primaryBackground),
        contentAlignment = Alignment.BottomCenter) {
        Text(text = "Second")
    }
}

@Composable
fun ThirdScreen(modifier: Modifier) {
    Log.d("MyLog", "3")
    Box(
        modifier = modifier.fillMaxSize().background(ClockWiseTheme.colors.primaryBackground),
        contentAlignment = Alignment.Center) {
        Text(text = "Third")
    }
}