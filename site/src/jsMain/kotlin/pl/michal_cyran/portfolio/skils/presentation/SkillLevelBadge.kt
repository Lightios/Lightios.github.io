package pl.michal_cyran.portfolio.skils.presentation

import androidx.compose.runtime.Composable

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.core.presentation.StatusBadge
import pl.michal_cyran.portfolio.skils.domain.SkillLevel

@Composable
fun SkillLevelBadge(
    level: SkillLevel,
    hovered: Boolean = false,
    modifier: Modifier = Modifier,
) {
    StatusBadge(
        Badge(
            text = level.displayName,
            color = level.toColor(),
        ),
        modifier = modifier,
    )
}