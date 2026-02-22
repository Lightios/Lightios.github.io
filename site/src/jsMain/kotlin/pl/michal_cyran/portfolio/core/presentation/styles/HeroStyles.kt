package pl.michal_cyran.portfolio.core.presentation.styles
import com.varabyte.kobweb.compose.css.Animation
import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.CSSPosition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.TextTransform
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

import org.jetbrains.compose.web.css.*
import com.varabyte.kobweb.compose.css.animation
import com.varabyte.kobweb.compose.css.textTransform
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.animation
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.flex
import com.varabyte.kobweb.compose.ui.modifiers.flexDirection
import com.varabyte.kobweb.compose.ui.modifiers.flexShrink
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateColumns
import com.varabyte.kobweb.compose.ui.modifiers.letterSpacing
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textTransform
import com.varabyte.kobweb.silk.style.base
import org.jetbrains.compose.web.ExperimentalComposeWebApi

val mutedText = Color("#8b949e")
val kotlin = Color(" #7f52ff")
val python = Color(" #3776ab")
val manim = Color(" #00c853")
val android = Color(" #3ddc84")
val border = Color("21262d")
val surface = Color("#161b22")
val surface2 = Color("#1c2333")

val HeroStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Grid)
        .gridTemplateColumns {
            size(1.fr)
            size(1.fr)
        }
        .gap(4.cssRem)
        .alignItems(AlignItems.Center)
        .margin(bottom = 5.cssRem)
}

val HeroLabelStyle = CssStyle.base {
    Modifier
        .fontFamily("JetBrains Mono", "monospace")
        .fontSize(0.78.cssRem)
        .color(Colors.Cyan)
        .letterSpacing(0.15.em)
        .textTransform(TextTransform.Uppercase)
        .margin(leftRight = 10.px, top = 2.cssRem)
        .padding(leftRight = 10.px)
//        .margin(bottom = 1.cssRem)
}

val HeroTitleStyle = CssStyle {
    base {
        Modifier
            .fontSize(2.8.cssRem)
            .fontWeight(600)
            .lineHeight(1.15)
            .margin(bottom = 1.5.cssRem, leftRight = 0.cssRem)
    }
    cssRule(" span") {
        Modifier
            .color(Colors.Cyan)
    }
}
val HeroDescStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.05.cssRem)
            .lineHeight(1.75)
            .color(Colors.White)
        .margin(bottom = 2.cssRem, left=20.px)
    }

    cssRule(" span") {
        Modifier
            .color(Colors.Cyan)
        .fontWeight(700)
    }
}
val HeroActionsStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .gap(1.cssRem)
        .flexWrap(FlexWrap.Wrap)
        .animation()
}

val HeroRightStyle = CssStyle.base {
    Modifier
}
val StackPanelStyle = CssStyle {
    base {
        Modifier
            .background(surface)
            .border(1.px, LineStyle.Solid, Color("#21262d"))
        .borderRadius(16.px)
        .padding(1.75.cssRem)
        .position(Position.Relative)
        .overflow(Overflow.Hidden)
    }
    before {
        Modifier
            .content("")
            .position(Position.Absolute)
            .top((-40).px)
            .right((-40).px)
            .background(
                Background.of(
                    image = radialGradient(RadialGradient.Shape.Circle) {
                        add(Color.rgba(0, 212, 212, 0.15f))
                        add(Colors.Transparent, 70.percent)
                    }.toImage()
                )
            )
            .pointerEvents(PointerEvents.None)
            .size(140.px)
    }
}
val StackTitleStyle = CssStyle.base {
    Modifier
        .fontFamily("JetBrains Mono", "monospace")
        .fontSize(0.72.cssRem)
        .color(mutedText)
    .letterSpacing(0.12.em)
    .textTransform(TextTransform.Uppercase)
    .margin(bottom = 1.25.cssRem)
}
val TechListStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexDirection(FlexDirection.Column)
        .gap(0.75.cssRem)
}
val TechItemStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(0.75.cssRem)
            .padding(0.7.cssRem, 1.cssRem)
            .borderRadius(10.px)
            .background(surface2)
            .border(1.px, LineStyle.Solid, border)
        .transition(Transition.of("border-color", 0.2.s), Transition.of("transform", 0.2.s))
        .cursor(Cursor.Default)
    }
    hover {
        Modifier
            .transform { translateX(4.px) }
    }

}

val TechDotStyle = CssStyle.base {
    Modifier
        .borderRadius(50.percent)
        .flexShrink(0)
        .size(10.px)
}

val TechNameStyle = CssStyle.base {
    Modifier
        .fontWeight(500)
        .fontSize(0.95.cssRem)
        .flex(1)
}
val TechRoleStyle = CssStyle.base {
    Modifier
        .fontSize(0.78.cssRem)
        .color(mutedText)
    .fontFamily("JetBrains Mono", "monospace")
}