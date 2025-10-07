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


@Composable
fun TagChip(tag: String) {
    Box(
//        color = Color(0xFF334155),
//        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .borderRadius(6.px)
            .padding(4.px)
    ) {
        Text(
            tag,
//            color = Color(0xFF94A3B8),
//            fontSize = 12.sp,
//            fontWeight = FontWeight.Medium,
//            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}