package noman.components.sections.projects.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.bottom
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import noman.components.sections.projects.model.Project
import noman.components.utils.Res
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

/*
 * Copyright 2026 Sardar Khurram Pervaiz
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
fun TechPill(text: String) {
    Box(
        modifier = Modifier
            .backgroundColor(Color("rgba(255,255,255,0.07)"))
            .borderRadius(4.px)
            .padding(leftRight = 7.px, topBottom = 2.px)
    ) {
        SpanText(
            text = text,
            modifier = Modifier
                .fontSize(10.px)
                .color(Color("rgba(255,255,255,0.5)"))
        )
    }
}

@Composable
fun ProjectCard(project: Project) {
    val ctx = rememberPageContext()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(16.px)
            .overflow(Overflow.Hidden)
            .border(0.5.px, LineStyle.Solid, Color("rgba(255,255,255,0.08)"))
            .position(Position.Relative)
            .cursor(Cursor.Pointer)
            .styleModifier { property("aspect-ratio", "16/10") }
            .onClick { ctx.router.navigateTo(project.url) }
    ) {
        // Project image
        Image(
            src = project.imageSrc,
            modifier = Modifier
                .fillMaxSize()
                .objectFit(ObjectFit.Cover)
        )

        // Dark gradient overlay
        Box(
            modifier = Modifier
                .fillMaxSize()
                .position(Position.Absolute)
                .top(0.px).left(0.px)
                .styleModifier {
                    property(
                        "background",
                        "linear-gradient(to top, rgba(0,0,0,0.85) 0%, rgba(0,0,0,0.2) 55%, transparent 100%)"
                    )
                }
        )

        // Content pinned to bottom
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .position(Position.Absolute)
                .bottom(0.px)
                .left(0.px)
                .padding(18.px)
                .gap(6.px)
        ) {
            // Tag badge
            Box(
                modifier = Modifier
                    .backgroundColor(Color("rgba(0,230,118,0.12)"))
                    .border(0.5.px, LineStyle.Solid, Color("rgba(0,230,118,0.3)"))
                    .borderRadius(4.px)
                    .padding(leftRight = 8.px, topBottom = 3.px)
            ) {
                SpanText(
                    text = project.tag.uppercase(),
                    modifier = Modifier
                        .fontSize(10.px)
                        .fontWeight(FontWeight.Medium)
                        .color(Color("#00e676"))
                        .styleModifier { property("letter-spacing", "1.2px") }
                )
            }

            // Project name
            SpanText(
                text = project.name,
                modifier = Modifier
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Medium)
                    .color(Colors.White)
            )

            // Description
            SpanText(
                text = project.description,
                modifier = Modifier
                    .fontSize(12.px)
                    .color(Color("rgba(255,255,255,0.6)"))
                    .lineHeight(1.5)
            )

            // Tech pills + GitHub icon row
            Row(
                modifier = Modifier.fillMaxWidth().margin(top = 4.px),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(modifier = Modifier.gap(6.px), verticalAlignment = Alignment.CenterVertically) {
                    project.techs.forEach { TechPill(it) }
                }

                Box(
                    modifier = Modifier
                        .size(28.px)
                        .borderRadius(50.percent)
                        .backgroundColor(Color("rgba(255,255,255,0.1)"))
                        .display(DisplayStyle.Flex)
                        .alignItems(AlignItems.Center)
                        .justifyContent(JustifyContent.Center)
                ) {
                    Image(
                        src = Res.Images.GITHUB_LIGHT_LOGO,
                        modifier = Modifier.size(14.px)
                    )
                }
            }
        }
    }
}