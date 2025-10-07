package pl.michal_cyran.portfolio.skils.data

import pl.michal_cyran.portfolio.skils.domain.Skill
import pl.michal_cyran.portfolio.skils.domain.SkillCategory
import pl.michal_cyran.portfolio.skils.domain.SkillLevel

val skills = listOf(
    Skill(
        slug = "python",
        name = "Python",
        level = SkillLevel.ADVANCED,
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = "python.png",
    ),

    Skill(
        slug = "kotlin",
        name = "Kotlin",
        level = SkillLevel.ADVANCED,
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = "kotlin.png",
    ),

    Skill(
        slug = "c#",
        name = "C#",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.PROGRAMMING_LANGUAGES,
        icon = "c.svg",
    ),

    Skill(
        slug = "latex",
        name = "LaTeX",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = "latex-white.png",
    ),

    Skill(
        slug = "html",
        name = "HTML",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = "html.svg",
    ),

    Skill(
        slug = "css",
        name = "CSS",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.MARKUP_AND_STYLE,
        icon = "css.svg",
    ),
    Skill(
        slug = "jetpack_compose",
        name = "Jetpack Compose",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.FRAMEWORKS,
        icon = "jetpack-compose.png",
    ),
    Skill(
        slug = "kobweb",
        name = "Kobweb",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.FRAMEWORKS,
        icon = "kobweb-logo.png",
    ),

    Skill(
        slug = "spring_boot",
        name = "Spring Boot",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.FRAMEWORKS,
        icon = "spring_boot.png",
    ),

    Skill(
        slug = "ktor",
        name = "Ktor",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = "ktor.png",
    ),

    Skill(
        slug = "room",
        name = "Room",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = "room.svg",
    ),

    Skill(
        slug = "exposed",
        name = "Exposed",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = "exposed.png",
    ),

    Skill(
        slug = "kivy",
        name = "KivyMD",
        level = SkillLevel.PROFICIENT,
        category = SkillCategory.FRAMEWORKS,
        icon = "kivymd.png",
    ),

    Skill(
        slug = "manim",
        name = "Manim",
        level = SkillLevel.ADVANCED,
        category = SkillCategory.FRAMEWORKS,
        icon = "manim.png",
    ),

    Skill(
        slug = "pillow",
        name = "Pillow",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = "pillow.png",
    ),

    Skill(
        slug = "fpdf2",
        name = "FPDF2",
        level = SkillLevel.COMPETENT,
        category = SkillCategory.TOOLS_AND_LIBRARIES,
        icon = "fpdf2.png",
    ),

    Skill(
        slug = "polish",
        name = "Polish",
        level = SkillLevel.NATIVE,
        category = SkillCategory.NATURAL_LANGUAGES,
        icon = "pl.svg",
    ),

    Skill(
        slug = "english",
        name = "English",
        level = SkillLevel.C1,
        category = SkillCategory.NATURAL_LANGUAGES,
        icon = "en.png",
    )
)

val skillsBySlug = skills.associateBy { it.slug }