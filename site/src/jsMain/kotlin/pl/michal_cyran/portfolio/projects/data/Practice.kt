package pl.michal_cyran.portfolio.projects.data

import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory
import pl.michal_cyran.portfolio.projects.domain.ProjectLink
import pl.michal_cyran.portfolio.projects.domain.ProjectLinkType
import pl.michal_cyran.portfolio.projects.domain.ProjectType
import pl.michal_cyran.portfolio.projects.domain.Screenshot

val practiceProjects = listOf(

    Project(
        name = "Days Counter",
        description = Res.string.projects_days_counter_description,
        shortDescription = Res.string.projects_days_counter_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("kotlin", "jetpack_compose", "exposed"),
        type = ProjectType.MULTIPLATFORM_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/DaysCounter",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),

    Project(
        name = "Tic Tac Toe",
        description = Res.string.projects_tic_tac_toe_kotlin_description,
        shortDescription = Res.string.projects_tic_tac_toe_kotlin_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("kotlin", "jetpack_compose", "ktor", "spring_boot"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/TicTacToeServer",
                type = ProjectLinkType.GITHUB,
            ),
            ProjectLink(
                to = "https://github.com/Lightios/TicTacToeClient",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),
    Project(
        name = "To Do List",
        description = Res.string.projects_todo_list_description,
        shortDescription = Res.string.projects_todo_list_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/ToDoList",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),

    Project(
        name = "Binary Clock",
        description = Res.string.projects_binary_clock_description,
        shortDescription = Res.string.projects_binary_clock_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MULTIPLATFORM_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/BinaryClock",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = listOf(
            Screenshot(
                resource = "/screenshots/ss_binary_clock.png",
                label = "Preview"
            )
        )
    ),
    Project(
        name = "Crypto Tracker",
        description = Res.string.projects_crypto_tracker_description,
        shortDescription = Res.string.projects_crypto_tracker_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/CryptoTracker",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),


    Project(
        name = "Tic Tac Toe Cog",
        description = Res.string.projects_tic_tac_toe_description,
        shortDescription = Res.string.projects_tic_tac_toe_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("python"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/DiscordBot-TicTacToeCog",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PRACTICE,
        screenshots = emptyList()
    ),
)
