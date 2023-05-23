package com.main.clockwise.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import com.main.clockwise.data.navigation.BottomBarScreen
import com.main.core.res.theme.ClockWiseTheme
import kotlinx.coroutines.launch

@Composable
fun BeautifulBottomNavigation(
    navController: NavController,
) {
    val scope = rememberCoroutineScope()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val items = listOf(
        BottomBarScreen.Timer,
        BottomBarScreen.Clock,
        BottomBarScreen.Stopwatch
    )

    Row(
        modifier = Modifier
            .background(ClockWiseTheme.colors.primaryBackground)
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val currentDestination = navBackStackEntry?.destination
        val previousDestination = remember { mutableStateOf(BottomBarScreen.Clock.route) }

        items.forEach { screen ->
            CustomBottomNavigationItem(
                screen = screen,
                currentDestination?.hierarchy?.any { it.route == screen.route } == true
            ) {
                if (screen.route == previousDestination.value) return@CustomBottomNavigationItem
                previousDestination.value = screen.route

                scope.launch {
                    navController.popBackStack()
                    navController.navigate(screen.route)
                }
            }
        }
    }
}

@Composable
fun CustomBottomNavigationItem(
    screen: BottomBarScreen,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    val background = if (isSelected) ClockWiseTheme.colors.primaryBackground.copy(alpha = 0.1f) else Color.Transparent
    val contentColor = if (isSelected) ClockWiseTheme.colors.primaryItem else ClockWiseTheme.colors.secondaryItem

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = { onClick.invoke() })

    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(
                imageVector = screen.icon,
                contentDescription = null,
                tint = contentColor
            )
            AnimatedVisibility(
                visible = isSelected
            ) {
                Text(
                    text = screen.title,
                    color = contentColor
                )
            }
        }
    }
}