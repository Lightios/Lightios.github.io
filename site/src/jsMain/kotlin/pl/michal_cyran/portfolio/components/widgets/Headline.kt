package pl.michal_cyran.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.core.presentation.styles.PageHeaderStyle
import pl.michal_cyran.portfolio.core.presentation.styles.PageSubtitleStyle

@Composable
fun Headline(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
) {
    H1(
        PageHeaderStyle.toAttrs { }
    ) {
        Text(
            title
        )
    }

    P(
        PageSubtitleStyle.toAttrs()
    ) {
        Text(
            subtitle
        )
    }
}