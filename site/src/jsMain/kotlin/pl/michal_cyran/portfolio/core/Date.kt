package pl.michal_cyran.portfolio.core

import androidx.compose.runtime.Composable
import kotlinx.datetime.LocalDate

@Composable
fun displayDate(date: LocalDate?): String {
    println(date)

    if (date == null) return Res.string.now
    val months = listOf(
        Res.string.january,
        Res.string.february,
        Res.string.march,
        Res.string.april,
        Res.string.may,
        Res.string.june,
        Res.string.july,
        Res.string.august,
        Res.string.september,
        Res.string.october,
        Res.string.november,
        Res.string.december
    )

    val name = months[date.monthNumber - 1]
    println(name)

    return "$name ${date.year}"
}