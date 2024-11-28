package com.hole.counter.data.authentication.remote

sealed class NetworkResponse<out T> {
    data class Success<T>(val data: T) : NetworkResponse<T>()
    data class Error(val message: String, val throwable: Throwable? = null) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}