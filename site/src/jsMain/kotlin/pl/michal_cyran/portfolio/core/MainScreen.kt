package pl.michal_cyran.portfolio.core

import pl.michal_cyran.portfolio.core.domain.Routes

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.ResponsiveValues
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.core.presentation.HeroSection
import pl.michal_cyran.portfolio.core.presentation.NavigationCard

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth(100.percent)
            .padding(16.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.px)
    ) {
        HeroSection()

        SimpleGrid(
            numColumns(1, md=3),
            modifier = Modifier.gap(20.px)
        ) {
            NavigationCard(
                Routes.SKILLS,
            )
            NavigationCard(
                Routes.EDUCATION,
            )
            NavigationCard(
                Routes.EXPERIENCE,
            )
            NavigationCard(
                Routes.PROJECTS,
            )
            NavigationCard(
                Routes.ACHIEVEMENTS,
            )
//            NavigationCard(
//                Routes.SOCIAL_MEDIA,
//                modifier = Modifier.width(33.percent),
//            )
        }
    }

}