package noman.components.sections.footer.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toModifier
import noman.components.sections.footer.style.FooterDescriptionStyle
import noman.components.styles.MainButtonStyle
import noman.components.utils.Res
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun GetInTouchColumn( modifier: Modifier = Modifier) {

    Column (
        modifier = modifier
            .fillMaxWidth()
        ,
        horizontalAlignment = Alignment.Start
    ){


        // Get in Touch
        Row (
            modifier = modifier.fillMaxWidth()
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){

            SpanText(
                text = Res.Constants.GET_IN_TOUCH,
                modifier = modifier
                    .fontSize(2.cssRem)
                    .fontWeight(FontWeight.Black)
            )
        }

        // Discription

        // For Size SM & Below
        Column (
            modifier = modifier
                .displayUntil(Breakpoint.MD)
                .fillMaxWidth()
                .padding(top = 1.cssRem, bottom = 3.cssRem)
            ,
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            SpanText(
                text = Res.Constants.GET_IN_TOUCH_DISCRIPTION,
                modifier = FooterDescriptionStyle.toModifier()
            )
        }

        // For Size MD & Above
        Column  (
            modifier = modifier
                .displayIfAtLeast(Breakpoint.MD)
                .width(52.cssRem)
                .padding(top = 1.cssRem, bottom = 3.cssRem)
            ,
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            SpanText(
                text = Res.Constants.GET_IN_TOUCH_DISCRIPTION,
                modifier = FooterDescriptionStyle.toModifier()
            )

        }
    }
}