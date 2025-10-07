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
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.LinkStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.social_media.domain.SocialPlatform

@Composable
fun PlatformCard(
    platform: SocialPlatform,
    modifier: Modifier = Modifier
) {
//    val uriHandler = LocalUriHandler.current


    Box(
        modifier = modifier,
//        colors = CardDefaults.cardColors(
//            containerColor = MaterialTheme.colorScheme.surfaceContainer,
//            contentColor = MaterialTheme.colorScheme.onSurface,
//        ),
//        shape = RoundedCornerShape(16.dp),
//        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Column(
            modifier = Modifier.padding(24.px),
            verticalArrangement = Arrangement.spacedBy(16.px, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Header with icon, title, and badge
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 16.px)
            ) {
                Image(
                    src = platform.icon,
                    alt = "${platform.name} Icon",
                    modifier = Modifier
                        .size(48.px)
                        .borderRadius(8.px)
                )

                Column(modifier = Modifier.weight(1f)) {

                    H2 {
                        Text(platform.name)
                    }
//                    Text(
//                        text = platform.name,
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White
//                    )

//                    Spacer(modifier = Modifier.height(8.dp))

//                    StatusBadge(badge = platform.badge)
                }
            }

            // Description
            H5 {
                Text(
                    value = platform.description,
//                    fontSize = 14.sp,
//                    color = Color(0xFF94A3B8),
//                    lineHeight = 20.sp,
//                    modifier = Modifier.padding(bottom = 20.dp)
                )
            }


//            // Stats
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(24.dp),
//                modifier = Modifier.padding(bottom = 20.dp)
//            ) {
//                platform.stats.forEach { stat ->
//                    StatisticCard(stat = stat)
//                }
//            }

            // Tags
//            LazyRow(
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                modifier = Modifier.padding(bottom = 24.dp)
//            ) {
//                items(platform.tags) { tag ->
//                    TagChip(tag = tag)
//                }
//            }

            // Action button
            Box(
//                onClick = {
//                    uriHandler.openUri(platform.url)
//                },
////                modifier = Modifier.fillMaxWidth(),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = platform.buttonColor
//                ),
//                shape = RoundedCornerShape(8.dp)
            ) {
                A(
                    href = platform.url,
                ) {
                    Text(
                        platform.buttonText,
                    )
                }
            }
        }
    }
}