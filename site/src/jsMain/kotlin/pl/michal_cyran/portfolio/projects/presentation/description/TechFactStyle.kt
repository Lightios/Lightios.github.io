package pl.michal_cyran.portfolio.projects.presentation.description

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.px

/**
 * Small pill chip used to label a [TechnicalFact] row.
 * Keeps the cyan palette consistent with the rest of the page while
 * visually separating the key from the value.
 */
val TechFactLabelStyle = CssStyle.base {
    Modifier
        .minWidth(100.px)
        .padding(4.px, 12.px)
        .borderRadius(6.px)
        .background(
            Background.of(
                image = linearGradient(
                    Color.rgba(6, 182, 212, 0.12f),
                    Color.rgba(8, 145, 178, 0.18f),
                    135.deg
                ).toImage()
            )
        )
        .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.3f))
        .color(Color.rgb(0x67e8f9))
        .fontSize(0.8125.cssRem)
        .fontWeight(FontWeight.SemiBold)
}