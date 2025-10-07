package pl.michal_cyran.portfolio.skils.domain

data class Skill(
    val slug: String,
    val name: String,
    val level: SkillLevel,
    val category: SkillCategory,
    val icon: String,
)


