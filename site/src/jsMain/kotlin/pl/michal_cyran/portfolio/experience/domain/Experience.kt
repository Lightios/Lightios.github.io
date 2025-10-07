package pl.michal_cyran.portfolio.experience.domain

import kotlinx.datetime.LocalDate
import org.jetbrains.compose.web.css.CSSColorValue
import pl.michal_cyran.portfolio.core.domain.Badge
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.toJSDate

data class Experience(
    val title: String,
    val responsibilities: List<String>,
    val icon: String,
    val iconColor: CSSColorValue,
    val iconBackground: CSSColorValue,
    val badges: List<Badge>,
    val startDate: LocalDate,
    val stats: List<Stat>,
    val endDate: LocalDate? = null,
    val technologies: List<Technology> = emptyList(),
) {
    @OptIn(ExperimentalTime::class)
    val durationInYears: Int
        get() {
            if (endDate != null)
                return (endDate.year - startDate.year) - if (endDate.monthNumber < startDate.monthNumber || (endDate.monthNumber == startDate.monthNumber && endDate.dayOfMonth < startDate.dayOfMonth)) 1 else 0

            val secondsEnd = Clock.System.now().toEpochMilliseconds() / 1000 / 60 / 60 / 24
            val secondsStart = startDate.toEpochDays()

            return (secondsEnd - secondsStart).toInt() / 365
//            val today = LocalDate(year = jsDate.getFullYear(), monthNumber = jsDate.getMonth() + 1, 2)
//            val end = endDate ?: today
//
//            println(today)
//
//            return (end.year - startDate.year) - if (end.month < startDate.month || (end.month == startDate.month && end.dayOfMonth < startDate.dayOfMonth)) 1 else 0
        }
}

