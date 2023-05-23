package com.main.clockwise.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.main.clockwise.presentation.components.BeautifulBottomNavigation
import com.main.clockwise.domain.navigation.bottom.BottomNavigationGraph
import com.main.core.res.theme.ClockWiseTheme

@Composable
fun BottomNavigationScreen(
    navController: NavHostController = rememberNavController()
) {
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
                modifier = Modifier.padding(bottom = padding.calculateBottomPadding())
            )
        }
    }
}