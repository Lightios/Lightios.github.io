package pl.michal_cyran.portfolio.education.presentation

import androidx.compose.runtime.Composable
import pl.michal_cyran.portfolio.education.domain.Subject
import pl.michal_cyran.portfolio.education.domain.SubjectCategory

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.presentation.StatusBadge
import pl.michal_cyran.portfolio.experience.domain.Experience
import pl.michal_cyran.portfolio.experience.presentation.StatItem
import pl.michal_cyran.portfolio.experience.presentation.TechnologyBadge
import pl.michal_cyran.portfolio.experience.presentation.Timeline


@Composable
fun SubjectItem(
    subject: Subject,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .then(
                backgroundContainer.toModifier()
            )
//            .graphicsLayer(
//                scaleX = scale,
//                scaleY = scale
//            ).hoverable(
//                interactionSource
//            )
//            .fillMaxWidth()
//            .padding(horizontal = 12.dp, vertical = 4.dp),
//        colors = CardDefaults.cardColors(
//            containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.2f),
//            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
//        ),
//        shape = RoundedCornerShape(16.dp)
    ) {
        Text(
            subject.name,
//            style = MaterialTheme.typography.bodySmall,
//            modifier = Modifier
//                .padding(vertical = 10.dp, horizontal = 16.dp)
        )
    }
}