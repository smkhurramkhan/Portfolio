package noman.components.sections.about.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import noman.components.models.Skill
import noman.components.models.SkillCategory
import noman.components.sections.about.components.SkillGroup
import noman.components.sections.about.components.SkillItem
import noman.components.sections.about.style.AboutDiscriptionStyle
import noman.components.sections.about.style.AboutStyle
import noman.components.sections.about.style.SkillsGridStyle
import noman.components.utils.Res
import noman.components.widgets.SectionTitle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun About() {
    val colorMode by ColorMode.currentState

    Column(
        modifier = AboutStyle.toModifier().id("about"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(Res.Title.ABOUT)

        SpanText(
            text = Res.Constants.ABOUT_ME_TEXT,
            modifier = AboutDiscriptionStyle.toModifier()
                .color(
                    when (colorMode) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.LightGray
                    }
                )
                .lineHeight(2)
        )

        Column(modifier = Modifier.fillMaxWidth().margin(top = 2.cssRem)) {
            SkillGroup(
                "Languages",
                Skill.entries.filter { it.category == SkillCategory.Languages },
                colorMode
            )
            SkillGroup(
                "Tools & IDEs",
                Skill.entries.filter { it.category == SkillCategory.ToolsIDEs },
                colorMode
            )
            SkillGroup(
                "Frameworks & Platforms",
                Skill.entries.filter { it.category == SkillCategory.Frameworks },
                colorMode
            )
        }

        // Legend
        Row(
            modifier = Modifier.fillMaxWidth().gap(1.5.cssRem).margin(top = 1.cssRem),
            verticalAlignment = Alignment.CenterVertically
        ) {
            listOf(
                "Skilled" to "#00c853",
                "Adept" to "#2979ff",
                "Novice" to "#ff6d00"
            ).forEach { (label, color) ->
                Row(modifier = Modifier.gap(6.px), verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier.size(8.px).borderRadius(50.percent)
                            .backgroundColor(Color(color))
                    )
                    SpanText(
                        text = label,
                        modifier = Modifier.fontSize(12.px).color(
                            when (colorMode) {
                                ColorMode.LIGHT -> Colors.Gray
                                ColorMode.DARK -> Colors.LightGray
                            }
                        )
                    )
                }
            }
        }
    }
}