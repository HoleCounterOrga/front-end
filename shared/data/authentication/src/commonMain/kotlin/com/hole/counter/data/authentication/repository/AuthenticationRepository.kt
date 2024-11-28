package com.hole.counter.data.authentication.repository

interface AuthenticationRepository{

    suspend fun register()

    suspend fun login()
}