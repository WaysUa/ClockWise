package com.main.core.res.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

data class ClockWiseColors(
    val primaryBackground: Color,
    val primaryItem: Color,
    val secondaryItem: Color,
    val secondaryBackground: Color,
    val checkedItem: Color
)

data class ClockWiseTypography(
    val heading: TextStyle,
    val body: TextStyle,
    val toolbar: TextStyle,
    val caption: TextStyle
)

data class ClockWiseShape(
    val padding: Dp,
    val cornersStyle: Shape
)

data class ClockWiseImage(
    //val mainIcon: Int,
    val mainIconDescription: String
)

object ClockWiseTheme {
    val colors: ClockWiseColors
        @Composable
        get() = LocalClockWiseColors.current

    val typography: ClockWiseTypography
        @Composable
        get() = LocalClockWiseTypography.current

    val shapes: ClockWiseShape
        @Composable
        get() = LocalClockWiseShape.current

    val images: ClockWiseImage
        @Composable
        get() = LocalClockWiseImage.current
}

enum class ClockWiseSize {
    Small, Medium, Big
}

enum class ClockWiseCorners {
    Flat, Rounded
}

val LocalClockWiseColors = staticCompositionLocalOf<ClockWiseColors> {
    error("No colors provided")
}

val LocalClockWiseTypography = staticCompositionLocalOf<ClockWiseTypography> {
    error("No font provided")
}

val LocalClockWiseShape = staticCompositionLocalOf<ClockWiseShape> {
    error("No shapes provided")
}

val LocalClockWiseImage = staticCompositionLocalOf<ClockWiseImage> {
    error("No images provided")
}