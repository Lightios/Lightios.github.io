package pl.michal_cyran.portfolio.projects.data

import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory
import pl.michal_cyran.portfolio.projects.domain.ProjectLink
import pl.michal_cyran.portfolio.projects.domain.ProjectLinkType
import pl.michal_cyran.portfolio.projects.domain.ProjectType

val personal = listOf(
    Project(
        name = "Function solver",
        description = Res.string.projects_function_solver_description,
        shortDescription = Res.string.projects_function_solver_shortDescription,
        logo = "chart_data.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.WEB_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://lightios.github.io/FunctionSolver/",
                type = ProjectLinkType.WEBSITE,
            ),
            ProjectLink(
                to = "https://github.com/Lightios/FunctionSolver",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = functionSolverScreenshots,
        isImportant = true,
    ),

    Project(
        name = "Math Tools",
        description = Res.string.projects_math_tools_description,
        shortDescription = Res.string.projects_math_tools_shortDescription,
        logo = "build.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/MathTools",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = mathToolsScreenshots,
        isImportant = true,
    ),
    Project(
        name = "Mobile Remote",
        description = Res.string.projects_mobile_remote_description,
        shortDescription = Res.string.projects_mobile_remote_shortDescription,
        logo = "remote_gen.svg",
        skills = listOf("kotlin", "jetpack_compose", "spring_boot", "ktor"),
        type = ProjectType.OTHER,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/MobileRemoteClient",
                type = ProjectLinkType.GITHUB,
            ),
            ProjectLink(
                to = "https://github.com/Lightios/MobileRemoteServer",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = mobileRemoteScreenshots,
    ),

    Project(
        name = "Portfolio",
        description = Res.string.projects_website_description,
        shortDescription = Res.string.projects_website_shortDescription,
        logo = "business_center.svg",
        skills = listOf("kotlin", "kobweb"),
        type = ProjectType.WEB_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/Website",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        isImportant = true,
    ),

    Project(
        name = "Tutor Website",
        description = Res.string.projects_tutor_website_description,
        shortDescription = Res.string.projects_tutor_website_shortDescription,
        logo = "sell.svg",
        skills = listOf("kotlin", "kobweb"),
        type = ProjectType.WEB_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://lightios.github.io/TutorWebsite/",
                type = ProjectLinkType.WEBSITE,
            ),
            ProjectLink(
                to = "https://github.com/Lightios/TutorWebsiteCode",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.PERSONAL,
    ),

    Project(
        name = "Scheduler",
        description = Res.string.projects_screenshot_processor_description,
        shortDescription = Res.string.projects_scheduler_shortDescription,
        logo = "calendar_clock.svg",
        skills = listOf("python", "pillow"),
        type = ProjectType.CONSOLE,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/CalicoCompanion",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = schedulerScreenshots,
    ),

    Project(
        name = "Screenshot Processor",
        description = Res.string.projects_screenshot_processor_description,
        shortDescription = Res.string.projects_screenshot_processor_shortDescription,
        logo = "screenshot_monitor.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/ScreenshotProcessor",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    ),
    Project(
        name = "YouTube Downloader",
        description = Res.string.projects_youtube_downloader_description,
        shortDescription = Res.string.projects_youtube_downloader_shortDescription,
        logo = "genres.svg",
        skills = listOf("python"),
        type = ProjectType.CONSOLE,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/YouTubeDownloader",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    ),

    Project(
        name = "Calico Companion",
        description = Res.string.projects_calico_companion_description,
        shortDescription = Res.string.projects_calico_companion_shortDescription,
        logo = "paw.svg",
        skills = listOf("kotlin", "jetpack_compose"),
        type = ProjectType.MOBILE_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/CalicoCompanion",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    ),

    Project(
        name = "Subtitles Shifter",
        description = Res.string.projects_subtitles_shifter_description,
        shortDescription = Res.string.projects_subtitles_shifter_shortDescription,
        logo = "subtitles_gear.svg",
        skills = listOf("python"),
        type = ProjectType.CONSOLE,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/SubtitlesShifter",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.PERSONAL,
        screenshots = emptyList()
    ),
)