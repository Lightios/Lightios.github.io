package pl.michal_cyran.portfolio.education.presentation

import pl.michal_cyran.portfolio.education.domain.SubjectCategory

import org.jetbrains.compose.web.css.CSSColorValue
import pl.michal_cyran.portfolio.core.BadgeColors

fun categoryToColor(category: SubjectCategory): CSSColorValue {
    return when (category) {
        SubjectCategory.Mathematics -> BadgeColors.cyan
        SubjectCategory.ProgrammingAndSoftwareEngineering -> BadgeColors.magenta
        SubjectCategory.SystemsAndComputerTechnology -> BadgeColors.green
        SubjectCategory.AIAndCognitiveScience -> BadgeColors.red
        SubjectCategory.Other -> BadgeColors.blue
    }
}