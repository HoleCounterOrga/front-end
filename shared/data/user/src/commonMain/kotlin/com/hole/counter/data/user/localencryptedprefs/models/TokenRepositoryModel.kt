package com.hole.counter.data.user.localencryptedprefs.models

data class TokenRepositoryModel(
    val token: String,
    val refreshToken: String
)