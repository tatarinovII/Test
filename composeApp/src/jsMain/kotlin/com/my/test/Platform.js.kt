package com.my.test

class JsPlatform: Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()

actual fun getTelegramUserName(): String? {
    return telegramWebApp?.initDataUnsafe?.user?.first_name
}