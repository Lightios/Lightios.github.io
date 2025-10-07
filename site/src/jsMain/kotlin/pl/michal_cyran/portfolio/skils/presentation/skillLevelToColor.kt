package pl.michal_cyran.portfolio.skils.presentation

import pl.michal_cyran.portfolio.skils.domain.SkillLevel
import org.jetbrains.compose.web.css.CSSColorValue
import pl.michal_cyran.portfolio.core.BadgeColors


fun SkillLevel.toColor(): CSSColorValue {
    return when (this) {
        SkillLevel.BEGINNER -> BadgeColors.blue
        SkillLevel.PROFICIENT -> BadgeColors.green
        SkillLevel.COMPETENT -> BadgeColors.red
        SkillLevel.ADVANCED -> BadgeColors.cyan
        SkillLevel.EXPERT -> BadgeColors.gold
        SkillLevel.NATIVE -> BadgeColors.magenta
        SkillLevel.C1 -> BadgeColors.pink
    }
}