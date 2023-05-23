package com.main.core.res.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

@Composable
fun ClockWiseTheme(
    textSize: ClockWiseSize = ClockWiseSize.Medium,
    paddingSize: ClockWiseSize = ClockWiseSize.Medium,
    corners: ClockWiseCorners = ClockWiseCorners.Rounded,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        baseDarkPalette
    } else {
        baseLightPalette
    }
    val typography = ClockWiseTypography(
        heading = TextStyle(
            fontSize = when (textSize) {
                ClockWiseSize.Small -> 24.sp
                ClockWiseSize.Medium -> 28.sp
                ClockWiseSize.Big -> 32.sp
            },
            fontWeight = FontWeight.Bold
        ),
        body = TextStyle(
            fontSize = when (textSize) {
                ClockWiseSize.Small -> 14.sp
                ClockWiseSize.Medium -> 16.sp
                ClockWiseSize.Big -> 18.sp
            },
            fontWeight = FontWeight.Normal
        ),
        toolbar = TextStyle(
            fontSize = when (textSize) {
                ClockWiseSize.Small -> 14.sp
                ClockWiseSize.Medium -> 16.sp
                ClockWiseSize.Big -> 18.sp
            },
            fontWeight = FontWeight.Medium
        ),
        caption = TextStyle(
            fontSize = when (textSize) {
                ClockWiseSize.Small -> 10.sp
                ClockWiseSize.Medium -> 12.sp
                ClockWiseSize.Big -> 14.sp
            }
        )
    )

    val shapes = ClockWiseShape(
        padding = when (paddingSize) {
            ClockWiseSize.Small -> 12.dp
            ClockWiseSize.Medium -> 16.dp
            ClockWiseSize.Big -> 20.dp
        },
        cornersStyle = when (corners) {
            ClockWiseCorners.Flat -> RoundedCornerShape(0.dp)
            ClockWiseCorners.Rounded -> RoundedCornerShape(8.dp)
        }
    )

    val images = ClockWiseImage(
//        mainIcon = if (darkTheme) R.drawable.ic_baseline_mood_24 else R.drawable.ic_baseline_mood_bad_24,
        mainIconDescription = if (darkTheme) "Good Mood" else "Bad Mood"
    )

    CompositionLocalProvider(
        LocalClockWiseColors provides colors,
        LocalClockWiseTypography provides typography,
        LocalClockWiseShape provides shapes,
        LocalClockWiseImage provides images,
        content = content
    )
}