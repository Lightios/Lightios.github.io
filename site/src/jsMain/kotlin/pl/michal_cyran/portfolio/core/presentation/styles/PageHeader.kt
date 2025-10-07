package pl.michal_cyran.portfolio.core.presentation.styles

import com.varabyte.kobweb.compose.css.Animation
import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BackgroundClip
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.animation
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundClip
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.flexShrink
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textShadow
import com.varabyte.kobweb.compose.ui.modifiers.topBottom
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val PageHeaderStyle = CssStyle {
    base {
        Modifier
            .fontSize(3.5.cssRem)
            .fontWeight(700)
            .background(
                Background.of(
                    image = linearGradient(135.deg) {
                        add(Color.rgb(0x06b6d4), 0.percent)
                        add(Color.rgb(0x22d3ee), 100.percent)
                    }.toImage()
                )
            )
            .styleModifier {
                property("-webkit-background-clip", "text")
                property("-webkit-text-fill-color", "transparent")
            }
            .background { clip(BackgroundClip.Text) }
            .textShadow(0.px, 0.px, 40.px, Color.rgba(6, 182, 212, 0.3f))
            .margin(bottom = 16.px)
            .animation(
                FadeInDown.toAnimation(duration = 0.8.s, timingFunction = AnimationTimingFunction.EaseOut)
                )
    }
}

val PageSubtitleStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.125.cssRem)
            .color(Color.rgb(0x94a3b8))
            .maxWidth(600.px)
            .margin(0.px, autoLength)
            .padding { bottom(30.px) }
    }
}

val SchoolLogoStyle = CssStyle {
    base {
        Modifier
            .borderRadius(16.px)
            .background(
                Background.of(
                    image = linearGradient(135.deg) {
                        add(Color.rgba(6, 182, 212, 0.2f), 0.percent)
                        add(Color.rgba(34, 211, 238, 0.1f), 100.percent)
                    }.toImage()
                )
            )
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .padding(12.px)
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.3f))
            .boxShadow(
                BoxShadow.of(
                    0.px,
                    8.px,
                    24.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.2f),
                ),
                BoxShadow.of(
                    0.px,
                    1.px,
                    0.px,
                    0.px,
                    Color.rgba(255, 255, 255, 0.1f),
                    true,
                )
            )
            .flexShrink(0)
            .size(80.px)
    }
    cssRule(" img") {
        Modifier
            .objectFit(ObjectFit.Contain)
            .fillMaxSize()
    }
}


val FadeInDown = Keyframes {
    from {
        Modifier
            .opacity(0)
            .transform { translateY((-30).px) }
    }
    to {
        Modifier
            .opacity(1)
            .transform { translateY(0.px) }
    }
}

val FadeInUp = Keyframes {
    from {
        Modifier
            .opacity(0)
            .transform { translateY(30.px) }
    }
    to {
        Modifier
            .opacity(1)
            .transform { translateY(0.px) }
    }
}
