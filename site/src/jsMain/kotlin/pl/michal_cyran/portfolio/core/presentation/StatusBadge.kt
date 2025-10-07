package pl.michal_cyran.portfolio.core.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textShadow
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.whiteSpace
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import pl.michal_cyran.portfolio.core.domain.Badge

val ChipContainerStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .gap(0.75.cssRem)
        .maxWidth(800.px)
}
val ChipStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .padding(0.5.cssRem, 1.cssRem)
            .borderRadius(0.5.cssRem)
            .border(1.5.px, LineStyle.Solid)
            .background(Colors.Transparent)
            .fontSize(0.575.cssRem)
            .fontWeight(500)
            .transition(Transition.of("all", 0.2.s, TransitionTimingFunction.Ease))
            .whiteSpace(WhiteSpace.NoWrap)
            .textShadow(2.px, 2.px, 5.px, Colors.Gray)
    }
    hover {
        Modifier
            .background(Color.rgba(255, 255, 255, 0.05f))
            .transform { translateY((-1).px) }
    }
}

@Composable
fun StatusBadge(
    badge: Badge,
    modifier: Modifier = Modifier
) {

    SpanText(
        badge.text,
        modifier = ChipStyle.toModifier()
            .border { color(badge.color) }
            .color(badge.color)
    )
}