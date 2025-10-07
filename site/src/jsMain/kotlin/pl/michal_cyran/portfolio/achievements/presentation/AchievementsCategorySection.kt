package pl.michal_cyran.portfolio.achievements.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.achievements.domain.Achievement
import pl.michal_cyran.portfolio.achievements.domain.AchievementCategory

@Composable
fun AchievementCategorySection(
    category: AchievementCategory,
    achievements: List<Achievement>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Category Header
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 24.px).fillMaxWidth()
        ) {

            H2 {
                Text(
                    category.displayName
//                fontSize = 28.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.White
                )
            }

            Spacer()


            H6 {
                Text(
                    Res.string.n_achievements.format(
                        achievements.size,
                        achievements.size.toString(),
                    )
//                    "${achievements.size} Achievements"
//                text = stringResource(Res.string.n_achievements, achievements.size),
//                fontSize = 16.sp,
//                color = Color(0xFF64748B)
                )
            }

        }

        achievements.forEach { achievement ->
            AchievementCard(achievement = achievement)
        }
    }
}