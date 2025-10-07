package pl.michal_cyran.portfolio.experience.data

import com.varabyte.kobweb.compose.ui.graphics.Colors
import kotlinx.datetime.LocalDate
import pl.michal_cyran.portfolio.experience.domain.Experience
import org.jetbrains.compose.web.css.Color
import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.experience.domain.Stat
import pl.michal_cyran.portfolio.experience.domain.Technology

val experiences = listOf(
    Experience(
        title = Res.string.experience_tutor_title,
        responsibilities = listOf(
            Res.string.experience_tutor_responsibility_1,
            Res.string.experience_tutor_responsibility_2,
            Res.string.experience_tutor_responsibility_3,
        ),
        icon = "calculate.svg",
        iconColor = Colors.White,
        iconBackground = Color("#3B82F6"),
        badges = listOf(
            Badge(Res.string.self_employed, Color("#0EA5E9")),
            Badge(Res.string.home, Color("#10B981")),
        ),
        startDate = LocalDate(2021, 9, 1),
        stats = listOf(
            Stat("50+", Res.string.students_taught),
            Stat("5/5", Res.string.rating),
            Stat("20+", Res.string.reviews)
        )
    ),
    Experience(
        title = Res.string.experience_app_developer_title,
        responsibilities = listOf(
            Res.string.experience_app_developer_responsibility_1,
            Res.string.experience_app_developer_responsibility_2,
        ),
        icon = "logo_dev.svg",
        iconColor = Colors.White,
        iconBackground = Color("#10B981"),
        badges = listOf(
            Badge(Res.string.self_employed, Color("#0EA5E9")),
            Badge(Res.string.commercial, Color("#8B5CF6"))
        ),
        startDate = LocalDate(2021, 7, 1),
        technologies = listOf(
            Technology("Python", "python.png"),
            Technology("Kotlin", "kotlin.png"),
        ),
        stats = listOf(
            Stat("2", Res.string.apps_published),
            Stat("100K+", Res.string.total_downloads),
        )
    )
)