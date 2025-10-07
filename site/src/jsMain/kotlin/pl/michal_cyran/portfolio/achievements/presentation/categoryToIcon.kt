package pl.michal_cyran.portfolio.achievements.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaCalculator
import com.varabyte.kobweb.silk.components.icons.fa.FaCode
import com.varabyte.kobweb.silk.components.icons.fa.FaSchool
import com.varabyte.kobweb.silk.components.icons.fa.FaTrophy
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import org.jetbrains.compose.web.css.CSSColorValue
import pl.michal_cyran.portfolio.achievements.domain.AchievementCategory
import pl.michal_cyran.portfolio.core.BadgeColors


@Composable
fun CategoryIcon(
    category: AchievementCategory,
    modifier: Modifier = Modifier,
    size: IconSize = IconSize.LG
) {
    when (category) {
        AchievementCategory.PROGRAMMING -> FaCode(modifier = modifier, size = size)
        AchievementCategory.MATH -> FaCalculator(modifier = modifier, size = size)
        AchievementCategory.SCHOLARSHIP -> FaSchool(modifier = modifier, size = size)
        AchievementCategory.OTHER -> FaTrophy(modifier = modifier, size = size)
    }

}
//fun AchievementCategory.toIcon(): @Composable () -> Unit {
//    return when (this) {
//        AchievementCategory.PROGRAMMING -> ::FaCode ,
//            else -> { FaCode() },
////        AchievementCategory.MATH -> "calculate.svg"
////        AchievementCategory.SCHOLARSHIP -> "school.svg"
////        AchievementCategory.OTHER -> "trophy.svg"
//    }
//}

fun AchievementCategory.toColor(): CSSColorValue {
    return when (this) {
        AchievementCategory.PROGRAMMING -> BadgeColors.green
        AchievementCategory.MATH -> BadgeColors.cyan
        AchievementCategory.SCHOLARSHIP -> BadgeColors.gold
        AchievementCategory.OTHER -> BadgeColors.magenta
    }
}
