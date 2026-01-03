package pl.michal_cyran.portfolio.experience.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameMillis
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.experience.domain.Stat

@Composable
fun StatItem(
    stat: Stat,
    durationMs: Long = 1200L,
) {
    var value by remember { mutableStateOf(0) }

    LaunchedEffect(stat.value) {
        val startTime = withFrameMillis { it }

        while (true) {
            val now = withFrameMillis { it }
            val progress = ((now - startTime).toFloat() / durationMs).coerceIn(0f, 1f)

            value = (stat.value * progress).toInt()

            if (progress >= 1f) break
        }

        value = stat.value
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            "$value${stat.unit}",
//            stat.value,
            modifier = Modifier
                .fontSize(28.px)
                .fontWeight(FontWeight.Bold)
                .color(stat.color)
        )

        SpanText(
            stat.label,
            modifier = Modifier
                .fontSize(13.px)
                .color(Colors.Cyan)
                .fontWeight(FontWeight.Normal)
                .textAlign(TextAlign.Center)
                .lineHeight(16.px)
        )
    }
}