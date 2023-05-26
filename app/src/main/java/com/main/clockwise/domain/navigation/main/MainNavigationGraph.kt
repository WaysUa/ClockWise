package com.main.clockwise.domain.navigation.main

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.clockwise.presentation.screen.BottomNavigationScreen
import com.main.feat_stopwatch.domain.service.StopwatchService

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainNavigationGraph(
    navController: NavHostController,
    stopwatchService: StopwatchService
) {
    NavHost(
        navController = navController,
        startDestination = MainNavigationGraphRoutes.BOTTOM_NAVIGATION_GRAPH
    ) {
        composable(route = MainNavigationGraphRoutes.BOTTOM_NAVIGATION_GRAPH) {
            BottomNavigationScreen(stopwatchService = stopwatchService)
        }
    }
}

object MainNavigationGraphRoutes {
    const val BOTTOM_NAVIGATION_GRAPH = "bottom_navigation_graph"
}