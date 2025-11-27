package com.ankrisdevs.android_challenge.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = primaryLightTheme,
    onPrimary = onPrimaryLightTheme,
    primaryContainer = primaryContainerLightTheme,
    onPrimaryContainer = onPrimaryContainerLightTheme,

    secondary = secondaryLightTheme,
    onSecondary = onSecondaryLightTheme,
    secondaryContainer = secondaryContainerLightTheme,
    onSecondaryContainer = onSecondaryContainerLightTheme,

    background = backgroundLightTheme,
    onBackground = onBackgroundLightTheme,

    surface = surfaceLightTheme,
    onSurface = onSurfaceLightTheme
)

private val DarkColorScheme = darkColorScheme(
    primary = primaryDarkTheme,
    onPrimary = onPrimaryDarkTheme,
    primaryContainer = primaryContainerDarkTheme,
    onPrimaryContainer = onPrimaryContainerDarkTheme,

    secondary = secondaryDarkTheme,
    onSecondary = onSecondaryDarkTheme,
    secondaryContainer = secondaryContainerDarkTheme,
    onSecondaryContainer = onSecondaryContainerDarkTheme,

    background = backgroundDarkTheme,
    onBackground = onBackgroundDarkTheme,

    surface = surfaceDarkTheme,
    onSurface = onSurfaceDarkTheme
)


@Composable
fun AndroidchallengeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}