package pl.michal_cyran.portfolio.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.dom.svg.Image
import com.varabyte.kobweb.compose.dom.svg.Text
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaCode
import com.varabyte.kobweb.silk.components.icons.fa.FaSpider
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.SilkTheme
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.achievements.domain.AchievementCategory
import pl.michal_cyran.portfolio.achievements.presentation.CategoryIcon
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.domain.Stat


@Composable
fun StatisticCard(
    category: AchievementCategory,
    stat: Stat,
    modifier: Modifier = Modifier
) {
//    val interactionSource = remember { MutableInteractionSource() }
//    val isHovered by interactionSource.collectIsHoveredAsState()
//    val scale by animateFloatAsState(
//        targetValue = if (isHovered) 1.05f else 1f,
//        label = "CardScale"
//    )
    Div(
         attrs =
             modifier.then(backgroundContainer.toModifier())
             .toAttrs()
    ) {
        Column(
            modifier = Modifier
                .padding(20.px)
                .width(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            CategoryIcon(
                category = category,
                modifier = Modifier
                    .color(stat.iconColor),
                size = IconSize.LG
            )
            H4(
                Modifier.padding(top = 0.px, bottom = 0.px).toAttrs {  }
            ) {
                Text(
                    stat.value,
                )
            }

            H6(
                Modifier.padding(top = 0.px, bottom = 0.px).toAttrs {  }
            ) {
                Text(
                    stat.label
                )
            }
        }
    }
}

