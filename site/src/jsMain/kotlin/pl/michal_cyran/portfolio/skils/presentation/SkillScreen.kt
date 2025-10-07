package pl.michal_cyran.portfolio.skils.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.components.widgets.Headline
import pl.michal_cyran.portfolio.skils.data.skills


@Composable
fun SkillsScreen(
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .padding(24.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Headline(
            title = Res.string.skills_title,
            subtitle = Res.string.skills_subtitle,
        )

//        Spacer(modifier = height(32.dp))

        // Search Bar
//        OutlinedTextField(
//            value = searchQuery,
//            onValueChange = { searchQuery = it },
//            placeholder = {
//                Text(
//                    stringResource(Res.string.search_placeholder),
//                    color = Color(0xFF6B7280)
//                )
//            },
//            leadingIcon = {
//                Icon(
//                    painter = painterResource(Res.drawable.search),
//                    contentDescription = "Search",
//                    tint = Color(0xFF6B7280)
//                )
//            },
//            modifier = Modifier
//                .clip(RoundedCornerShape(12.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = Color(0xFF374151),
//                unfocusedBorderColor = Color(0xFF374151),
//                focusedTextColor = Color.White,
//                unfocusedTextColor = Color.White,
//                cursorColor = Color(0xFF4A90E2)
//            ),
//            shape = RoundedCornerShape(12.dp)
//        )


        Column(
            verticalArrangement = Arrangement.spacedBy(32.px),
            modifier = Modifier.padding(top = 40.px)
        ) {
            skills
                .groupBy { it.category }
                .forEach {
                    (category, skillsList) ->

                    if (skillsList.isEmpty()) return@forEach
                    SkillSection(
                        title = category.title,
                        skills = skillsList,
                        skillCategory = category,
                        searchQuery = searchQuery
                    )
                }

        }
    }
}


