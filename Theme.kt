package com.*.*.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

object Theme {
    var currentThemeType: ThemeType = ThemeType.STANDARD

    enum class ThemeType(
        val lightColorScheme: ColorScheme,
        val darkColorScheme: ColorScheme
    ) {
        STANDARD(
            lightColorScheme = lightColorScheme(
                primary = Color(0xFF002d56),
                onPrimary = Color(0xFFffffff),
                secondary = Color(0xFF002d52),
                onSecondary = Color(0xFFffffff),
                tertiary = Color(0xFF003046),
                onTertiary = Color(0xFFffffff),
                error = Color(0xFF511917),
                onError = Color(0xFFffffff),
                primaryContainer = Color(0xFF244a79),
                onPrimaryContainer = Color(0xFFffffff),
                secondaryContainer = Color(0xFF1e4b78),
                onSecondaryContainer = Color(0xFFffffff),
                tertiaryContainer = Color(0xFF004e70),
                onTertiaryContainer = Color(0xFFffffff),
                errorContainer = Color(0xFF763632),
                onErrorContainer = Color(0xFFffffff),
                surfaceDim = Color(0xFFb5b9bd),
                surface = Color(0xFFf6fafe),
                surfaceBright = Color(0xFFf6fafe),
                surfaceContainerLowest = Color(0xFFffffff),
                surfaceContainerLow = Color(0xFFedf1f5),
                surfaceContainer = Color(0xFFdfe3e7),
                surfaceContainerHigh = Color(0xFFd1d5d9),
                surfaceContainerHighest = Color(0xFFc3c7cb),
                onSurface = Color(0xFF000000),
                onSurfaceVariant = Color(0xFF000000),
                outline = Color(0xFF262d31),
                outlineVariant = Color(0xFF434a4f),
                inverseSurface = Color(0xFF2c3134),
                inverseOnSurface = Color(0xFFffffff),
                inversePrimary = Color(0xFFa5c8fe),
                scrim = Color(0xFF000000)
            ),
            darkColorScheme = darkColorScheme(
                primary = Color(0xFFeaf0ff),
                onPrimary = Color(0xFF000000),
                secondary = Color(0xFFe9f0ff),
                onSecondary = Color(0xFF000000),
                tertiary = Color(0xFFe3f2ff),
                onTertiary = Color(0xFF000000),
                error = Color(0xFFffecea),
                onError = Color(0xFF000000),
                primaryContainer = Color(0xFFa1c5fa),
                onPrimaryContainer = Color(0xFF000b1d),
                secondaryContainer = Color(0xFF9dc6f9),
                onSecondaryContainer = Color(0xFF000c1c),
                tertiaryContainer = Color(0xFF8fcaf2),
                onTertiaryContainer = Color(0xFF000d16),
                errorContainer = Color(0xFFffaea7),
                onErrorContainer = Color(0xFF220001),
                surfaceDim = Color(0xFF0f1417),
                surface = Color(0xFF0f1417),
                surfaceBright = Color(0xFF4c5154),
                surfaceContainerLowest = Color(0xFF000000),
                surfaceContainerLow = Color(0xFF1b2023),
                surfaceContainer = Color(0xFF2c3134),
                surfaceContainerHigh = Color(0xFF373c3f),
                surfaceContainerHighest = Color(0xFF42474b),
                onSurface = Color(0xFFffffff),
                onSurfaceVariant = Color(0xFFffffff),
                outline = Color(0xFFeaf1f7),
                outlineVariant = Color(0xFFbcc4c9),
                inverseSurface = Color(0xFFdfe3e7),
                inverseOnSurface = Color(0xFF000000),
                inversePrimary = Color(0xFF224977),
                scrim = Color(0xFF000000),
            ),
        ),
        GREEN(
            lightColorScheme = lightColorScheme(
                primary = Color(0xFF003232),
                onPrimary = Color(0xFFffffff),
                secondary = Color(0xFF003324),
                onSecondary = Color(0xFFffffff),
                tertiary = Color(0xFF213100),
                onTertiary = Color(0xFFffffff),
                error = Color(0xFF511917),
                onError = Color(0xFFffffff),
                primaryContainer = Color(0xFF005253),
                onPrimaryContainer = Color(0xFFffffff),
                secondaryContainer = Color(0xFF00543d),
                onSecondaryContainer = Color(0xFFffffff),
                tertiaryContainer = Color(0xFF3c5013),
                onTertiaryContainer = Color(0xFFffffff),
                errorContainer = Color(0xFF763632),
                onErrorContainer = Color(0xFFffffff),
                surfaceDim = Color(0xFFb5b9bd),
                surface = Color(0xFFf6fafe),
                surfaceBright = Color(0xFFf6fafe),
                surfaceContainerLowest = Color(0xFFffffff),
                surfaceContainerLow = Color(0xFFedf1f5),
                surfaceContainer = Color(0xFFdfe3e7),
                surfaceContainerHigh = Color(0xFFd1d5d9),
                surfaceContainerHighest = Color(0xFFc3c7cb),
                onSurface = Color(0xFF000000),
                onSurfaceVariant = Color(0xFF000000),
                outline = Color(0xFF262d31),
                outlineVariant = Color(0xFF434a4f),
                inverseSurface = Color(0xFF2c3134),
                inverseOnSurface = Color(0xFFffffff),
                inversePrimary = Color(0xFF80d4d5),
                scrim = Color(0xFF000000),
            ),
            darkColorScheme(
                primary = Color(0xFFaaffff),
                onPrimary = Color(0xFF000000),
                secondary = Color(0xFFb7ffdf),
                onSecondary = Color(0xFF000000),
                tertiary = Color(0xFFe0faab),
                onTertiary = Color(0xFF000000),
                error = Color(0xFFffecea),
                onError = Color(0xFF000000),
                primaryContainer = Color(0xFF7cd0d1),
                onPrimaryContainer = Color(0xFF000e0e),
                secondaryContainer = Color(0xFF87d2b2),
                onSecondaryContainer = Color(0xFF000e08),
                tertiaryContainer = Color(0xFFb3cc82),
                onTertiaryContainer = Color(0xFF070d00),
                errorContainer = Color(0xFFffaea7),
                onErrorContainer = Color(0xFF220001),
                surfaceDim = Color(0xFF0f1417),
                surface = Color(0xFF0f1417),
                surfaceBright = Color(0xFF4c5154),
                surfaceContainerLowest = Color(0xFF000000),
                surfaceContainerLow = Color(0xFF1b2023),
                surfaceContainer = Color(0xFF2c3134),
                surfaceContainerHigh = Color(0xFF373c3f),
                surfaceContainerHighest = Color(0xFF42474b),
                onSurface = Color(0xFFffffff),
                onSurfaceVariant = Color(0xFFffffff),
                outline = Color(0xFFeaf1f7),
                outlineVariant = Color(0xFFbcc4c9),
                inverseSurface = Color(0xFFdfe3e7),
                inverseOnSurface = Color(0xFF000000),
                inversePrimary = Color(0xFF005151),
                scrim = Color(0xFF000000),
            )
        ),
        YELLOW(
            lightColorScheme = lightColorScheme(
                primary = Color(0xFF2f2d00),
                onPrimary = Color(0xFFffffff),
                secondary = Color(0xFF4e1d01),
                onSecondary = Color(0xFFffffff),
                tertiary = Color(0xFF073324),
                onTertiary = Color(0xFFffffff),
                error = Color(0xFF600004),
                onError = Color(0xFFffffff),
                primaryContainer = Color(0xFF4e4b00),
                onPrimaryContainer = Color(0xFFffffff),
                secondaryContainer = Color(0xFF733919),
                onSecondaryContainer = Color(0xFFffffff),
                tertiaryContainer = Color(0xFF295141),
                onTertiaryContainer = Color(0xFFffffff),
                errorContainer = Color(0xFF98000a),
                onErrorContainer = Color(0xFFffffff),
                surfaceDim = Color(0xFFbcb9ac),
                surface = Color(0xFFfdf9ec),
                surfaceBright = Color(0xFFfdf9ec),
                surfaceContainerLowest = Color(0xFFffffff),
                surfaceContainerLow = Color(0xFFf5f1e3),
                surfaceContainer = Color(0xFFe6e2d5),
                surfaceContainerHigh = Color(0xFFd8d4c7),
                surfaceContainerHighest = Color(0xFFcac6ba),
                onSurface = Color(0xFF000000),
                onSurfaceVariant = Color(0xFF000000),
                outline = Color(0xFF2e2d21),
                outlineVariant = Color(0xFF4b4a3c),
                inverseSurface = Color(0xFF323128),
                inverseOnSurface = Color(0xFFffffff),
                inversePrimary = Color(0xFFceca74),
                scrim = Color(0xFF000000)
            ),
            darkColorScheme = darkColorScheme(
                primary = Color(0xFFf8f49a),
                onPrimary = Color(0xFF000000),
                secondary = Color(0xFFffece5),
                onSecondary = Color(0xFF000000),
                tertiary = Color(0xFFcdfae4),
                onTertiary = Color(0xFF000000),
                error = Color(0xFFffece9),
                onError = Color(0xFF000000),
                primaryContainer = Color(0xFFcac671),
                onPrimaryContainer = Color(0xFF0c0c00),
                secondaryContainer = Color(0xFFffb08a),
                onSecondaryContainer = Color(0xFF1a0500),
                tertiaryContainer = Color(0xFFa1ccb7),
                onTertiaryContainer = Color(0xFF000e08),
                errorContainer = Color(0xFFffaea4),
                onErrorContainer = Color(0xFF220001),
                surfaceDim = Color(0xFF14140c),
                surface = Color(0xFF14140c),
                surfaceBright = Color(0xFF525046),
                surfaceContainerLowest = Color(0xFF000000),
                surfaceContainerLow = Color(0xFF212018),
                surfaceContainer = Color(0xFF323128),
                surfaceContainerHigh = Color(0xFF3d3c32),
                surfaceContainerHighest = Color(0xFF48473d),
                onSurface = Color(0xFFffffff),
                onSurfaceVariant = Color(0xFFffffff),
                outline = Color(0xFFf4f0de),
                outlineVariant = Color(0xFFc6c3b2),
                inverseSurface = Color(0xFFe6e2d5),
                inverseOnSurface = Color(0xFF000000),
                inversePrimary = Color(0xFF4c4a00),
                scrim = Color(0xFF000000)
            )
        )
//        primary = Color(0xFF),
//        onPrimary = Color(0xFF),
//        secondary = Color(0xFF),
//        onSecondary = Color(0xFF),
//        tertiary = Color(0xFF),
//        onTertiary = Color(0xFF),
//        error = Color(0xFF),
//        onError = Color(0xFF),
//        primaryContainer = Color(0xFF),
//        onPrimaryContainer = Color(0xFF),
//        secondaryContainer = Color(0xFF),
//        onSecondaryContainer = Color(0xFF),
//        tertiaryContainer = Color(0xFF),
//        onTertiaryContainer = Color(0xFF),
//        errorContainer = Color(0xFF),
//        onErrorContainer = Color(0xFF),
//        surfaceDim = Color(0xFF),
//        surface = Color(0xFF),
//        surfaceBright = Color(0xFF),
//        surfaceContainerLowest = Color(0xFF),
//        surfaceContainerLow = Color(0xFF),
//        surfaceContainer = Color(0xFF),
//        surfaceContainerHigh = Color(0xFF),
//        surfaceContainerHighest = Color(0xFF),
//        onSurface = Color(0xFF),
//        onSurfaceVariant = Color(0xFF),
//        outline = Color(0xFF),
//        outlineVariant = Color(0xFF),
//        inverseSurface = Color(0xFF),
//        inverseOnSurface = Color(0xFF),
//        inversePrimary = Color(0xFF),
//        scrim = Color(0xFF),
    }
}

@Composable
fun DrawtosvgTheme(
    darkTheme: Boolean = false,
    themeType: Theme.ThemeType = Theme.ThemeType.STANDARD,
    content: @Composable () -> Unit
) {
    Theme.currentThemeType = themeType
    val view = LocalView.current

    val colorScheme = if (darkTheme)
        Theme.currentThemeType.darkColorScheme
    else
        Theme.currentThemeType.lightColorScheme

    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
