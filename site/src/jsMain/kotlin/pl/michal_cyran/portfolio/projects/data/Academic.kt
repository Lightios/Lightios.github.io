package pl.michal_cyran.portfolio.projects.data

import pl.michal_cyran.portfolio.projects.domain.Project
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory
import pl.michal_cyran.portfolio.projects.domain.ProjectLink
import pl.michal_cyran.portfolio.projects.domain.ProjectLinkType
import pl.michal_cyran.portfolio.projects.domain.ProjectType

val academicProjects = listOf(
    Project(
        name = "Demiurg",
        description = Res.string.projects_demiurg_description,
        shortDescription = Res.string.projects_demiurg_shortDescription,
        logo = "demiurg.png",
        skills = listOf("python", "kivy"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/Demiurg_Creator",
                type = ProjectLinkType.GITHUB,
            ),
            ProjectLink(
                to = "https://github.com/ushka1/project-demiurg",
                type = ProjectLinkType.GITHUB,
            )
        ),
        category = ProjectCategory.ACADEMIC,
        screenshots = demiurgScreenshots,
    ),


    Project(
        name = "Movie Recommendation System",
        description = Res.string.projects_movie_ai_description,
        shortDescription = Res.string.projects_movie_ai_shortDescription,
        logo = "recommendation.png",
        skills = listOf("python", "kivy"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/MovieRecommendationSystem",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.ACADEMIC,
    ),
    Project(
        name = "Generator tabliczek",
        description = Res.string.projects_generator_tabliczek_description,
        shortDescription = Res.string.projects_generator_tabliczek_shortDescription,
        logo = "generator-tabliczek.png",
        skills = listOf("c#"),
        type = ProjectType.DESKTOP_APPLICATION,
        links = listOf(
            ProjectLink(
                to = "https://github.com/Lightios/WPFProject",
                type = ProjectLinkType.GITHUB,
            ),
        ),
        category = ProjectCategory.ACADEMIC,
        screenshots = generatorTabliczekScreenshots
    ),
)