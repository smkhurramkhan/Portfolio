package noman.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import kotlinx.browser.document
import noman.components.sections.footer.ui.Footer
import noman.components.sections.navHeader.ui.NavHeader
import noman.components.utils.Res
import noman.components.fadeInOnVisible
import noman.components.rememberVisibility
import noman.components.widgets.SVGHeroBackround
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh


@Composable
fun DefaultPageLayout(
    title: String,
    content: @Composable () -> Unit,
) {
    val isVisible = rememberVisibility("home")

    LaunchedEffect(title) {
        document.title = title
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Relative)
    ) {
        // Mobile wave background  subtle, behind everything
        SVGHeroBackround(
            modifier = Modifier
                .displayUntil(Breakpoint.LG)
                .position(Position.Absolute)
                .top(0.px)
                .right(0.px)
                .height(50.vh)
                .zIndex(0),
            src = Res.Images.WAVES_MD
        )

        // Desktop wave  profile image
        SVGHeroBackround(
            modifier = Modifier
                .displayIfAtLeast(Breakpoint.LG)
                .top(0.px)
                .right(0.px)
                .height(100.vh),
            src = Res.Images.WAVES
        )

        Image(
            src = "images/main_profile.png",
            modifier = Modifier
                .displayIfAtLeast(Breakpoint.LG)
                .position(Position.Absolute)
                .top(64.px)
                .right(0.px)
                .height(95.vh)
                .width(autoLength)
                .objectFit(ObjectFit.Cover)
                .zIndex(0)
                .fadeInOnVisible(isVisible)
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
//                .zIndex(1),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            content()
            Footer()
        }
    }
}