package pl.michal_cyran.portfolio.projects.presentation

import androidx.compose.runtime.Composable

import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.core.presentation.StatusBadge
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory
import pl.michal_cyran.portfolio.projects.domain.ProjectType

@Composable
fun TypeBadge(
    type: ProjectType
) {
    StatusBadge(
        Badge(
            text = type.displayName,
            color = type.toColor(),
        )
    )
}


@Composable
fun CategoryBadge(
    category: ProjectCategory
) {
    StatusBadge(
        Badge(
            text = category.displayName,
            color = category.toColor(),
        )
    )
}