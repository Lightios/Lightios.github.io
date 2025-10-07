package pl.michal_cyran.portfolio.experience.domain

import com.varabyte.kobweb.compose.ui.graphics.Colors
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.Color


data class Stat(
    val value: String,
    val label: String,
    val color: CSSColorValue = Colors.Cyan
)