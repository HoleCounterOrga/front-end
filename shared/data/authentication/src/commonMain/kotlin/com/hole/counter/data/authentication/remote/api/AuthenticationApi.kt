package com.hole.counter.data.authentication.remote.api

import com.hole.counter.data.authentication.remote.NetworkResponse
import de.jensklingenberg.ktorfit.http.POST

interface AuthenticationApi{

    @POST("register")
    suspend fun register(): NetworkResponse<String>

    @POST("login")
    suspend fun login()
}