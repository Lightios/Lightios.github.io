package pl.michal_cyran.portfolio.projects.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.fa.FaBriefcase
import com.varabyte.kobweb.silk.components.icons.fa.FaDumbbell
import com.varabyte.kobweb.silk.components.icons.fa.FaPerson
import com.varabyte.kobweb.silk.components.icons.fa.FaSchool
import com.varabyte.kobweb.silk.components.icons.fa.FaUserGraduate
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import pl.michal_cyran.portfolio.projects.domain.ProjectCategory

@Composable
fun ProjectCategoryIcon(
    category: ProjectCategory,
    size: IconSize = IconSize.LG,
) {
    when (category) {
        ProjectCategory.COMMERCIAL -> FaBriefcase(size = size)
        ProjectCategory.PERSONAL -> FaPerson(size = size)
        ProjectCategory.ACADEMIC -> FaUserGraduate()
        ProjectCategory.PRACTICE -> FaDumbbell()
    }
}