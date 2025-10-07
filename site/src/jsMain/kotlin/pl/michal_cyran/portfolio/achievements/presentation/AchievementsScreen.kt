package pl.michal_cyran.portfolio.achievements.presentation

import Res
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.achievements.data.achievements
import pl.michal_cyran.portfolio.achievements.domain.AchievementCategory
import pl.michal_cyran.portfolio.achievements.domain.CategoryStat
import pl.michal_cyran.portfolio.components.widgets.Headline
import pl.michal_cyran.portfolio.core.domain.Stat
import pl.michal_cyran.portfolio.core.presentation.StatisticCard

@Composable
fun AchievementsScreen(
    modifier: Modifier = Modifier
) {
    val statCards = achievements
        .groupBy { it.category }
        .map { (category, achievements) ->
            CategoryStat(
                category = category,
                stat = Stat(
                    label = category.displayName,
                    value = achievements.size.toString(),
                    iconColor = category.toColor()
                )
            )
        }.sortedWith(
            compareBy<CategoryStat> { it.stat.label == AchievementCategory.OTHER.displayName }
                .thenByDescending { it.stat.value }
            )


    Column(
        modifier = Modifier
            .fillMaxWidth(100.percent)
            .padding(24.px),
        verticalArrangement = Arrangement.spacedBy(32.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Headline(
                title = Res.string.achievements_title,
                subtitle = Res.string.achievements_subtitle,
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(100.percent),
            horizontalArrangement = Arrangement.spacedBy(16.px)
        ) {
            statCards.forEach { stat ->
                StatisticCard(
                    category = stat.category,
                    stat = stat.stat,
                    modifier = Modifier.weight(1f),
                )
            }
        }

        val groups = achievements.groupBy{ it.category }

        for (category in AchievementCategory.entries) {
            AchievementCategorySection(
                category = category,
                achievements = groups[category] ?: emptyList(),
                modifier = Modifier.fillMaxSize(100.percent)
            )
        }
    }
}





