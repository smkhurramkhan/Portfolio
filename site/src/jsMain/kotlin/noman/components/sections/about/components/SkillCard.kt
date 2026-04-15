package noman.components.sections.about.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import noman.components.models.Skill
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

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
fun SkillDots(filled: Int, level: String) {
    val dotColor = when (level) {
        "Skilled" -> Color("#00c853")
        "Adept"   -> Color("#2979ff")
        else      -> Color("#ff6d00")  // Novice
    }
    Row(modifier = Modifier.gap(4.px), verticalAlignment = Alignment.CenterVertically) {
        repeat(5) { index ->
            Box(
                modifier = Modifier
                    .size(7.px)
                    .borderRadius(50.percent)
                    .backgroundColor(
                        if (index < filled) dotColor
                        else when (ColorMode.current) {
                            ColorMode.LIGHT -> Color("rgba(0,0,0,0.12)")
                            ColorMode.DARK  -> Color("rgba(255,255,255,0.15)")
                        }
                    )
            )
        }
    }
}

@Composable
fun SkillCard(skill: Skill, colorMode: ColorMode) {

    val bgColor = when (colorMode) {
        ColorMode.LIGHT -> Color("rgba(0,0,0,0.04)")
        ColorMode.DARK  -> Color("rgba(255,255,255,0.04)")
    }
    val borderColor = when (colorMode) {
        ColorMode.LIGHT -> Color("rgba(0,0,0,0.10)")
        ColorMode.DARK  -> Color("rgba(255,255,255,0.08)")
    }


    Column(
        modifier = Modifier
            .backgroundColor(bgColor)
            .border(0.5.px, LineStyle.Solid, borderColor)
            .borderRadius(12.px)
            .padding(14.px)
            .gap(10.px)
            .styleModifier {
                property("transition", "border-color 0.15s ease")
            }
    ) {
        Image(
            src = if (colorMode.isLight) skill.iconResLight else skill.iconResDark,
            modifier = Modifier.size(36.px).objectFit(ObjectFit.Contain)
        )
        SpanText(
            text = skill.skillName,
            modifier = Modifier
                .fontSize(13.px)
                .fontWeight(FontWeight.Medium)
        )
        SkillDots(filled = skill.dots, level = skill.level)
    }
}