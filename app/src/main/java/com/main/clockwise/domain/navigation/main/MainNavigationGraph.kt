package com.main.clockwise.domain.navigation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.clockwise.presentation.screen.BottomNavigationScreen

@Composable
fun MainNavigationGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = MainNavigationGraphRoutes.BOTTOM_NAVIGATION_GRAPH
    ) {
        composable(route = MainNavigationGraphRoutes.BOTTOM_NAVIGATION_GRAPH) {
            BottomNavigationScreen()
        }
    }
}

object MainNavigationGraphRoutes {
    const val BOTTOM_NAVIGATION_GRAPH = "bottom_navigation_graph"
}