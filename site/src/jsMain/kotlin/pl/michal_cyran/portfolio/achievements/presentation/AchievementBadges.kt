package pl.michal_cyran.portfolio.achievements.presentation

import androidx.compose.runtime.Composable
import pl.michal_cyran.portfolio.achievements.domain.AchievementLevel
import pl.michal_cyran.portfolio.core.BadgeColors
import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.core.presentation.StatusBadge

@Composable
fun FirstPlaceBadge() {
    StatusBadge(
        Badge(
            text = Res.string.first_place,
            color = BadgeColors.gold,
        )
    )
}

@Composable
fun LevelBadge(
    level: AchievementLevel
) {
    val backgroundColor = when (level) {
        AchievementLevel.SCHOOL -> BadgeColors.gold
        AchievementLevel.INTERNATIONAL -> BadgeColors.red
        AchievementLevel.DISTRICT -> BadgeColors.cyan
        AchievementLevel.REGIONAL -> BadgeColors.green
        AchievementLevel.NATIONAL -> BadgeColors.pink
    }

    StatusBadge(
        Badge(
            text = level.displayName,
            color = backgroundColor,
        )
    )
}