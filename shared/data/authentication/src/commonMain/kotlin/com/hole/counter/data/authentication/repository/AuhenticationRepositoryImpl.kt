package com.hole.counter.data.authentication.repository

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.serialization.Serializable

class AuthenticationRepositoryImpl(
    private val httpClient: HttpClient,
) : AuthenticationRepository {
    override suspend fun register(username: String, email: String, password: String, role: String) {
        try {
            val requestBody = RegisterRequest(
                username = username,
                email = email,
                password = password,
                role = "user"
            )

            val response: HttpResponse = httpClient.post("http://10.0.2.2:8000/api/auth/register") {
                contentType(ContentType.Application.Json)
                setBody(requestBody)
            }

            println("Response status: ${response.status}")
            println("Response body: ${response.body<String>()}")
        } catch (e: Exception) {
            println("Error during registration: ${e.message}")
            throw e
        }
    }

    override suspend fun login(username: String, password: String) {
        try {
            val requestBody = LoginRequest(
                grant_pattern = "password",
                username = username,
                password = password
            )

            val response: HttpResponse = httpClient.post("http://10.0.2.2:8000/api/auth/token") {
                contentType(ContentType.Application.Json)
                setBody(requestBody)
            }

            println("Response status: ${response.status}")
            println("Response body: ${response.body<String>()}")
        } catch (e: Exception) {
            println("Error during registration: ${e.message}")
            throw e
        }
    }
}

@Serializable
data class RegisterRequest(
    val username: String,
    val email: String,
    val password: String,
    val role: String
)

@Serializable
data class LoginRequest(
    val grant_pattern: String,
    val username: String,
    val password: String
)
