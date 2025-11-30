package com.my.test
import kotlinx.browser.window

external interface WebAppUser {
    val id: Long
    val is_bot: Boolean?
    val first_name: String
    val last_name: String?
    val username: String?
    val language_code: String?
}

external interface WebAppInitData {
    val user: WebAppUser?
}

external interface ThemeParams {
    val bg_color: String?
    val text_color: String?
    val hint_color: String?
    val link_color: String?
    val button_color: String?
    val button_text_color: String?
}

external interface WebApp {
    val initDataUnsafe: WebAppInitData
    val themeParams: ThemeParams
    val colorScheme: String // "light" или "dark"
    fun ready()
    fun expand()
    fun close()
}

external object Telegram {
    val WebApp: WebApp
}


val telegramWebApp: WebApp?
    get() = try {
        Telegram.WebApp
    } catch (e: Exception) {
        null
    }

    