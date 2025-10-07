package pl.michal_cyran.portfolio.achievements.domain

import pl.michal_cyran.portfolio.core.domain.Stat

data class CategoryStat(
    val category: AchievementCategory,
    val stat: Stat,
)