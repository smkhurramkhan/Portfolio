package noman.components.sections.navHeader.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.HamburgerIcon
import noman.components.widgets.IconButton

@Composable
fun HamburgerButton(onClick: () -> Unit) {
    IconButton(onClick) {
        HamburgerIcon()
    }
}