package pl.michal_cyran.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import pl.michal_cyran.portfolio.achievements.presentation.AchievementsScreen
import pl.michal_cyran.portfolio.components.layouts.PageLayoutData
import pl.michal_cyran.portfolio.experience.presentation.ExperienceScreen

@InitRoute
fun initAchievementsPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(Res.string.achievements))
}

@Page
@Layout(".components.layouts.PageLayout")
@Composable
fun AchievementsPage() {
    AchievementsScreen()
}