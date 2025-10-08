package pl.michal_cyran.portfolio.projects.presentation

import androidx.compose.runtime.Composable

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory

@Composable
fun ProjectsSection(
    projectCategory: ProjectCategory,
    projects: List<Project>,
    searchQuery: String,
    onProjectClick: (String) -> Unit,
) {
    val filteredProjects = projects.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    }

    if (filteredProjects.isNotEmpty()) {
        Column(
            modifier = Modifier
                .fillMaxWidth(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.px),
                modifier = Modifier.padding(bottom = 24.px)
            ) {
                ProjectCategoryIcon(
                    category = projectCategory,
                )

                H2 {
                    Text(projectCategory.displayName)
                }
            }

            SimpleGrid(
                numColumns(1, md=3,),
                modifier = Modifier.gap(20.px)
            ) {
                filteredProjects.forEach { project ->
                    ProjectCard(
                        project = project,
                        onProjectClick = { onProjectClick(project.slug) },
                    )
                }
            }
        }
    }
}
