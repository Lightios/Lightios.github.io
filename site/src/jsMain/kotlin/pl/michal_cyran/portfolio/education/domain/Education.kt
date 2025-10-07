package pl.michal_cyran.portfolio.education.domain

import kotlinx.datetime.LocalDate

data class Education(
    val title: String,
    val institution: String,
    val location: String,
    val subjects: List<Subject>,
    val icon: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val certificates: List<String> = emptyList(),
) {
    val durationInYears: Int
        get() {
            val difference = endDate.year - startDate.year
            return difference
        }
}