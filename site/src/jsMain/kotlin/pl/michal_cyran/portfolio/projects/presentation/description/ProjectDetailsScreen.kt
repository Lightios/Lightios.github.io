package pl.michal_cyran.portfolio.projects.presentation.description

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.ObjectFit

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.maxHeight
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.core.presentation.CardStyle
import pl.michal_cyran.portfolio.projects.data.projects
import pl.michal_cyran.portfolio.projects.domain.Screenshot
import pl.michal_cyran.portfolio.projects.presentation.CategoryBadge
import pl.michal_cyran.portfolio.projects.presentation.Screenshot
import pl.michal_cyran.portfolio.projects.presentation.TypeBadge
import pl.michal_cyran.portfolio.skils.data.skillsBySlug

@Composable
fun ProjectDetailsScreen(
    projectSlug: String,
) {
    val project = projects.find { it.slug == projectSlug }
        ?: throw IllegalArgumentException("Project not found: $projectSlug")

    var showFullScreen by remember { mutableStateOf(false) }
    var screenshotToDisplay by remember { mutableStateOf("") }

    if (showFullScreen) {
        Box(
            modifier = Modifier
                .position(Position.Fixed)
                .top(0.px)
                .left(0.px)
                .width(100.vw)
                .height(100.vh)
                .backgroundColor(Colors.Black.copy(alpha = 200))
                .zIndex(999)
                .onClick { showFullScreen = false },
            contentAlignment = Alignment.Center
        ) {
            Image(
                src = screenshotToDisplay,
                modifier = Modifier
                    .maxWidth(90.percent)
                    .maxHeight(90.percent)
                    .borderRadius(8.px)
            )
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth(100.percent)
    ) {
        Box(
            CardStyle.toModifier()
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.px).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.px)
            ) {

                Box(
                    modifier = LogoStyle.toModifier()
                ) {
                    Image(
                        src = project.logo,
                        alt = "Project Logo",
                        modifier = Modifier
                            .borderRadius(50.percent)
                            .objectFit(ObjectFit.Cover)
                            .fillMaxSize()
                    )
                }


                H1 {
                    Text(
                        project.name,
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.px),
                    modifier = Modifier.padding(bottom = 16.px)
                ) {
                    TypeBadge(
                        type = project.type
                    )

                    CategoryBadge(
                        category = project.category
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.px),
                    modifier = Modifier.padding(bottom = 16.px)
                ) {
                    project.links.forEach { link ->
                        ProjectLinkButton(link = link)
                    }
                }
            }
        }

        Box(
            modifier = CardStyle.toModifier().fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(40.px)
            ) {

                H2 {
                    Text(Res.string.project_overview)
                }

                P {
                    Text(
                        project.description,
                    )
                }

            }
        }

        if (!project.screenshots.isEmpty()) {
            Box(
                modifier = CardStyle.toModifier()
            ) {
                Column(
                    modifier = Modifier.padding(40.px)
                ) {
                    Text(
                        Res.string.screenshots,
                    )

                    Row(
                        ScreenshotsGridStyle.toModifier()
                    ) {
                        for (screenshot in project.screenshots) {
                            Screenshot(
                                screenshot.resource,
                                screenshotText = screenshot.label,
                                onClick = {
                                    screenshotToDisplay = screenshot.resource
                                    showFullScreen = true
                                }
                            )
                        }
                    }
                }
            }
        }

        SimpleGrid(
            numColumns(3, md = 6),
            modifier = CardStyle.toModifier().fillMaxWidth(),
        ) {
            project.skills.forEach { slug ->
                val skill = skillsBySlug[slug]!!

                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.px),
                        modifier = Modifier.padding(20.px).fillMaxWidth()
                    ) {
                        Box(
                            LogoStyle.toModifier()
                        ) {
                            Image(
                                skill.icon,
                                modifier = Modifier.objectFit(ObjectFit.Contain)
                                    .fillMaxSize(50.percent)
                                    .align(Alignment.Center)
                            )
                        }

                        Text(
                            skill.name,
                        )
                    }
                }
            }
        }
    }
}