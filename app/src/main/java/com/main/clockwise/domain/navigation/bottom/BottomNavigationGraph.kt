package com.main.clockwise.domain.navigation.bottom

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.clockwise.data.navigation.BottomBarScreen
import com.main.clockwise.presentation.screen.FirstScreen
import com.main.clockwise.presentation.screen.SecondScreen
import com.main.clockwise.presentation.screen.ThirdScreen

@Composable
fun BottomNavigationGraph(
    navController: NavHostController,
    modifier: Modifier,
) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(BottomBarScreen.Home.route) {
            FirstScreen(modifier = modifier)
        }
        composable(BottomBarScreen.Settings.route) {
            SecondScreen(modifier = modifier)
        }
        composable(BottomBarScreen.Profile.route) {
            ThirdScreen(modifier = modifier)
        }
    }
}