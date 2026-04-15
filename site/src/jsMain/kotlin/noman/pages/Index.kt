package noman.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import noman.components.layouts.DefaultPageLayout
import noman.components.sections.about.ui.About
import noman.components.sections.home.ui.Home
import noman.components.sections.projects.ui.Projects
import noman.toSitePalette

@Page
@Composable
fun HomePage() {
    DefaultPageLayout("Muhammad Noman") {

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            val currentPalette = ColorMode.current.toSitePalette()


            Home(currentPalette = currentPalette)

            About()

            Projects()
        }
    }

}

