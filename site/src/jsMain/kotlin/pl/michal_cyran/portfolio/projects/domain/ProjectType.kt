package pl.michal_cyran.portfolio.projects.domain


enum class ProjectType(
    val displayName: String
) {
    MOBILE_APPLICATION(Res.string.mobile_application),
    WEB_APPLICATION(Res.string.web_application),
    DESKTOP_APPLICATION(Res.string.desktop_application),
    MULTIPLATFORM_APPLICATION(Res.string.multiplatform_application),
    LIBRARY(Res.string.library),
    CONSOLE(Res.string.console_application),
    GAME(Res.string.game),
    OTHER(Res.string.other);
}