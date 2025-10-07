package pl.michal_cyran.portfolio.core.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaBriefcase
import com.varabyte.kobweb.silk.components.icons.fa.FaCube
import com.varabyte.kobweb.silk.components.icons.fa.FaGears
import com.varabyte.kobweb.silk.components.icons.fa.FaRProject
import com.varabyte.kobweb.silk.components.icons.fa.FaSchool
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareShareNodes
import com.varabyte.kobweb.silk.components.icons.fa.FaTrophy
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.domain.Routes
import pl.michal_cyran.portfolio.core.domain.toPath

@Composable
fun NavigationCard(
    route: Routes,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = CardStyle.toModifier().then(modifier).height(350.px)
//        modifier = modifier
//            .then(backgroundContainer.toModifier())
//            .height(350.px)
//            .padding(
//                leftRight = 16.px,
//                topBottom = 8.px
//            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(100.percent).padding(16.px),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    IconWrapperStyle.toModifier()
                ) {
                    RouteIcon(route = route)
                }

                H1(
                    CardTitleStyle.toModifier().toAttrs {  }
                ) {
                    Text(
                        when (route) {
                            Routes.ACHIEVEMENTS -> Res.string.achievements
                            Routes.EDUCATION -> Res.string.education
                            Routes.EXPERIENCE -> Res.string.experience
                            Routes.PROJECTS -> Res.string.projects
                            Routes.SKILLS -> Res.string.skills
                            Routes.SOCIAL_MEDIA -> Res.string.social_media
                        }
                    )
                }
            }

            Spacer()

            P(
                CardDescriptionStyle.toAttrs {  }
            ) {
                Text(
                    when (route) {
                        Routes.ACHIEVEMENTS -> Res.string.achievements_subtitle
                        Routes.EDUCATION -> Res.string.education_subtitle
                        Routes.EXPERIENCE -> Res.string.experience_subtitle
                        Routes.PROJECTS -> Res.string.projects_subtitle
                        Routes.SKILLS -> Res.string.skills_subtitle
                        Routes.SOCIAL_MEDIA -> Res.string.social_media_subtitle
                    }
                )
            }


            Spacer()

            Link(
                path = route.toPath()
            ) {
                P(
                    CardLinkStyle.toAttrs {  }
                ) {
                    Text(Res.string.view_more)
                }
            }
        }
    }


}

@Composable
fun RouteIcon(
    route: Routes,
) {
    val size = IconSize.LG

    when (route) {
        Routes.ACHIEVEMENTS -> FaTrophy(size = size)
        Routes.EDUCATION -> FaSchool(size = size)
        Routes.EXPERIENCE -> FaBriefcase(size = size)
        Routes.PROJECTS -> FaCube(size = size)
        Routes.SKILLS -> FaGears(size = size)
        Routes.SOCIAL_MEDIA -> FaSquareShareNodes(size = size)
    }
}