package pl.michal_cyran.portfolio.projects.presentation.description

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box

import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.projects.domain.ProjectLink
import pl.michal_cyran.portfolio.projects.domain.ProjectLinkType

@Composable
fun ProjectLinkButton(
    link: ProjectLink
) {
    val icon = when (link.type) {
        ProjectLinkType.GITHUB -> "github.png"
        ProjectLinkType.GOOGLE_PLAY -> "google_play.png"
        ProjectLinkType.APP_STORE -> "app_store.png"
        ProjectLinkType.WEBSITE -> "website.png"
        ProjectLinkType.OTHER -> "link.png"
    }

    val color = // when (link.type) {
        Colors.Cyan
//        ProjectLinkType.WEBSITE -> MaterialTheme.colorScheme.primary
//        else -> MaterialTheme.colorScheme.primaryContainer
//    }

    val contentColor = Colors.White/*when (link.type) {
        ProjectLinkType.WEBSITE -> MaterialTheme.colorScheme.onPrimary
        else -> MaterialTheme.colorScheme.onSurface
    }*/

    val text = when (link.type) {
        ProjectLinkType.GITHUB -> "GitHub"
        ProjectLinkType.GOOGLE_PLAY -> "Google Play"
        ProjectLinkType.APP_STORE -> "App Store"
        ProjectLinkType.WEBSITE -> "Website"
        ProjectLinkType.OTHER -> "Other"
    }

    Link(
        path = link.to
    ) {
        Box(
            modifier = LinkButtonStyle.toModifier()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.px)
            ) {
                Image(
                    src = icon,
                    alt = "",
                    modifier = LinkIconStyle.toModifier()
                )
                Text(
                    text,
                )
            }
        }
    }
}