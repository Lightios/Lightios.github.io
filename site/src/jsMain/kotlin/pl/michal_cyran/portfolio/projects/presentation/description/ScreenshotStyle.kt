package pl.michal_cyran.portfolio.projects.presentation.description
import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.bottom
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.content
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateColumns
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.right
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.before
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val ScreenshotsGridStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Grid)
        .gridTemplateColumns { repeat(autoFit) { minmax(250.px, 1.fr) } }
        .gap(24.px)
        .margin(top = 32.px)
}
val ScreenshotCardStyle = CssStyle {
    base {
        Modifier
            .position(Position.Relative)
            .borderRadius(16.px)
            .overflow(Overflow.Hidden)
            .background(Color.rgba(15, 23, 42, 0.8f))
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.2f))
            .boxShadow(0.px, 8.px, 32.px, 0.px, Color.rgba(0, 0, 0, 0.3f))
            .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
    }
    hover {
        Modifier
            .transform { translateY((-8).px) }
            .border { color(Color.rgba(6, 182, 212, 0.4f)) }
            .boxShadow(
                BoxShadow.of(0.px, 16.px, 48.px, 0.px, Color.rgba(0, 0, 0, 0.4f)),
                BoxShadow.of(0.px, 0.px, 40.px, 0.px, Color.rgba(6, 182, 212, 0.2f))
            )
    }
    before {
        Modifier
            .content("")
            .position(Position.Absolute)
            .top(0.px)
            .left(0.px)
            .right(0.px)
            .bottom(0.px)
            .background(
                Background.of(image = linearGradient(Color.rgba(6, 182, 212, 0.1f), Colors.Transparent, 135.deg).toImage())
            )
            .opacity(0)
            .transition(Transition.of("opacity", 0.3.s, TransitionTimingFunction.Ease))
            .zIndex(1)
    }
    cssRule(":hover::before") {
        Modifier
            .opacity(1)
    }
    cssRule(" img") {
        Modifier
            .objectFit(ObjectFit.Cover)
            .display(DisplayStyle.Block)
            .transition(Transition.of("transform", 0.3.s, TransitionTimingFunction.Ease))
            .fillMaxSize()
    }
    cssRule(":hover img") {
        Modifier
            .transform { scale(1.05) }
    }
}
