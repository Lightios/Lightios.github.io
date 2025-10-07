package pl.michal_cyran.portfolio.social_media.data

import org.jetbrains.compose.web.css.Color
import pl.michal_cyran.portfolio.core.domain.Badge
import pl.michal_cyran.portfolio.core.domain.Stat
import pl.michal_cyran.portfolio.social_media.domain.SocialPlatform


val socialMedia = listOf(
    SocialPlatform(
        name = "YouTube Channel",
        icon = "youtube.png",
        badge = Badge(Res.string.social_media, Color("3DC2626")),
        description = "",
        stats = listOf(
            Stat("25+", Res.string.social_media, Color("#DC2626")),
//            Stat("❤", "Growing Community")
//            es.drawable.calendar_month,
        ),
        buttonText = "Subscribe to Channel",
        buttonColor = Color("#DC2626"),
        url = "https://www.youtube.com/@cyran.michal/videos"
    ),
    SocialPlatform(
        name = "TikTok",
        icon = "tiktok.png",
        badge = Badge(Res.string.social_media, Color("#EC4899")),
        description = "",
        stats = listOf(
            Stat("25+", Res.string.social_media, Color("#DC2626")),
//        Stat("▶", "50+ Videos"),
//        Stat("❤", "Engaging Content")
        ),
        buttonText = "Follow on TikTok",
        buttonColor = Color("#EC4899"),
        url = "https://www.tiktok.com/@cyran_michal"
    )
)