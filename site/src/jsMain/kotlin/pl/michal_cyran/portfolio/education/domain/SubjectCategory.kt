package pl.michal_cyran.portfolio.education.domain

enum class SubjectCategory(
    val displayName: String
) {
    ProgrammingAndSoftwareEngineering(Res.string.programming_and_software_engineering),
    Mathematics(Res.string.mathematics),
    SystemsAndComputerTechnology(Res.string.systems_and_computer_technology),
    AIAndCognitiveScience(Res.string.ai_and_cognitive_science),
    Other(Res.string.other),
}