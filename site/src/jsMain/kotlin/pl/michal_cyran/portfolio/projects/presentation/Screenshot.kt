package pl.michal_cyran.portfolio.projects.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.Cursor

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.maxHeight
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.projects.presentation.description.ScreenshotCardStyle


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.modifiers.aspectRatio
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.projects.presentation.description.ScreenshotCardStyle

@Composable
fun Screenshot(
    resource: String,
    screenshotText: String,
    onClick: () -> Unit = {},
) {
    // Stays null until the browser has decoded the image and we know real dimensions.
    var aspectRatio by remember(resource) { mutableStateOf<Pair<Int, Int>?>(null) }

    // While loading, use a neutral 4:3 placeholder so the card has some height
    // and doesn't collapse. Snaps to the real ratio on load without jarring reflow
    // because the transition on ScreenshotCardStyle covers it.
    val (ratioW, ratioH) = aspectRatio ?: (4 to 3)

    Column(
        modifier = ScreenshotCardStyle.toModifier()
            .padding(bottom = 1.cssRem)
            .aspectRatio(ratioW, ratioH)
            .cursor(Cursor.Pointer)
            .onClick { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(1.cssRem)
    ) {
        Img(
            src = resource,
            alt = screenshotText,
            attrs = {
                style {
                    property("width", "100%")
                    property("height", "100%")
                    property("object-fit", "cover")
                    property("display", "block")
                }
                addEventListener("load") { event ->
                    val img = event.target.asDynamic()
                    val w = (img.naturalWidth as? Int)?.takeIf { it > 0 } ?: 16
                    val h = (img.naturalHeight as? Int)?.takeIf { it > 0 } ?: 9
                    // Reduce to a small integer ratio so aspectRatio() gets clean numbers.
                    // e.g. 1080x1920 → gcd=1080 → 1:1.77 → we just pass raw w:h,
                    // the browser handles non-integer ratios fine.
                    aspectRatio = w to h
                }
            }
        )

        if (screenshotText.isNotBlank()) {
            Text(screenshotText)
        }
    }
}