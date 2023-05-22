package com.main.clockwise.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.main.clockwise.domain.navigation.bottom.BottomBarNavigation
import com.main.clockwise.domain.navigation.bottom.BottomNavigationGraph

@Composable
    fun BottomNavigationScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = { BottomBarNavigation(navController = navController) },
    ) { padding ->
        BottomNavigationGraph(
            navController = navController,
            modifier = Modifier.padding(bottom = padding.calculateBottomPadding())
        )
    }
}