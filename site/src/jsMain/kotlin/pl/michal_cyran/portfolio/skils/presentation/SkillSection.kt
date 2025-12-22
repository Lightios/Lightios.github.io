package pl.michal_cyran.portfolio.skils.presentation

import androidx.compose.runtime.Composable

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.skils.domain.Skill
import pl.michal_cyran.portfolio.skils.domain.SkillCategory

@Composable
fun SkillSection(
    title: String,
    skillCategory: SkillCategory,
    skills: List<Skill>,
    searchQuery: String
) {
    val filteredSkills = skills.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    }

    if (filteredSkills.isNotEmpty()) {
        Column(
            modifier = Modifier
                .fillMaxWidth(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.px),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.px),
                modifier = Modifier.padding(bottom = 24.px)
            ) {
                SkillIcon(
                    skillCategory
                )

                H3 {
                    Text(title)
                }
            }

            SimpleGrid(
                numColumns(1, md=3),
                modifier = Modifier.gap(20.px),
            ) {
                filteredSkills.forEach { skill ->
                    SkillCard(
                        skill = skill,
                    )
                }
            }
        }
    }
}
