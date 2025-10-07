package pl.michal_cyran.portfolio.achievements.domain

import kotlinx.datetime.LocalDate

data class Achievement (
    val name: String,
    val organization: String,
    val date: LocalDate,
    val category: AchievementCategory,
    val level: AchievementLevel,
    val isFirstPlace: Boolean = false,
)
