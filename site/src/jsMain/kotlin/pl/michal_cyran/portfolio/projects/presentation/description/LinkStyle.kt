package pl.michal_cyran.portfolio.projects.presentation.description

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.CSSPosition
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.functions.RadialGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.radialGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.content
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.pointerEvents
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.right
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textShadow
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.before
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val LinkButtonStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(8.px)
            .padding(12.px, 32.px)
            .background(
                Background.of(
                    image = linearGradient(Color.rgba(6, 182, 212, 0.2f), Color.rgba(8, 145, 178, 0.3f), 135.deg).toImage()
                )
            )
            .border(1.px, LineStyle.Solid, Color.rgb(0x06b6d4))
            .borderRadius(12.px)
            .color(Color.rgb(0x06b6d4))
//            .textDecoration(TextDecoration.None)
            .fontWeight(600)
            .fontSize(1.cssRem)
            .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
            .boxShadow(0.px, 4.px, 16.px, 0.px, Color.rgba(6, 182, 212, 0.2f))
    }
    hover {
        Modifier
            .background(
                Background.of(
                    image = linearGradient(Color.rgba(6, 182, 212, 0.3f), Color.rgba(8, 145, 178, 0.4f), 135.deg).toImage()
                )
            )
            .transform { translateY((-2).px) }
            .boxShadow(0.px, 8.px, 24.px, 0.px, Color.rgba(6, 182, 212, 0.4f))
    }
    cssRule(":hover img") {
        Modifier
            .transform { translateX(4.px) }
    }
}

val LinkIconStyle = CssStyle.base {
    Modifier
        .transition(Transition.of("transform", 0.3.s, TransitionTimingFunction.Ease))
        .size(20.px)
}
