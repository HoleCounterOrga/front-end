package com.hole.counter.data.authentication.repository

interface AuthenticationRepository {
    suspend fun register(username: String, email: String, password: String, role: String)
    suspend fun login(username: String, password: String)
}