package pl.michal_cyran.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import pl.michal_cyran.portfolio.components.layouts.PageLayoutData
import pl.michal_cyran.portfolio.core.MainScreen

@InitRoute
fun initMainPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData("Home"))
}

@Composable
@Layout(".components.layouts.PageLayout")
@Page
fun IndexPage() {
    MainScreen()
}
