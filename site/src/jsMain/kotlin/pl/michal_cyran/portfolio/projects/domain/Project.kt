package pl.michal_cyran.portfolio.projects.domain

data class Project (
    val name: String,
    val description: String,
    val shortDescription: String,
    val logo: String,
    val skills: List<String>,
    val type: ProjectType,
    val category: ProjectCategory,
    val links: List<ProjectLink> = emptyList(),
    val screenshots: List<Screenshot> = emptyList(),
    val isImportant: Boolean = false,
) {
    val slug = name.lowercase().replace(" ", "-")
}
