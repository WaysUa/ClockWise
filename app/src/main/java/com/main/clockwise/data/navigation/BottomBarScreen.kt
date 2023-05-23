package com.main.clockwise.data.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Clock : BottomBarScreen(
        route = "clock_screen_route",
        title = "Clock",
        icon = Icons.Default.Home
    )

    object Timer : BottomBarScreen(
        route = "timer_screen_route",
        title = "Timer",
        icon = Icons.Default.Person
    )

    object Settings : BottomBarScreen(
        route = "SETTINGS",
        title = "SETTINGS",
        icon = Icons.Default.Settings
    )
}
