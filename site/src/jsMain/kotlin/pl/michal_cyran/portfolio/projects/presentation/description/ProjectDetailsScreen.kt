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
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderLeft
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.borderTop
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.maxHeight
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.core.presentation.CardStyle
import pl.michal_cyran.portfolio.projects.data.projects
import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.presentation.CategoryBadge
import pl.michal_cyran.portfolio.projects.presentation.Screenshot
import pl.michal_cyran.portfolio.projects.presentation.TypeBadge
import pl.michal_cyran.portfolio.skils.data.skillsBySlug

@Composable
fun ProjectDetailsScreen(projectSlug: String) {
    val project: Project = projects.find { it.slug == projectSlug }
        ?: throw IllegalArgumentException("Project not found: $projectSlug")

    var showFullScreen by remember { mutableStateOf(false) }
    var screenshotToDisplay by remember { mutableStateOf("") }

    // ── Lightbox overlay ────────────────────────────────────────────────────
    if (showFullScreen) {
        Box(
            modifier = Modifier
                .position(Position.Fixed)
                .top(0.px).left(0.px)
                .width(100.vw).height(100.vh)
                .backgroundColor(Colors.Black.copy(alpha = 210))
                .zIndex(999)
                .onClick { showFullScreen = false },
            contentAlignment = Alignment.Center
        ) {
            Image(
                src = screenshotToDisplay,
                modifier = Modifier
                    .maxWidth(92.percent)
                    .maxHeight(92.percent)
                    .borderRadius(12.px)
            )
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {

        // ── 1. Hero — horizontal layout: logo | title + badges + links ──────
        Box(CardStyle.toModifier().fillMaxWidth()) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(24.px),
                modifier = Modifier.padding(24.px).fillMaxWidth()
            ) {
                // Logo — fixed size, no bottom margin needed here
                Box(modifier = LogoStyle.toModifier()) {
                    Image(
                        src = project.logo,
                        alt = "${project.name} logo",
                        modifier = Modifier
                            .borderRadius(50.percent)
                            .objectFit(ObjectFit.Cover)
                            .fillMaxSize()
                    )
                }

                // Title block fills remaining width
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.px),
                    modifier = Modifier.weight(1f)
                ) {
                    H2 { Text(project.name) }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.px)
                    ) {
                        TypeBadge(type = project.type)
                        CategoryBadge(category = project.category)
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.px)
                    ) {
                        project.links.forEach { link -> ProjectLinkButton(link = link) }
                    }
                }
            }
        }

        // ── 2. Overview + Technical details — single card, two columns ──────
        Box(CardStyle.toModifier().fillMaxWidth()) {
            SimpleGrid(
                numColumns(1, md = 2),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(24.px),
                    verticalArrangement = Arrangement.spacedBy(12.px)
                ) {
                    H3 { Text(Res.string.project_overview) }
                    P { Text(project.description) }
                }

                Column(
                    modifier = Modifier
                        .padding(24.px)
                        .borderLeft(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.15f)),
                    verticalArrangement = Arrangement.spacedBy(12.px)
                ) {
                    H3 { Text(
                        Res.string.technical_overview
                    ) }

                    val text = if (project.technicalDescription != "") project.technicalDescription else Res.string.technical_description_placeholder
                    P {
                        P { Text(
                            text
                        ) }
                    }
                }
            }
        }

        // ── 3. Screenshots + Tech stack — single card, ruled sections ───────
        val hasScreenshots = project.screenshots.isNotEmpty()
        val hasSkills = project.skills.isNotEmpty()

        if (hasScreenshots || hasSkills) {
            Box(CardStyle.toModifier().fillMaxWidth()) {
                Column(modifier = Modifier.fillMaxWidth()) {

                    if (hasScreenshots) {
                        Column(modifier = Modifier.padding(24.px)) {
                            H3 { Text(Res.string.screenshots) }

                            if (project.screenshots.size == 1) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 16.px)
                                ) {
                                    Box(modifier = Modifier.maxWidth(640.px).fillMaxWidth()) {
                                        Screenshot(
                                            resource = project.screenshots.first().resource,
                                            screenshotText = project.screenshots.first().label,
                                            onClick = {
                                                screenshotToDisplay = project.screenshots.first().resource
                                                showFullScreen = true
                                            }
                                        )
                                    }
                                }
                            } else {
                                SimpleGrid(
                                    numColumns(1, sm = 2, md = 3),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .gap(16.px)
                                        .padding(top = 16.px)
                                ) {
                                    for (screenshot in project.screenshots) {
                                        Screenshot(
                                            resource = screenshot.resource,
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

                    if (hasSkills) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(24.px)
                                .then(
                                    if (hasScreenshots)
                                        Modifier.borderTop(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.15f))
                                    else Modifier
                                )
                        ) {
                            H3 { Text(Res.string.tech_stack) }

                            SimpleGrid(
                                numColumns(4, md = 8),
                                modifier = Modifier.fillMaxWidth().padding(top = 16.px)
                            ) {
                                project.skills.forEach { slug ->
                                    val skill = skillsBySlug[slug]!!
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.spacedBy(8.px),
                                        modifier = Modifier.padding(12.px).fillMaxWidth()
                                    ) {
                                        Box(SkillLogoStyle.toModifier()) {
                                            Image(
                                                src = skill.icon,
                                                alt = skill.name,
                                                modifier = Modifier
                                                    .objectFit(ObjectFit.Contain)
                                                    .fillMaxSize(60.percent)
                                                    .align(Alignment.Center)
                                            )
                                        }
                                        Text(skill.name)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
