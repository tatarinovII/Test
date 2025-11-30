package com.my.test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform