package pl.michal_cyran.portfolio.core.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import pl.michal_cyran.portfolio.core.presentation.styles.HeroDescStyle
import pl.michal_cyran.portfolio.core.presentation.styles.HeroLabelStyle
import pl.michal_cyran.portfolio.core.presentation.styles.HeroStyle
import pl.michal_cyran.portfolio.core.presentation.styles.HeroTitleStyle
import pl.michal_cyran.portfolio.core.presentation.styles.StackPanelStyle
import pl.michal_cyran.portfolio.core.presentation.styles.StackTitleStyle
import pl.michal_cyran.portfolio.core.presentation.styles.TechListStyle

@Composable
fun HeroSection() {

    Section(attrs = HeroStyle.toAttrs()) {

        // LEFT SIDE
        Div(attrs = Modifier.classNames("hero-left").toAttrs()) {

            P(attrs = HeroLabelStyle.toAttrs()) {
                Text(Res.string.hero_label)
            }

            H1(attrs = HeroTitleStyle.toAttrs()) {
                Text(Res.string.hero_title_name)
                Br()
                Span { Text(Res.string.hero_title_kotlin) }
                Text(Res.string.hero_title_dev)
                Br()
                Text(Res.string.hero_title_math)
            }

            P(attrs = HeroDescStyle.toAttrs()) {
                Text(Res.string.hero_desc_part1)
                SpanText(Res.string.kotlin_locative)
                Text(Res.string.hero_desc_part2)
                SpanText(Res.string.python_genitive)
                Text(Res.string.hero_desc_part3)
                SpanText(text = "Manim")
                Text(".")
            }
        }

        // RIGHT SIDE
        Div() {
            Div(attrs = StackPanelStyle.toAttrs()) {

                P(attrs = StackTitleStyle.toAttrs()) {
                    Text(Res.string.stack_title)
                }

                Div(attrs = TechListStyle.toAttrs()) {
                    TechItem("Kotlin", "primary", Colors.Orange)
                    TechItem("Jetpack Compose", "mobile", Colors.Green)
                    TechItem("Compose Multiplatform", "desktop", Colors.SkyBlue)
                    TechItem("Kobweb", "web", Colors.CornflowerBlue)
                    TechItem("Python", "visualizations", Colors.Yellow)
                }
            }
        }
    }
}