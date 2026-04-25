package noman.components.sections.footer.ui

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toModifier
import noman.components.fadeInOnVisible
import noman.components.rememberVisibility
import noman.components.sections.footer.components.ContactProfileImage
import noman.components.sections.footer.components.DeveloperLocationInfoRow
import noman.components.sections.footer.components.FooterContactRow
import noman.components.sections.footer.components.GetInTouchColumn
import noman.components.sections.footer.style.FooterStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px


@Composable
fun Footer(modifier: Modifier = Modifier) {
    val isVisible = rememberVisibility("contact")


    Column(
        modifier = FooterStyle.toModifier()
            .fillMaxWidth()
            .id("contact")


    ) {

        Column(
            modifier = modifier
                .fillMaxWidth()

        ) {


            // DESKTOP
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .displayIfAtLeast(Breakpoint.LG)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding { bottom(3.cssRem) }
                    ,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    // LEFT SIDE (TEXT)
                    Column(
                        modifier = Modifier
                            .weight(1)
                            .padding { right(
                                4.cssRem
                            ) }
                    ) {

                        GetInTouchColumn()

                        FooterContactRow(
                            modifier = Modifier.margin(top = 24.px)
                        )
                    }

                    // RIGHT SIDE (IMAGE)
                    ContactProfileImage(
                        modifier = Modifier
                            .fadeInOnVisible(isVisible)
                    )

                }

                //
                DeveloperLocationInfoRow()
            }

            // Mobile: stacked
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .displayUntil(Breakpoint.LG),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ContactProfileImage(
                    modifier = Modifier
                        .margin(bottom = 32.px)
                         .fadeInOnVisible(isVisible)
                )

                GetInTouchColumn()

                FooterContactRow(modifier = modifier.padding { bottom(4.cssRem) })

                DeveloperLocationInfoRow()
            }

        }
    }
}



