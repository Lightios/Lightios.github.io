package pl.michal_cyran.portfolio.colors

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors


object CyanColors {
    val Cyan50 = Color.rgb(0xECFDFF)   // Very light cyan for light theme backgrounds
    val Cyan100 = Color.rgb(0xCFF9FE)  // Light cyan for light theme cards
    val Cyan200 = Color.rgb(0x9FF2FD)  // Light cyan borders
    val Cyan300 = Color.rgb(0x67E8F9)  // Medium cyan for dark theme text
    val Cyan400 = Color.rgb(0x22D3EE)  // Primary cyan for dark theme
    val Cyan500 = Color.rgb(0x06B6D4)  // Primary cyan for light theme
    val Cyan600 = Color.rgb(0x0891B2)  // Darker cyan for hover states
    val Cyan700 = Color.rgb(0x0E7490)  // Dark cyan
    val Cyan800 = Color.rgb(0x155E75)  // Very dark cyan
    val Cyan900 = Color.rgb(0x164E63)  // Darkest cyan
}

object Light {
    val primary = CyanColors.Cyan500
    val primaryVariant = CyanColors.Cyan600
    val secondary = CyanColors.Cyan400
    val background = Color.rgb(0xf2f3f4)
    val surface = Color.rgb(0xf0f0f0)  // gray-50
    val onPrimary = Colors.White
    val onSecondary = Colors.White
    val onBackground = Color.rgb(0x111827)  // gray-900
    val onSurface = Color.rgb(0x374151)     // gray-600
    val accent = CyanColors.Cyan500
}

object Dark {
    val primary = CyanColors.Cyan400
    val primaryVariant = CyanColors.Cyan300
    val secondary = CyanColors.Cyan300
    val background = Color.rgb(0x14141F)    // gray-900
    val surface = Color.rgb(0x171824)       // gray-800
    val onPrimary = Color.rgb(0x111827)     // gray-900
    val onSecondary = Color.rgb(0x111827)   // gray-900
    val onBackground = Colors.White
    val onSurface = Color.rgb(0xD1D5DB)     // gray-300
    val surfaceContainer = Color.rgb(0x181925) // gray-600
    val accent = CyanColors.Cyan400
}
