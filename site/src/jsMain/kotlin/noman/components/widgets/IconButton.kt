package noman.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.setVariable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import noman.CircleButtonVariant
import noman.UncoloredButtonVariant
import org.jetbrains.compose.web.css.em

@Composable
fun IconButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    Button(
        onClick = { onClick() },
        modifier = Modifier.setVariable(ButtonVars.FontSize, 1.em),
        variant = CircleButtonVariant.then(UncoloredButtonVariant)
    ) {
        content()
    }
}
