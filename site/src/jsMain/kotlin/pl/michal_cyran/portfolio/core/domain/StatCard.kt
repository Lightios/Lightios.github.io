package pl.michal_cyran.portfolio.core.domain

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import org.jetbrains.compose.web.css.CSSColorValue

data class Stat(
    val value: String,
    val label: String,
//    val icon: @Composable (modifier: Modifier) -> Unit,
    val iconColor: CSSColorValue,
)