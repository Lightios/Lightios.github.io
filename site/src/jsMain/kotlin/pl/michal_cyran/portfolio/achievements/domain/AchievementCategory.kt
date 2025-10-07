package pl.michal_cyran.portfolio.achievements.domain


enum class AchievementCategory(
    val displayName: String
) {
    MATH(Res.string.math_competitions),
    PROGRAMMING(Res.string.programming_competitions),
    SCHOLARSHIP(Res.string.scholarships),
    OTHER(Res.string.other_achievements)
}

