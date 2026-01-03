package pl.michal_cyran.portfolio.education.presentation

import Res
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaCalendar
import com.varabyte.kobweb.silk.components.icons.fa.FaMapLocation
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H5

import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.presentation.styles.EducationCardStyle
import pl.michal_cyran.portfolio.core.presentation.styles.ImageBoxStyle
import pl.michal_cyran.portfolio.core.presentation.styles.ListStyle
import pl.michal_cyran.portfolio.education.domain.Education


@Composable
fun EducationCard(
    education: Education,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .then(backgroundContainer.toModifier())
            .then(EducationCardStyle.toModifier()),
    ) {
        Column(
            modifier = Modifier
                .padding(
                    leftRight = 1.cssRem,
                    topBottom = 2.cssRem
                )
                .fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                H2(
                    Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .toAttrs {  }
                ) {
                    Text(
                        education.title,
                    )
                }
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 8.px)
                    .display(DisplayStyle.Flex)
                    .gap(2.cssRem)
                    .position(Position.Relative)
                    .zIndex(1)
                    .margin(bottom = 24.px)
            ) {
                Box(
                    modifier = ImageBoxStyle.toModifier()
                ) {
                    Image(
                        src = education.icon,
                        alt = "Institution",
                    )
                }


                H3 {
                    Text(
                        education.institution
                    )
                }
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(2.cssRem),
                modifier = Modifier.padding(bottom = 8.px)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                ) {
                    FaCalendar(
                        modifier = Modifier.color(
                            Color.rgb(0x64748B)
                        )
                    )

                    H4(
                        Modifier
                            .color(Color.rgb(0x94a3b8))
                            .fontSize(0.95.cssRem)
                            .padding(0.px)
                            .margin(0.px)
                            .toAttrs {  }
                    ) {
                        Text(
                            Res.string.n_years.format(number = education.durationInYears, education.durationInYears.toString()),
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                ) {
                    FaMapLocation(
                        modifier = Modifier.color(
                            Color.rgb(0x64748B)
                        )
                    )

                    H4(
                        Modifier
                            .color(Color.rgb(0x94a3b8))
                            .fontSize(0.95.cssRem)
                            .padding(0.px)
                            .margin(0.px)
                            .toAttrs {  }
                    ) {
                        Text(
                            education.location,
                        )
                    }
                }
            }


            H3 {
                Text(
                    Res.string.n_courses.format(
                        number = education.subjects.size,
                        education.subjects.size.toString()
                    )
                )
            }

            education.subjects
                .groupBy { it.category }

                .forEach { (category, subjects) ->
                    CategorySection(
                        category = category,
                        subjects = subjects,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

            if (education.certificates.isNotEmpty()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    H3 {
                        Text(
                            value = Res.string.n_certificates.format(
                                number = education.certificates.size,
                                education.certificates.size.toString()
                            ),
                        )
                    }

                }

                Ul(
                    ListStyle.toAttrs {  }
                ) {
                    education.certificates.forEach { certificate ->
                        CertificateItem(certificate = certificate)
                    }
                }
            }
        }
    }
}