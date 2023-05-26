package com.main.clockwise.presentation.screen

import android.util.Log
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.main.clockwise.domain.navigation.bottom.BottomNavigationGraph
import com.main.clockwise.presentation.components.BeautifulBottomNavigation
import com.main.core.presentation.ui.theme.ClockWiseTheme
import com.main.feat_stopwatch.di.stopwatchModule
import com.main.feat_stopwatch.domain.service.StopwatchService

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BottomNavigationScreen(
    navController: NavHostController = rememberNavController(),
    stopwatchService: StopwatchService
) {
//    val hours by stopwatchService.hours
//    val minutes by stopwatchService.minutes
//    val seconds by stopwatchService.seconds
//    val currentState by stopwatchService.currentState
//    Log.d("MyLog", "$hours:$minutes:$seconds")
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(ClockWiseTheme.colors.primaryBackground)
    ) {
        Scaffold(
            bottomBar = {
                BeautifulBottomNavigation(navController)
            },
        ) { padding ->
            BottomNavigationGraph(
                navController = navController,
                modifier = Modifier.padding(bottom = padding.calculateBottomPadding()),
                stopwatchService = stopwatchService
            )
        }
    }
}