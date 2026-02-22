package pl.michal_cyran.portfolio.core.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.core.presentation.styles.TechDotStyle
import pl.michal_cyran.portfolio.core.presentation.styles.TechItemStyle
import pl.michal_cyran.portfolio.core.presentation.styles.TechNameStyle
import pl.michal_cyran.portfolio.core.presentation.styles.TechRoleStyle
import pl.michal_cyran.portfolio.core.presentation.styles.kotlin

@Composable
fun TechItem(
    name: String,
    role: String,
    color: Color,
) {
    Box(
        TechItemStyle.toModifier(),
    ) {

        Box(
            TechDotStyle
                .toModifier()
                .background(color)
                .boxShadow(0.px, 0.px, 6.px, 0.px, color)
        )

        SpanText(
            name,
            TechNameStyle.toModifier()
        )

        SpanText(
            role,
            TechRoleStyle.toModifier()
        )
    }
}