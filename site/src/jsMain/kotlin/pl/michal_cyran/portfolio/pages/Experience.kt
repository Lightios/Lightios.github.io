package pl.michal_cyran.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
//import com.varabyte.kobweb.core.layout.Layout
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.components.layouts.PageLayoutData
import pl.michal_cyran.portfolio.experience.data.experiences
import pl.michal_cyran.portfolio.experience.presentation.ExperienceScreen

@InitRoute
fun initExperiencePage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(Res.string.experience))
}

@Page
@Layout(".components.layouts.PageLayout")
@Composable
fun ExperiencePage() {
    ExperienceScreen()
}