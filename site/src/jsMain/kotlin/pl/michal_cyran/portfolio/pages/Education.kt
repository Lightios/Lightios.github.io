package pl.michal_cyran.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import pl.michal_cyran.portfolio.achievements.presentation.AchievementsScreen
import pl.michal_cyran.portfolio.components.layouts.PageLayoutData
import pl.michal_cyran.portfolio.education.presentation.EducationScreen

@InitRoute
fun initEducationPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(Res.string.education))
}

@Page
@Layout(".components.layouts.PageLayout")
@Composable
fun EducationPage() {
    EducationScreen()
}