package pl.michal_cyran.portfolio.skils.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction

import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.aspectRatio
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textShadow
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.dom.Col
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.portfolio.colors.backgroundContainer
import pl.michal_cyran.portfolio.core.presentation.CardStyle
import pl.michal_cyran.portfolio.core.presentation.styles.EducationCardStyle
import pl.michal_cyran.portfolio.skils.domain.Skill

val BoxStyle = CssStyle {
    base {
        Modifier
            .padding(20.px)
//            .cursor(Cursor.Pointer)
    }
    cssRule("h6") {
        Modifier
            .transition(Transition.of("text-shadow", 0.3.s, TransitionTimingFunction.Ease))
    }
    cssRule(":hover h6") {
        Modifier
            .textShadow(2.px, 2.px, 5.px, Colors.Gray)
    }
}

@Composable
fun SkillCard(
    skill: Skill,
    modifier: Modifier = Modifier
) {
    var hovered by remember { mutableStateOf(false) }

    Box(
        modifier = BoxStyle.toModifier()
            .then(backgroundContainer.toModifier())
            .then(CardStyle.toModifier())
            .then(modifier)

//            .onPointerEvent(PointerEventType.Enter) { hovered = true }
//            .onPointerEvent(PointerEventType.Exit) { hovered = false }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(10.px),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(0.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(64.px)
                        .border(color = if (hovered) skill.level.toColor() else Colors.Transparent, width = 2.px)
                        .borderRadius(32.px),
//                    .background(MaterialTheme.colorScheme.surfaceContainerLow, CircleShape)
//                    .border(color = skill.level.toColor(), width = 2.dp, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        src = skill.icon,
                        alt = "Skill Icon",
                        modifier = Modifier.size(40.px).aspectRatio(1f)
                            .objectFit(ObjectFit.ScaleDown)
                    )
                }

                H6(
                ) {
                    Text(
                        skill.name,
                    )
                }

                Spacer()

                SkillLevelBadge(
                    skill.level,
                    hovered = hovered,
                    modifier = Modifier
                        .weight(1f)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth().padding(top = 10.px)
            ) {
                SkillLevelIndicator(
                    filled = skill.level.ordinal + 1,
                    filledColor = skill.level.toColor()
                )
            }
        }
    }
}

@Composable
fun SkillLevelIndicator(
    filled: Int,
    total: Int = 5,
    filledColor: CSSColorValue,
    emptyColor: CSSColorValue = Colors.Gray,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.px),
        modifier = modifier.padding(leftRight = 10.px)
    ) {
        repeat(total) { index ->
            Box(
                modifier = Modifier
                    .size(width = 32.px, height = 6.px)
                    .backgroundColor(
                        if (index < filled) filledColor else emptyColor,
                    )
            )
        }
    }
}