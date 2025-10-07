package pl.michal_cyran.portfolio.achievements.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.dom.svg.Text
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.achievements.domain.Achievement
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.presentation.CardStyle
import pl.michal_cyran.portfolio.core.presentation.styles.EducationCardStyle

@Composable
fun AchievementCard(achievement: Achievement) {
//    val interactionSource = remember { MutableInteractionSource() }
//    val isHovered by interactionSource.collectIsHoveredAsState()
//    val scale by animateFloatAsState(
//        targetValue = if (isHovered) 1.05f else 1f,
//        label = "CardScale"
//    )
    Box(
        modifier = backgroundContainer.toModifier()
            .then(CardStyle.toModifier())
            .width(100.percent)
            .margin(topBottom = 40.px)
//            .toAttrs(),
    ) {
        Column(
            modifier = Modifier.padding(24.px)
                .width(100.percent)
        ) {
            // Achievement Title
            H3 {
                Text(
                    achievement.name,
//                color = MaterialTheme.colorScheme.onSurface,
//                style = MaterialTheme.typography.titleMedium,
                )
            }

            Box(modifier = Modifier.height(16.px))

            // Date and Organization
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        src = "calendar_month.svg",
                        alt = "Date",
//                        tint = Color(0xFF06B6D4),
                        modifier = Modifier.size(24.px)
                    )
                    Box(modifier = Modifier.width(8.px))

                    H6 {
                        Text(
                            achievement.date.toString(),
                        )
                    }
//                    Text(
//                        text = achievement.date.toString(),
////                        color = Color(0xFF06B6D4),
////                        style = MaterialTheme.typography.titleSmall,
//                    )
                }

                Box(modifier = Modifier.weight(1f))

                // Badges
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.px)
                ) {
                    if (achievement.isFirstPlace) {
                        FirstPlaceBadge()
                    }

                    LevelBadge(achievement.level)
                }
            }

            Box(modifier = Modifier.height(12.px))

            // Organization
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    src = "source_environment.svg",
                    alt = "Organization",
//                    tint = Color(0xFF64748B),
//                    modifier = Modifier.size(24.dp)
                )
                Box(modifier = Modifier.width(8.px))

                H6 {
                    Text(
                        achievement.organization,
                    )
                }
//                Text(
//                    text = achievement.organization,
//                    color = Color(0xFF64748B),
//                    style = MaterialTheme.typography.titleSmall,
//                )
            }
        }
    }
}