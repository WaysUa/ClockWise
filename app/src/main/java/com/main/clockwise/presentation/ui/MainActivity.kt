package com.main.clockwise.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.main.clockwise.domain.navigation.main.MainNavigationGraph
import com.main.clockwise.presentation.BottomNavigationScreen
import com.main.core.res.theme.ClockWiseTheme
import com.main.core.res.theme.baseDarkPalette
import com.main.core.res.theme.baseLightPalette

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isDarkMode = remember { mutableStateOf(true) }

            ClockWiseTheme {
                val systemUiController = rememberSystemUiController()
                val navController = rememberNavController()

                MainNavigationGraph(navController = navController)

                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = if (isDarkMode.value) baseDarkPalette.primaryBackground else baseLightPalette.primaryBackground,
                        darkIcons = !isDarkMode.value
                    )
                }
            }
        }
    }
}