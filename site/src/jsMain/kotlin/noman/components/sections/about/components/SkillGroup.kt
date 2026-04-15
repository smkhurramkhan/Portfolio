package noman.components.sections.about.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.letterSpacing
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import noman.components.models.Skill
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

/*
 * Copyright 2026 Muhammad Noman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


@Composable
fun SkillGroup(title: String, skills: List<Skill>, colorMode: ColorMode) {
    Column(modifier = Modifier.fillMaxWidth().gap(12.px).margin(bottom = 2.cssRem)) {
        SpanText(
            text = title.uppercase(),
            modifier = Modifier
                .fontSize(11.px)
                .fontWeight(FontWeight.Medium)
                .letterSpacing(1.5.px)
                .color(Color("$colorMode"))
                .margin(left = 4.px)
        )
        SimpleGrid(
            numColumns = numColumns(base = 2, md = 4, lg = 5),
            modifier = Modifier.fillMaxWidth().gap(10.px)
        ) {
            skills.forEach { skill ->
                SkillCard(skill = skill, colorMode = colorMode)
            }
        }
    }
}