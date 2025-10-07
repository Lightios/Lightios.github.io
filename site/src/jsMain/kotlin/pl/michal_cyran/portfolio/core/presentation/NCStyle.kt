package pl.michal_cyran.portfolio.core.presentation

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.RadialGradient
import com.varabyte.kobweb.compose.css.functions.dropShadow
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.radialGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.css.translateY
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.bottom
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.boxSizing
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.content
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.filter
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateColumns
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.pointerEvents
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.right
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.after
import com.varabyte.kobweb.silk.style.selectors.before
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.minus
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.css.vh


val BodyStyle = CssStyle.base {
    Modifier
        .fontFamily(
            "-apple-system",
            "BlinkMacSystemFont",
            "Segoe UI",
            "Roboto",
            "Helvetica Neue",
            "Arial",
            "sans-serif"
        )
        .background(
            Background.of(
                image = linearGradient(LinearGradient.Direction.ToBottomRight) {
                    add(Color.rgb(0x0f172a))
                    add(Color.rgb(0x1e1b4b))
                    add(Color.rgb(0x0f172a))
                }.toImage()
            )
        )
        .minHeight(100.vh)
        .color(Color.rgb(0xe2e8f0))
        .padding(40.px, 20.px)
}
val ContainerStyle = CssStyle.base {
    Modifier
        .maxWidth(1400.px)
        .margin(0.px, autoLength)
}
val CardsGridStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Grid)
        .gridTemplateColumns { repeat(autoFit) { minmax(350.px, 1.fr) } }
        .gap(32.px)
}
val CardStyle = CssStyle {
    base {
        Modifier
            .position(Position.Relative)
            .background(
                Background.of(
                    image = linearGradient(Color.rgba(30, 41, 59, 0.8f), Color.rgba(15, 23, 42, 0.9f), 135.deg).toImage()
                )
            )
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.2f))
            .borderRadius(24.px)
            .padding(32.px)
            .transition(Transition.of("all", 0.4.s, TransitionTimingFunction.cubicBezier(0.4, 0.0, 0.2, 1.0)))
            .overflow(Overflow.Hidden)
//            .boxShadow(
//                0.px,
//                4.px,
//                6.px,
//                (-1).px,
//                Color.rgba(0, 0, 0, 0.3f),
//                0.px,
//                2.px,
//                4.px,
//                (-1).px,
//                Color.rgba(0, 0, 0, 0.2f),
//                0.px,
//                0.px,
//                0.px,
//                1.px,
//                Color.rgba(6, 182, 212, 0.1f)
//            )
    }
    before {
        Modifier
            .content("")
            .position(Position.Absolute)
            .top(0.px)
            .left(0.px)
            .right(0.px)
            .height(2.px)
            .background(
                Background.of(
                    image = linearGradient(90.deg) {
                        add(Colors.Transparent)
                        add(Color.rgb(0x06b6d4))
                        add(Colors.Transparent)
                    }.toImage()
                )
            )
            .opacity(0)
            .transition(Transition.of("opacity", 0.4.s, TransitionTimingFunction.Ease))
    }
    cssRule(":hover::before") {
        Modifier
            .opacity(1)
    }
    hover {
        Modifier
            .transform { translateY((-8).px) }
            .border { color(Color.rgba(6, 182, 212, 0.4f)) }
//            .boxShadow(
//                0.px,
//                20.px,
//                25.px,
//                (-5).px,
//                Color.rgba(0, 0, 0, 0.4f),
//                0.px,
//                10.px,
//                10.px,
//                (-5).px,
//                Color.rgba(0, 0, 0, 0.3f),
//                0.px,
//                0.px,
//                40.px,
//                Color.rgba(6, 182, 212, 0.3f),
//                0.px,
//                0.px,
//                0.px,
//                1.px,
//                Color.rgba(6, 182, 212, 0.2f)
//            )
    }
    cssRule(":hover .card-blur") {
        Modifier
            .transform { scale(1.2) }
            .opacity(0.8)
    }
    cssRule(":hover .icon-wrapper") {
        Modifier
            .background(
                Background.of(
                    image = linearGradient(Color.rgba(6, 182, 212, 0.3f), Color.rgba(8, 145, 178, 0.4f), 135.deg).toImage()
                )
            )
//            .boxShadow(
//                0.px,
//                8.px,
//                12.px,
//                (-2).px,
//                Color.rgba(6, 182, 212, 0.3f),
//                BoxShadow.Inherit,
//                0.px,
//                2.px,
//                4.px,
//                Color.rgba(6, 182, 212, 0.2f)
//            )
            .transform {
                scale(1.05)
                rotate(5.deg)
            }
    }
}
val CardBlurStyle = CssStyle.base {
    Modifier
        .position(Position.Absolute)
        .top((-100).px)
        .right((-100).px)
        .background(
            Background.of(
                image = radialGradient(RadialGradient.Shape.Circle) {
                    add(Color.rgba(6, 182, 212, 0.15f))
                    add(Colors.Transparent, 70.percent)
                }.toImage()
            )
        )
        .borderRadius(50.percent)
        .pointerEvents(PointerEvents.None)
        .transition(Transition.of("all", 0.4.s, TransitionTimingFunction.Ease))
        .size(300.px)
}
val CardContentStyle = CssStyle.base {
    Modifier
        .position(Position.Relative)
        .zIndex(1)
}
val IconWrapperStyle = CssStyle.base {
    Modifier
        .background(
            Background.of(
                image = linearGradient(Color.rgba(6, 182, 212, 0.2f), Color.rgba(8, 145, 178, 0.3f), 135.deg).toImage()
            )
        )
        .borderRadius(16.px)
        .display(DisplayStyle.Flex)
        .alignItems(AlignItems.Center)
        .justifyContent(JustifyContent.Center)
//        .boxShadow(
//            0.px,
//            4.px,
//            6.px,
//            (-1).px,
//            Color.rgba(6, 182, 212, 0.2f),
//            BoxShadow.Inset,
//            0.px,
//            2.px,
//            4.px,
//            Color.rgba(6, 182, 212, 0.1f)
//        )
        .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
        .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.3f))
        .size(64.px)
        .margin(bottom = 24.px)
}
val IconStyle = CssStyle.base {
    Modifier
        .color(Color.rgb(0x06b6d4))
        .filter(dropShadow(0.px, 2.px, 4.px, Color.rgba(6, 182, 212, 0.3f)))
        .size(32.px)
}
val CardTitleStyle = CssStyle.base {
    Modifier
        .fontSize(24.px)
        .fontWeight(700)
        .color(Color.rgb(0xf1f5f9))
        .lineHeight(1.3)
        .margin(bottom = 16.px)
}
val CardDescriptionStyle = CssStyle.base {
    Modifier
        .fontSize(15.px)
        .lineHeight(1.6)
        .color(Color.rgb(0xcbd5e1))
        .margin(bottom = 24.px)
}
val CardLinkStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(8.px)
            .color(Color.rgb(0x06b6d4))
//            .textDecoration(TextDecoration.None)
            .fontWeight(600)
            .fontSize(15.px)
            .transition(Transition.of("all", 0.3.s, TransitionTimingFunction.Ease))
            .position(Position.Relative)
    }
    after {
        Modifier
            .content("")
            .position(Position.Absolute)
            .bottom((-2).px)
            .left(0.px)
            .width(0.px)
            .height(2.px)
            .background(Background.of(image = linearGradient(Color.rgb(0x06b6d4), Color.rgb(0x0891b2), 90.deg).toImage()))
            .transition(Transition.of("width", 0.3.s, TransitionTimingFunction.Ease))
    }
    cssRule(":hover::after") {
        Modifier
            .width(100.percent - 28.px)
    }
    hover {
        Modifier
            .color(Color.rgb(0x22d3ee))
    }
    cssRule(":hover .arrow-icon") {
        Modifier
            .transform { translateX(4.px) }
    }
}
val ArrowIconStyle = CssStyle.base {
    Modifier
        .transition(Transition.of("transform", 0.3.s, TransitionTimingFunction.Ease))
        .size(20.px)
}