package com.my.test

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    // Возвращаемся к современному API ComposeViewport
    ComposeViewport(document.body!!) {
        App()
    }
}
