package noman.components.sections.navHeader.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.CloseIcon
import noman.components.widgets.IconButton

@Composable
fun CloseButton(onClick: () -> Unit) {
    IconButton(onClick) {
        CloseIcon()
    }
}
