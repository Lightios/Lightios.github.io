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
                Text("// cześć, jestem")
            }

            H1(attrs = HeroTitleStyle.toAttrs()) {
                Text("Michał Cyran —")
                Br()
                Span { Text("Kotlin") }
                Text(" dev")
                Br()
                Text("& math enthusiast")
            }

            P(attrs = HeroDescStyle.toAttrs()) {
                Text("Pasjonuję się aplikacji w ")
                SpanText(
                    text = "Kotlinie",
                )
                Text(" na Androida, a także inne platformy dzięki KMP. Tworzę też wizualizacje matematyczne z użyciem ")
                SpanText(
                    text = "Pythona",
                )
                Text(" z biblioteką ")
                SpanText(
                    text = "Manim",
                )
                Text(".")
            }
        }

        // RIGHT SIDE
        Div() {

            Div(attrs = StackPanelStyle.toAttrs()) {

                P(attrs = StackTitleStyle.toAttrs()) {
                    Text("// tech stack")
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