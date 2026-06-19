package pl.michal_cyran.portfolio.projects.presentation.description

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.projects.domain.ProjectLink
import pl.michal_cyran.portfolio.projects.domain.ProjectLinkType

@Composable
fun ProjectLinkButton(link: ProjectLink) {
    val icon = when (link.type) {
        ProjectLinkType.GITHUB -> "github.png"
        ProjectLinkType.GOOGLE_PLAY -> "google_play.png"
        ProjectLinkType.APP_STORE -> "app_store.png"
        ProjectLinkType.WEBSITE -> "web.svg"
        ProjectLinkType.OTHER -> "link.png"
    }
    val label = when (link.type) {
        ProjectLinkType.GITHUB -> "GitHub"
        ProjectLinkType.GOOGLE_PLAY -> "Google Play"
        ProjectLinkType.APP_STORE -> "App Store"
        ProjectLinkType.WEBSITE -> "Website"
        ProjectLinkType.OTHER -> "Link"
    }

    // Link wraps a single Row — the Box wrapper was redundant.
    Link(
        path = link.to,
        modifier = LinkButtonStyle.toModifier()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.px)
        ) {
            Image(
                src = icon,
                alt = label,
                modifier = LinkIconStyle.toModifier()
            )
            Text(label)
        }
    }
}