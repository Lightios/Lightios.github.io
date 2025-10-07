package pl.michal_cyran.portfolio.experience.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.core.displayDate
import pl.michal_cyran.portfolio.experience.domain.Experience
import pl.michal_cyran.portfolio.toSitePalette


@Composable
fun Timeline(
    experience: Experience,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
//        Icon(
//            painter = painterResource(Res.drawable.calendar_month),
//            contentDescription = "Timeline",
//            tint = Color(0xFF64748B),
//            modifier = Modifier.size(16.dp)
//        )
//        Spacer(modifier = Modifier.width(8.dp))
        Date(date = displayDate(experience.startDate))

        Div(
            Modifier
                .weight(1f)
                .backgroundColor(Color("#1F2937"))
//                .padding(horizontal =  12.px)
                .height(5.px)
                .borderRadius(50.px)
                .toAttrs {  }
//            shape = RoundedCornerShape(10.dp),
//            color = Color(0xFF64748B).copy(alpha = 0.7f),
        ) {}

        Date(date = displayDate(experience.endDate))
    }
}

@Composable
fun Date(
    date: String,
) {
    Box(
        modifier = Modifier
            .backgroundColor(ColorMode.current.toSitePalette().secondaryContainer)
            .borderRadius(10.px)
    ) {
        H6(
            Modifier
                .margin(topBottom = 4.px)
                .toAttrs()
        ){
            Text(
                value = date,
            )
        }
    }

//    Surface(
//        color = Color("#06B6D4"),
////        shape = RoundedCornerShape(8.dp),
////        border = BorderStroke(1.dp, Color(0xFF06B6D4).copy(alpha = 0.3f)),
////        modifier = Modifier.clip(RoundedCornerShape(8.dp))
//    ) {
//        Text(
//            value = date,
////            color = Color(0xFF06B6D4),
////            fontSize = 12.sp,
////            fontWeight = FontWeight.Medium,
////            modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp)
//        )
//    }
}