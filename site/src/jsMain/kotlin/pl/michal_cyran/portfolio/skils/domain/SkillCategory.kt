package pl.michal_cyran.portfolio.skils.domain


enum class SkillCategory(
    val title: String,
) {
    PROGRAMMING_LANGUAGES(Res.string.programming_languages),
    MARKUP_AND_STYLE(Res.string.markup_style),
    FRAMEWORKS(Res.string.frameworks),
    NATURAL_LANGUAGES(Res.string.languages),
    TOOLS_AND_LIBRARIES(Res.string.libraries),
    OTHER(Res.string.other)
}