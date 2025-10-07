package pl.michal_cyran.portfolio.experience.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import pl.michal_cyran.portfolio.experience.domain.Technology

@Composable
fun TechnologyBadge(technology: Technology) {
    Box(
        Modifier
            .backgroundColor(Color("#1F2937"))
            .borderRadius(8.px)
            .padding(leftRight = 4.px, topBottom = 4.px)
//        shape = RoundedCornerShape(8.dp),
//        modifier = Modifier.clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            src = technology.icon,
            alt = technology.name,
            modifier = Modifier
                .padding(leftRight = 12.px, topBottom  = 8.px)
                .size(40.px)

                .objectFit(ObjectFit.ScaleDown)
        )
    }
}