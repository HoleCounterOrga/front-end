package com.hole.counter.data.authentication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform