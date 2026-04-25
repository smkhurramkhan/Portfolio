package noman.components.sections.projects.ui

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.icons.fa.FaUpRightFromSquare
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import noman.components.SectionDiscriptionStyle
import noman.components.sections.projects.components.ProjectCard
import noman.components.sections.projects.components.getAllProjects
import noman.components.sections.projects.style.ProjectsStyle
import noman.components.utils.Res
import noman.components.utils.Res.Constants
import noman.components.widgets.SectionTitle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun Projects() {
    Column(
        modifier = ProjectsStyle.toModifier()
            .id("projects"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(Res.Title.PROJECTS)

        SpanText(
            text = Constants.PROJECT_SECTION_TEXT,
            modifier = SectionDiscriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.LightGray
                    }
                )
        )

        SimpleGrid(
            numColumns = numColumns(base = 1, sm = 2, md = 3),
            modifier = Modifier
                .fillMaxWidth()
                .gap(16.px)
                .margin(top = 3.cssRem, bottom = 2.cssRem)
        ) {
            getAllProjects().forEach { project ->
                ProjectCard(project = project)
            }
        }

        // More on GitHub link
        Row(
            modifier = Modifier
                .border(0.5.px, LineStyle.Solid, Color("rgba(255,255,255,0.15)"))
                .borderRadius(8.px)
                .padding(leftRight = 20.px, topBottom = 10.px)
                .margin(bottom = 4.cssRem)
                .cursor(Cursor.Pointer),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.px)
        ) {
            Link(
                path = Constants.PROJECT_REPOSITORIES_URL,
                text = Constants.MORE_ON_GITHUB,
                modifier = Modifier
                    .fontSize(14.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Black
                            ColorMode.DARK -> Colors.White
                        }
                    )
            )
            FaUpRightFromSquare(
                modifier = Modifier.color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Black
                        ColorMode.DARK -> Colors.White
                    }
                )
            )
        }
    }
}
