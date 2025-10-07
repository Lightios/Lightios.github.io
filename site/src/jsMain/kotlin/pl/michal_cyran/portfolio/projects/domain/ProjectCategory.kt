package pl.michal_cyran.portfolio.projects.domain


enum class ProjectCategory(
    val displayName: String,
) {
    COMMERCIAL(Res.string.commercial_project),
    PERSONAL(Res.string.personal_project),
    ACADEMIC(Res.string.academic_project),
    PRACTICE(Res.string.practice_project),
}