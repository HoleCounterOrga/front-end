package com.hole.counter.data.authentication.repository

import com.hole.counter.data.authentication.remote.api.AuthenticationApi
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import kotlinx.serialization.Serializable

class AuthenticationRepositoryImpl(
    private val httpClient: HttpClient,
): AuthenticationRepository{
    override suspend fun register() {
        val response: HttpResponse = httpClient.get("https://jsonplaceholder.typicode.com/todos/1")
        println("Body response: ${response.body<Todo>()}")
    }

    override suspend fun login() {
        TODO("Not yet implemented")
    }
}

@Serializable
data class Todo(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean
)