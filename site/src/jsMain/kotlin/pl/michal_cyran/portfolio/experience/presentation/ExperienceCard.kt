
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.dom.svg.Image
import com.varabyte.kobweb.compose.dom.svg.Text
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
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
import pl.michal_cyran.portfolio.core.BadgeColors
import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.core.presentation.CardStyle
import pl.michal_cyran.portfolio.core.presentation.ChipContainerStyle
import pl.michal_cyran.portfolio.core.presentation.StatusBadge
import pl.michal_cyran.portfolio.core.presentation.styles.EducationCardStyle
import pl.michal_cyran.portfolio.core.presentation.styles.ImageBoxStyle
import pl.michal_cyran.portfolio.experience.domain.Experience
import pl.michal_cyran.portfolio.experience.presentation.StatItem
import pl.michal_cyran.portfolio.experience.presentation.TechnologyBadge
import pl.michal_cyran.portfolio.experience.presentation.Timeline
import pl.michal_cyran.portfolio.toSitePalette


@Composable
fun ExperienceCard(
    experience: Experience,
) {
    Box(
       backgroundContainer.toModifier()
           .then(CardStyle.toModifier())
//           .then(EducationCardStyle.toModifier())
            .margin(topBottom = 40.px),
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(24.px),
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(100.percent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.px)
            ) {
                Box(
                    modifier =
                        ImageBoxStyle.toModifier()
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        src = experience.icon,
                        alt = experience.title,
                    )
                }

                Column(modifier = Modifier.fillMaxWidth()) {
                    H2(
                        Modifier.padding {
                            left(0.px)
                        }.margin { left(0.px) }.toAttrs {  }
                    ) {
                        Text(
                            experience.title,
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.px),
                        modifier = ChipContainerStyle.toModifier().fillMaxWidth()
                    ) {
                        StatusBadge(
                            Badge(
                                text = Res.string.n_years.format(
                                    count = experience.durationInYears.toString(),
                                    number = experience.durationInYears,
                                ),
                                color = BadgeColors.gold
                            )
                        )

                        experience.badges.forEach { badge ->
                            StatusBadge(badge = badge)
                        }
//
//                        Text(
//                            value = Res.string.n_years.format(
//                                count = experience.durationInYears.toString(),
//                                number = experience.durationInYears,
//                            )
//                        )
                    }
                }
            }


            for (responsibility in experience.responsibilities) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.px)
                ) {
                    Box(
                        modifier = Modifier
                            .size(8.px)
                            .background(Color("#06B6D4"))
                            .borderRadius(4.px)
                    )

                    H5 {
                        Text(
                            responsibility
                        )
                    }
                }
            }

            if (experience.technologies.isNotEmpty()) {
                Box(modifier = Modifier.height(20.px))

                H6 {
                    SpanText(
                        text = Res.string.primary_technologies
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.px)
                ) {
                    experience.technologies.forEach { tech ->
                        TechnologyBadge(technology = tech)
                    }
                }
            }


            // Timeline
            Timeline(
                experience = experience,
                modifier = Modifier.fillMaxWidth().padding(topBottom = 20.px)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                experience.stats.forEach { stat ->
                    StatItem(stat = stat)
                }
            }
        }
    }
}