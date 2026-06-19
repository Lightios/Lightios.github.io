package pl.michal_cyran.portfolio.projects.presentation.description

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

/** Project header logo — large, centred, circular. */
val LogoStyle = CssStyle {
    base {
        Modifier
            .margin(0.px, autoLength, 20.px)
            .size(112.px)
            .borderRadius(50.percent)
            .padding(10.px)
            .background(
                Background.of(
                    image = linearGradient(
                        Color.rgba(6, 182, 212, 0.18f),
                        Color.rgba(8, 145, 178, 0.28f),
                        135.deg
                    ).toImage()
                )
            )
            .boxShadow(
                BoxShadow.of(0.px, 6.px, 28.px, 0.px, Color.rgba(6, 182, 212, 0.28f)),
                BoxShadow.of(0.px, 0.px, 16.px, 0.px, Color.rgba(6, 182, 212, 0.10f), true)
            )
            .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
    }
    hover {
        Modifier
            .transform { scale(1.06); rotate(4.deg) }
            .boxShadow(
                BoxShadow.of(0.px, 10.px, 36.px, 0.px, Color.rgba(6, 182, 212, 0.40f)),
                BoxShadow.of(0.px, 0.px, 28.px, 0.px, Color.rgba(6, 182, 212, 0.20f), true)
            )
    }
}

/** Smaller logo used in the skills grid — no bottom margin. */
val SkillLogoStyle = CssStyle {
    base {
        Modifier
            .size(72.px)
            .borderRadius(50.percent)
            .padding(8.px)
            .background(
                Background.of(
                    image = linearGradient(
                        Color.rgba(6, 182, 212, 0.12f),
                        Color.rgba(8, 145, 178, 0.20f),
                        135.deg
                    ).toImage()
                )
            )
            .boxShadow(
                BoxShadow.of(0.px, 4.px, 16.px, 0.px, Color.rgba(6, 182, 212, 0.20f))
            )
            .transition(Transition.of("all", 0.25.s, TransitionTimingFunction.Ease))
    }
    hover {
        Modifier
            .transform { scale(1.08) }
            .boxShadow(
                BoxShadow.of(0.px, 6.px, 24.px, 0.px, Color.rgba(6, 182, 212, 0.35f))
            )
    }
}