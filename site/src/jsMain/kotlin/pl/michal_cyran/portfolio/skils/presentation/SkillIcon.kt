package pl.michal_cyran.portfolio.skils.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.fa.FaCode
import com.varabyte.kobweb.silk.components.icons.fa.FaLanguage
import com.varabyte.kobweb.silk.components.icons.fa.FaLightbulb
import com.varabyte.kobweb.silk.components.icons.fa.FaOctopusDeploy
import com.varabyte.kobweb.silk.components.icons.fa.FaPalette
import com.varabyte.kobweb.silk.components.icons.fa.FaToolbox
import pl.michal_cyran.portfolio.skils.domain.Skill
import pl.michal_cyran.portfolio.skils.domain.SkillCategory

@Composable
fun SkillIcon(
    skillCategory: SkillCategory
) {
    when (skillCategory) {
        SkillCategory.PROGRAMMING_LANGUAGES -> FaCode()
        SkillCategory.MARKUP_AND_STYLE -> FaPalette()
        SkillCategory.FRAMEWORKS -> FaOctopusDeploy()
        SkillCategory.NATURAL_LANGUAGES -> FaLanguage()
        SkillCategory.TOOLS_AND_LIBRARIES -> FaToolbox()
        SkillCategory.OTHER -> FaLightbulb()
    }
}