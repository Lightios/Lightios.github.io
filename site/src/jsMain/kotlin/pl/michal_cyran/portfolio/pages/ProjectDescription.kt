package pl.michal_cyran.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import pl.michal_cyran.portfolio.components.layouts.PageLayoutData
import pl.michal_cyran.portfolio.projects.presentation.description.ProjectDetailsScreen

@InitRoute
fun initProjectDescriptionPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(Res.string.projects_description))
}

@Page()
@Layout(".components.layouts.PageLayout")
@Composable
fun ProjectDescriptionPage(ctx: PageContext) {
    val projectSlug = ctx.route.params.getValue("project")

    ProjectDetailsScreen(
        projectSlug = projectSlug,
    )
}