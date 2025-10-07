package pl.michal_cyran.portfolio.social_media.domain

import org.jetbrains.compose.web.css.CSSColorValue
import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.core.domain.Stat

data class SocialPlatform(
    val name: String,
    val icon: String,
    val badge: Badge,
    val description: String,
    val stats: List<Stat>,
    val buttonText: String,
    val buttonColor: CSSColorValue,
    val url: String,
)