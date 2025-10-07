package pl.michal_cyran.portfolio.core.presentation.styles
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
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.content
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.pointerEvents
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.right
import com.varabyte.kobweb.compose.ui.modifiers.textShadow
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.selectors.before
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val EducationCardStyle = CssStyle {
    base {
        Modifier
            .background(
                Background.of(
                    image = linearGradient(135.deg) {
                        add(Color.rgba(15, 23, 42, 0.9f), 0.percent)
                        add(Color.rgba(30, 41, 59, 0.8f), 100.percent)
                    }.toImage()
                )
            )
            .borderRadius(24.px)
            .padding(40.px)
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.2f))
            .boxShadow(
                BoxShadow.of(
                    0.px,
                    20.px,
                    60.px,
                    0.px,
                    Color.rgba(0, 0, 0, 0.5f),
                ),
                BoxShadow.of(

                0.px,
                0.px,
                0.px,
                1.px,
                    Color.rgba(6, 182, 212, 0.1f),
                true
                ),
                BoxShadow.of(
                0.px,
                1.px,
                0.px,
                    0.px,
                Color.rgba(255, 255, 255, 0.05f)
                )
            )
            .position(Position.Relative)
            .overflow(Overflow.Hidden)
            .transition(Transition.of("all", 0.4.s, TransitionTimingFunction.cubicBezier(0.4, 0.0, 0.2, 1.0)))
    }
    before {
        Modifier
            .content("")
            .position(Position.Absolute)
            .top(0.px)
            .left(0.px)
            .right(0.px)
            .height(200.px)
            .background(
                Background.of(
                    image = radialGradient(RadialGradient.Shape.Circle, CSSPosition.Top) {
                        add(Color.rgba(6, 182, 212, 0.15f))
                        add(Colors.Transparent, 70.percent)
                    }.toImage()
                )
            )
            .pointerEvents(PointerEvents.None)
    }
    hover {
        Modifier
            .transform { translateY((-8).px) }
            .border { color(Color.rgba(6, 182, 212, 0.4f)) }
            .boxShadow(
                BoxShadow.of(
                    0.px,
                    30.px,
                    60.px,
                    0.px,
                    Color.rgba(0, 0, 0, 0.6f),
                ),
                BoxShadow.of(
                    0.px,
                    0.px,
                    60.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.3f),
                ),
                BoxShadow.of(
                    0.px,
                    0.px,
                    0.px,
                    1.px,
                    Color.rgba(6, 182, 212, 0.2f),
                    true,
                ),
                BoxShadow.of(
                    0.px,
                    1.px,
                    0.px,
                    0.px,
                    Color.rgba(255, 255, 255, 0.1f)
                )
            )
    }

    cssRule(" h2") {
        Modifier
            .fontSize(2.cssRem)
            .fontWeight(700)
            .color(Color.rgb(0xf1f5f9))
            .textShadow(0.px, 2.px, 10.px, Color.rgba(0, 0, 0, 0.3f))
    }
}
