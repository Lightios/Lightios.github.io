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
        technicalDescription = Res.string.projects_vl_technicalDescription,
        logo = "valorant-lineups.png",
        skills = listOf("kotlin", "jetpack_compose", "room", "ktor", "firebase"),
        type = ProjectType.MULTIPLATFORM_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://play.google.com/store/apps/details?id=pl.ppistudio.valorantlineups.ppistudio.valorantlineups&hl=pl/",
                type = ProjectLinkType.GOOGLE_PLAY,
            ),
            ProjectLink(
                to = "https://lightios.github.io/ValorantLineupsWeb/",
                type = ProjectLinkType.WEBSITE,
            )
        ),
        category = ProjectCategory.COMMERCIAL,
        screenshots = valorantLineupsScreenshots,
        isImportant = true,
    ),
    Project(
        name = "DayMath",
        description = Res.string.projects_daymath_description,
        shortDescription = Res.string.projects_daymath_shortDescription,
        technicalDescription = Res.string.projects_daymath_technicalDescription,
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
        screenshots = daymathScreenshots,
        isImportant = true,
    ),
    Project(
        name = "Egzaminy z Matematyki",
        description = Res.string.projects_matura_tasks_hub_description,
        shortDescription = Res.string.projects_matura_tasks_hub_shortDescription,
        technicalDescription = Res.string.projects_matura_tasks_hub_technicalDescription,
        logo = "book.svg",
        skills = listOf("kotlin", "kobweb", "python", "latex"),
        type = ProjectType.WEB_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://egzaminy.michal-cyran.pl/",
                type = ProjectLinkType.WEBSITE,
            )
        ),
        category = ProjectCategory.COMMERCIAL,
        screenshots = maturaTasksHubScreenshots,
        isImportant = true,
    ),

    Project(
        name = "Master System",
        description = Res.string.projects_master_system_description,
        shortDescription = Res.string.projects_master_system_shortDescription,
        technicalDescription = Res.string.projects_master_system_technicalDescription,
        logo = "master-system.png",
        skills = listOf("python", "kivy", "pillow", "fpdf2"),
        type = ProjectType.MULTIPLATFORM_APPLICATION,
        links = listOf(),
        category = ProjectCategory.COMMERCIAL,
        screenshots = masterSystemScreenshots,
    ),

    Project(
        name = "Asertiv",
        description = Res.string.projects_asertiv_description,
        shortDescription = Res.string.projects_asertiv_shortDescription,
        technicalDescription = Res.string.projects_asertiv_technicalDescription,
        logo = "asertiv.png",
        skills = listOf("kotlin", "jetpack_compose", "room"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(),
        category = ProjectCategory.COMMERCIAL,
//        screenshots = masterSystemScreenshots,
    ),

)