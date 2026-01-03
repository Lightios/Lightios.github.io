package pl.michal_cyran.portfolio.education.presentation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.education.domain.Subject


@Composable
fun SubjectItem(
    subject: Subject,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .then(
                backgroundContainer.toModifier()
            )
    ) {
        Text(
            subject.name,
        )
    }
}