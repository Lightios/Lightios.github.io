package pl.michal_cyran.portfolio.projects.presentation.description
import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.ObjectFit
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
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
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

val LogoStyle = CssStyle {
    base {
        Modifier
            .margin(0.px, autoLength, 24.px)
            .borderRadius(50.percent)
            .background(
                Background.of(
                    image = linearGradient(Color.rgba(6, 182, 212, 0.2f), Color.rgba(8, 145, 178, 0.3f), 135.deg).toImage()
                )
            )
            .padding(10.px)
            .boxShadow(
                BoxShadow.of(
                    0.px,
                    8.px,
                    32.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.3f),
                ),
                BoxShadow.of(
                    0.px,
                    0.px,
                    20.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.1f),
                    true,
                )
            )
            .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
            .size(120.px)
    }
    hover {
        Modifier
            .transform {
                scale(1.05)
                rotate(5.deg)
            }
            .boxShadow(
                BoxShadow.of(
                    0.px,
                    12.px,
                    40.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.4f),
                ),
                BoxShadow.of(
                    0.px,
                    0.px,
                    30.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.2f),
                    true,
                )
            )
    }
//    cssRule(" img") {
//        Modifier
//            .borderRadius(50.percent)
//            .objectFit(ObjectFit.Cover)
//            .fillMaxSize()
//    }
}
