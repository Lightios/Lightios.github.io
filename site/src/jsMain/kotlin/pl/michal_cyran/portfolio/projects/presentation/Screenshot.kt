package pl.michal_cyran.portfolio.projects.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.projects.presentation.description.ScreenshotCardStyle

@Composable
fun Screenshot(
    resource: String,
    screenshotText: String,
) {
    var showFullScreen by remember { mutableStateOf(false) }

    Column(
        modifier = ScreenshotCardStyle.toModifier(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.px)
    ) {
        Image(
            src = resource,
            alt = "Project Screenshot",
        )

        Text(
            screenshotText,
        )
    }



//    if (showFullScreen) {
//        Dialog(
//            onDismissRequest = { showFullScreen = false },
//            properties = DialogProperties(usePlatformDefaultWidth = false)
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth(0.8f)
//                    .padding(16.dp)
//                    .background(Color.Black.copy(alpha = 0.8f))
//                ,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp)
//            ) {
//                Image(
//                    painter = painterResource(resource),
//                    contentDescription = "Project Screenshot",
//                    modifier = Modifier
//                )
//
//                Text(
//                    text = screenshotText,
//                    style = MaterialTheme.typography.titleLarge.copy(color = Color.White),
//                    modifier = padding(16.dp)
//                )
//            }
//        }
//    }
}