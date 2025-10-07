package pl.michal_cyran.portfolio.core.domain

enum class Routes {
    ACHIEVEMENTS,
    EDUCATION,
    EXPERIENCE,
    PROJECTS,
    SKILLS,
    SOCIAL_MEDIA
}

fun Routes.toPath(): String = when(this) {
    Routes.ACHIEVEMENTS -> "achievements"
    Routes.EDUCATION -> "education"
    Routes.EXPERIENCE -> "experience"
    Routes.PROJECTS -> "projects"
    Routes.SKILLS -> "skills"
    Routes.SOCIAL_MEDIA -> "social-media"
}

fun Routes.toTitle(): String = when(this) {
    Routes.ACHIEVEMENTS -> Res.string.achievements
    Routes.EDUCATION -> Res.string.education
    Routes.EXPERIENCE -> Res.string.experience
    Routes.PROJECTS -> Res.string.projects
    Routes.SKILLS -> Res.string.skills
    Routes.SOCIAL_MEDIA -> Res.string.social_media
}

