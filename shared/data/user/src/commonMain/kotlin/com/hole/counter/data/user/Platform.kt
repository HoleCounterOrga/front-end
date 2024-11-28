package com.hole.counter.data.user

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform