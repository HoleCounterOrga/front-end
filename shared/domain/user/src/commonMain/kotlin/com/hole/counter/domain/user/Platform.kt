package com.hole.counter.domain.user

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform