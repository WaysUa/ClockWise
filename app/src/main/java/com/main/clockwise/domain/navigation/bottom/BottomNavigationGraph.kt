package com.main.clockwise.domain.navigation.bottom

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.clockwise.data.navigation.BottomBarScreen
import com.main.feat_clock.presentation.ui.ClockScreen
import com.main.feat_stopwatch.domain.service.StopwatchService
import com.main.feat_stopwatch.presentation.ui.screen.StopwatchScreen
import com.main.feat_timer.presentation.ui.TimerScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun BottomNavigationGraph(
    navController: NavHostController,
    stopwatchService: StopwatchService,
    //todo created data class for example (padding: 10.dp, fillMaxSize: Boolean = true and so on) instead of modifier
    modifier: Modifier,
) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Clock.route) {
        composable(BottomBarScreen.Clock.route) {
            ClockScreen()
        }
        composable(BottomBarScreen.Timer.route) {
            TimerScreen()
        }
        composable(BottomBarScreen.Stopwatch.route) {
            StopwatchScreen(stopwatchService = stopwatchService)
        }
    }
}