package pl.michal_cyran.portfolio.core.presentation.styles
import com.varabyte.kobweb.compose.css.ListStyle
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.content
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.listStyle
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val ListStyle = CssStyle {
    base {
        Modifier
            .listStyle(ListStyle.None)
            .padding(left = 0.px)
            .margin(bottom = 2.cssRem)
    }
    cssRule(" li") {
        Modifier
            .padding(left = 32.px)
            .color(Color.rgb(0xcbd5e1))
            .fontSize(0.95.cssRem)
            .position(Position.Relative)
            .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
    }
    cssRule(" li::before") {
        Modifier
            .content("•")
            .position(Position.Absolute)
            .left(16.px)
            .color(Color.rgb(0x06b6d4))
            .fontSize(1.2.cssRem)
            .lineHeight(1)
    }
    cssRule(" li:hover") {
        Modifier
            .color(Color.rgb(0xf1f5f9))
            .padding(left = 36.px)
    }
}