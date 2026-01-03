package pl.michal_cyran.portfolio.education.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextTransform
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.letterSpacing
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textTransform
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul
import pl.michal_cyran.portfolio.colors.secondaryContainer
import pl.michal_cyran.portfolio.core.presentation.styles.ListStyle
import pl.michal_cyran.portfolio.education.domain.Subject
import pl.michal_cyran.portfolio.education.domain.SubjectCategory


@Composable
fun CategorySection(
    category: SubjectCategory,
    subjects: List<Subject>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
    ) {
        Box(
            modifier = secondaryContainer.toModifier()
                .fontSize(1.cssRem)
                .fontWeight(600)
                .padding(12.px, 20.px)
                .borderRadius(12.px)
                .textTransform(TextTransform.None)
                .letterSpacing(0.3.px)
                .boxShadow(0.px, 4.px, 12.px, 0.px, Color.rgba(0, 0, 0, 0.3f))
                .margin(bottom = 16.px)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                H5(
                    Modifier.color(categoryToColor(category)).toAttrs()
                ) {
                    Text(category.displayName)
                }

            }
        }
        Ul(
            ListStyle.toAttrs {  }
        ) {
            subjects.forEach { subject ->
                Li {
                    Text(
                        subject.name,
                    )
                }
            }
        }
    }
}