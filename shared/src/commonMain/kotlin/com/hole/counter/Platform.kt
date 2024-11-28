package com.hole.counter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform