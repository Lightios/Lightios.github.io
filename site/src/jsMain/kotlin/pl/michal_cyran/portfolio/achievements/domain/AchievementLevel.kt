package pl.michal_cyran.portfolio.achievements.domain

enum class AchievementLevel(
    val displayName: String
) {
    SCHOOL(Res.string.school),
    REGIONAL(Res.string.regional),
    NATIONAL(Res.string.national),
    INTERNATIONAL(Res.string.international),
    DISTRICT(Res.string.district);


}
