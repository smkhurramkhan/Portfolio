package noman.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.browser.dom.observers.IntersectionObserver
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.styleModifier
import kotlinx.browser.document
import kotlinx.coroutines.delay

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
fun rememberVisibility(elementId: String): Boolean {
    val isVisible = remember { mutableStateOf(false) }

    LaunchedEffect(elementId) {
        delay(200)

        val element = document.getElementById(elementId)

        if (element != null) {
            val observer = IntersectionObserver { entries, _ ->
                entries.forEach { entry ->
                    isVisible.value = entry.isIntersecting
                }
            }

            observer.observe(element)
        }
    }

    return isVisible.value
}

fun Modifier.fadeInOnVisible(visible: Boolean): Modifier =
    this
        .opacity(if (visible) 1 else 0)
        .styleModifier {
            property(
                "transform",
                if (visible) "translateY(0px)" else "translateY(10px)"
            )
            property("transition", "opacity 0.8s ease, transform 1s ease")
            property("will-change", "opacity, transform")
        }