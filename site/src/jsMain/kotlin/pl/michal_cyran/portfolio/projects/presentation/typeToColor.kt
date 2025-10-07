package pl.michal_cyran.portfolio.projects.presentation

import org.jetbrains.compose.web.css.CSSColorValue
import pl.michal_cyran.portfolio.core.BadgeColors
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory
import pl.michal_cyran.portfolio.projects.domain.ProjectType


fun ProjectType.toColor(): CSSColorValue {
    return when (this) {
        ProjectType.MOBILE_APPLICATION -> BadgeColors.cyan
        ProjectType.WEB_APPLICATION -> BadgeColors.magenta
        ProjectType.DESKTOP_APPLICATION -> BadgeColors.red
        ProjectType.MULTIPLATFORM_APPLICATION -> BadgeColors.green
        else -> BadgeColors.blue
    }
}

fun ProjectCategory.toColor(): CSSColorValue {
    return when (this) {
        ProjectCategory.COMMERCIAL -> BadgeColors.cyan
        ProjectCategory.ACADEMIC -> BadgeColors.blue
        ProjectCategory.PRACTICE -> BadgeColors.red
        ProjectCategory.PERSONAL -> BadgeColors.green
    }
}