package pl.michal_cyran.portfolio.colors

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import pl.michal_cyran.portfolio.toSitePalette

val backgroundContainer = CssStyle{
    base {
        Modifier
            .backgroundColor(colorMode.toSitePalette().surfaceContainer)
            .borderRadius(40.px)
    }
}


val secondaryContainer = CssStyle{
    base {
        Modifier
            .backgroundColor(colorMode.toSitePalette().secondaryContainer)
            .borderRadius(40.px)
    }
}