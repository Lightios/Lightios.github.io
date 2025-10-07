package pl.michal_cyran.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ScrollSnapAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.Col
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.components.layouts.PageLayoutData

import pl.michal_cyran.portfolio.education.domain.Education
import pl.michal_cyran.portfolio.experience.presentation.ExperienceScreen
import pl.michal_cyran.portfolio.skils.presentation.SkillsScreen


@InitRoute
fun initSkillsPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(Res.string.skills))
}


@Page
@Layout(".components.layouts.PageLayout")
@Composable
fun SkillsPage() {
    SkillsScreen()
}
