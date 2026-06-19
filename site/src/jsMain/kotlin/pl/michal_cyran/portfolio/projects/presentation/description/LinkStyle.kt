package pl.michal_cyran.portfolio.projects.presentation.description

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val LinkButtonStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.LegacyInlineFlex)
            .alignItems(AlignItems.Center)
            .gap(10.px)
            .padding(10.px, 28.px)
            .background(
                Background.of(
                    image = linearGradient(
                        Color.rgba(6, 182, 212, 0.15f),
                        Color.rgba(8, 145, 178, 0.25f),
                        135.deg
                    ).toImage()
                )
            )
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.6f))
            .borderRadius(10.px)
            .color(Color.rgb(0x67e8f9))  // slightly lighter cyan — readable on dark bg
            .fontWeight(600)
            .fontSize(0.9375.cssRem)
            .boxShadow(0.px, 4.px, 20.px, 0.px, Color.rgba(6, 182, 212, 0.15f))
            .transition(Transition.of("all", 0.25.s, TransitionTimingFunction.Ease))
    }
    hover {
        Modifier
            .background(
                Background.of(
                    image = linearGradient(
                        Color.rgba(6, 182, 212, 0.28f),
                        Color.rgba(8, 145, 178, 0.38f),
                        135.deg
                    ).toImage()
                )
            )
            .border { color(Color.rgba(6, 182, 212, 0.9f)) }
            .transform { translateY((-3).px) }
            .boxShadow(0.px, 8.px, 28.px, 0.px, Color.rgba(6, 182, 212, 0.35f))
    }
    // Icon slides right on hover
    cssRule(":hover img") {
        Modifier.transform { translateX(3.px) }
    }
}

val LinkIconStyle = CssStyle.base {
    Modifier
        .size(18.px)
        .transition(Transition.of("transform", 0.25.s, TransitionTimingFunction.Ease))
}