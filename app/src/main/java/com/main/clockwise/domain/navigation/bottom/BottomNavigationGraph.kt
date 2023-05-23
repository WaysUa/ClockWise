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

@Composable
fun BottomNavigationGraph(
    navController: NavHostController,
    modifier: Modifier,
) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(BottomBarScreen.Home.route) {
            ClockScreen()
        }
        composable(BottomBarScreen.Settings.route) {
            SecondScreen(modifier = modifier)
        }
        composable(BottomBarScreen.Profile.route) {
            ThirdScreen(modifier = modifier)
        }
    }
}