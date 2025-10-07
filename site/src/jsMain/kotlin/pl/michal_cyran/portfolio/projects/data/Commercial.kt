package pl.michal_cyran.portfolio.projects.data

import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory
import pl.michal_cyran.portfolio.projects.domain.ProjectLink
import pl.michal_cyran.portfolio.projects.domain.ProjectLinkType
import pl.michal_cyran.portfolio.projects.domain.ProjectType

val commercialProjects = listOf(
    Project(
        name = "Valorant Lineups",
        description = Res.string.projects_vl_description,
        shortDescription = Res.string.projects_vl_shortDescription,
        logo = "valorant-lineups.png",
        skills = listOf("python", "kivy", "kotlin", "jetpack_compose", "room"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://play.google.com/store/apps/details?id=pl.ppistudio.valorantlineups.ppistudio.valorantlineups&hl=pl/",
                type = ProjectLinkType.GOOGLE_PLAY,
            )
        ),
        category = ProjectCategory.COMMERCIAL,
        screenshots = valorantLineupsScreenshots,
    ),
    Project(
        name = "DayMath",
        description = Res.string.projects_daymath_description,
        shortDescription = Res.string.projects_daymath_shortDescription,
        logo = "daymath.png",
        skills = listOf("kotlin", "jetpack_compose", "python", "manim", "latex", "room"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://play.google.com/store/apps/details?id=pl.ppistudio.daymath&hl=pl/",
                type = ProjectLinkType.GOOGLE_PLAY,
            )
        ),
        category = ProjectCategory.COMMERCIAL,
        screenshots = daymathScreenshots
    ),
    Project(
        name = "Master System",
        description = Res.string.projects_master_system_description,
        shortDescription = Res.string.projects_master_system_shortDescription,
        logo = "master-system.png",
        skills = listOf("python", "kivy", "pillow", "fpdf2"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(),
        category = ProjectCategory.COMMERCIAL,
        screenshots = masterSystemScreenshots,
    ),
)