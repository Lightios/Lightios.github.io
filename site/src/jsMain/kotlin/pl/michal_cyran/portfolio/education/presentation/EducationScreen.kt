package pl.michal_cyran.portfolio.education.presentation

import Res
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.components.widgets.Headline
import pl.michal_cyran.portfolio.core.presentation.styles.PageHeaderStyle
import pl.michal_cyran.portfolio.core.presentation.styles.PageSubtitleStyle
import pl.michal_cyran.portfolio.education.data.education


@Composable
fun EducationScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Headline(
            title = Res.string.education_title,
            subtitle = Res.string.education_subtitle,
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(100.percent),
            horizontalArrangement = Arrangement.spacedBy(60.px)
        ) {

            for (education in education) {
                EducationCard(
                    education = education,
                    modifier = Modifier.width(50.percent)
                )
            }
        }
    }
}

