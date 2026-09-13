package pl.michal_cyran.portfolio.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import pl.michal_cyran.portfolio.core.presentation.styles.HeroDescStyle
import pl.michal_cyran.portfolio.core.presentation.styles.HeroLabelStyle
import pl.michal_cyran.portfolio.core.presentation.styles.HeroStyle
import pl.michal_cyran.portfolio.core.presentation.styles.HeroTitleStyle
import pl.michal_cyran.portfolio.core.presentation.styles.StackPanelStyle
import pl.michal_cyran.portfolio.core.presentation.styles.StackTitleStyle
import pl.michal_cyran.portfolio.core.presentation.styles.TechListStyle

@Composable
fun HeroSection() {
    Section(
        attrs = HeroStyle
            .toModifier()
            .fillMaxWidth()
            .toAttrs()
    ) {
        SimpleGrid(
            numColumns(base = 1, md = 2),
            modifier = Modifier.fillMaxWidth().gap(2.cssRem)
        ) {
            Column(modifier = Modifier) {
                P(attrs = HeroLabelStyle.toAttrs()) {
                    Text(Res.string.hero_label)
                }

                H1(attrs = HeroTitleStyle.toAttrs()) {
                    Text(Res.string.hero_title_name)
                }

                P(attrs = HeroLabelStyle.toAttrs()) {
                    Text(Res.string.story_label)
                }

                P(attrs = HeroDescStyle.toAttrs()) {
                    Text(Res.string.story_intro)
                }

                P(attrs = HeroLabelStyle.toAttrs()) {
                    Text(Res.string.focus_title)
                }

                P(attrs = HeroDescStyle.toAttrs()) {
                    Text(Res.string.focus_coroutines)
                }

                P(attrs = HeroLabelStyle.toAttrs()) {
                    Text(Res.string.learning_title)
                }

                P(attrs = HeroDescStyle.toAttrs()) {
                    Text(Res.string.learning_book)
                    Br()
                    Text(Res.string.learning_channels)
                }

                P(attrs = HeroLabelStyle.toAttrs()) {
                    Text(Res.string.beyond_title)
                }

                P(attrs = HeroDescStyle.toAttrs()) {
                    Text(Res.string.beyond_tutoring)
                }
//
//                P(attrs = HeroDescStyle.toAttrs()) {
//                    Text(Res.string.hero_desc_part1)
//                    SpanText(Res.string.kotlin_locative)
//                    Text(Res.string.hero_desc_part2)
//                    SpanText(Res.string.python_genitive)
//                    Text(Res.string.hero_desc_part3)
//                    SpanText(text = "Manim")
//                    Text(".")
//                }
            }

            Div {
                Div(attrs = StackPanelStyle.toAttrs()) {
                    P(attrs = StackTitleStyle.toAttrs()) { Text(Res.string.stack_title) }
                    Div(attrs = TechListStyle.toAttrs()) {
                        TechItem("Kotlin", "primary", Colors.Orange)
                        TechItem("Jetpack Compose", "mobile", Colors.Green)
                        TechItem("Compose Multiplatform", "desktop", Colors.SkyBlue)
                        TechItem("Kobweb", "web", Colors.CornflowerBlue)
                        TechItem("Python", "visualizations", Colors.Yellow)
                        Br()
                        TechItem("Ktor", "networking client", Colors.Purple)
                        TechItem("Spring Boot", "custom backend", Colors.Green)
                        TechItem("Firebase", "backend", Colors.OrangeRed)
                        TechItem("Room", "data storage", Colors.DarkOliveGreen)
                        TechItem("Kord", "Discord integration", Colors.DarkOrange)
                    }
                }
            }
        }
    }
}
