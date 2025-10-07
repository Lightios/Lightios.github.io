package pl.michal_cyran.portfolio.social_media.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.LinkStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.components.widgets.Headline
import pl.michal_cyran.portfolio.social_media.data.socialMedia

@Composable
fun SocialMediaScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.px, Alignment.CenterVertically)
    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(bottom = 48.dp)
//        ) {
//            IconButton(
//                onClick = { /* Navigate back */ }
//            ) {
//                Icon(
//                    painter = painterResource(Res.drawable.calendar_month),
//                    contentDescription = "Back to Home",
//                    tint = Color.White,
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//
//            Spacer(modifier = Modifier.width(8.dp))
//
//            Text(
//                text = "Back to Home",
//                color = Color.White,
//                fontSize = 16.sp
//            )
//        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
//                .fillMaxWidth()
                .padding(bottom = 48.px)
        ) {

            Headline(
                title = Res.string.social_media_title,
                subtitle = Res.string.social_media_subtitle,
            )
        }

        // Platform cards
        Row(
            modifier = Modifier.fillMaxWidth(60.percent),
            horizontalArrangement = Arrangement.spacedBy(24.px)
        ) {
            socialMedia.forEach { platform ->
                PlatformCard(
                    platform = platform,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}
