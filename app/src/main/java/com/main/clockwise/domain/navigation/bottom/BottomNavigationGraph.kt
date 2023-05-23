package com.main.clockwise.domain.navigation.bottom

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.clockwise.data.navigation.BottomBarScreen
import com.main.clockwise.presentation.screen.SecondScreen
import com.main.clockwise.presentation.screen.ThirdScreen
import com.main.feat_clock.presentation.ui.ClockScreen
import com.main.feat_timer.presentation.ui.TimerScreen

@Composable
fun BottomNavigationGraph(
    navController: NavHostController,
    modifier: Modifier,
) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Clock.route) {
        composable(BottomBarScreen.Clock.route) {
            ClockScreen()
        }
        composable(BottomBarScreen.Timer.route) {
            TimerScreen()
        }
        composable(BottomBarScreen.Settings.route) {
            SecondScreen(modifier = modifier)
        }
    }
}