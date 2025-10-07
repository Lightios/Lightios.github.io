package pl.michal_cyran.portfolio.skils.domain


enum class SkillLevel(
    val displayName: String
) {
    BEGINNER(Res.string.beginner),
    COMPETENT(Res.string.competent),
    PROFICIENT(Res.string.proficient),
    ADVANCED(Res.string.advanced),
    EXPERT(Res.string.expert),
    NATIVE(Res.string.native),
    C1(Res.string.c1),
}