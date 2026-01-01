package pl.michal_cyran.portfolio.projects.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.TextOverflow
import com.varabyte.kobweb.compose.css.WhiteSpace

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxHeight
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.pointerEvents
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textOverflow
import com.varabyte.kobweb.compose.ui.modifiers.title
import com.varabyte.kobweb.compose.ui.modifiers.whiteSpace
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaStar
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.presentation.CardStyle
import pl.michal_cyran.portfolio.skils.data.skillsBySlug
import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.presentation.description.LogoStyle


@Composable
fun ProjectCard(
    project: Project,
    onProjectClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .then(backgroundContainer.toModifier())
            .then(CardStyle.toModifier())
            .height(450.px)
            .onClick { onProjectClick() }
            .cursor(Cursor.Pointer)
    ) {
        Column(
            modifier = Modifier.padding(leftRight = 10.px, topBottom = 5.px).fillMaxHeight().fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.px)
            ) {
                Box(
                    LogoStyle.toModifier().size(64.px).margin(5.px),
//                    modifier = Modifier
//                        .size(64.px),
//                        .background(MaterialTheme.colorScheme.surfaceContainerLow, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        src = project.logo,
                        alt = "Project Logo",
                        modifier = Modifier.size(60.px),
                    )
                }

                TypeBadge(
                    type = project.type
                )

                Spacer()

                if (project.isImportant) {
                    FaStar(
                        modifier = Modifier
                            .color(Colors.Gold)
                            .title("Ważny projekt"),
                        style = IconStyle.FILLED
                    )
                }
            }


            H4 {
                Text(
                    project.name
                )
            }


            P(
                Modifier
                    .overflow(Overflow.Hidden)
                    .textOverflow(TextOverflow.Ellipsis)
                    .whiteSpace(WhiteSpace.Normal)
                    .display(DisplayStyle.Block)
                    .maxHeight(120.px)
                    .toAttrs {  }
            ) {
                Text(project.shortDescription)
            }


        }

        Box(
            Modifier.align(Alignment.BottomCenter)
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                HorizontalDivider(
                    modifier = Modifier.padding(10.px)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(leftRight = 20.px, topBottom = 2.px),
                    horizontalArrangement = Arrangement.spacedBy(8.px),
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    project.skills.forEach { slug ->
                        val skill = skillsBySlug[slug]!!
                        Image(
                            src = skill.icon,
                            alt = skill.name,
                            modifier = Modifier
                                .size(50.px)
                                .border(color = Colors.Cyan, width = 1.px)
                                .objectFit(ObjectFit.Contain)
                                .borderRadius(8.px)
                        )
                    }
                }
            }
        }

    }
}