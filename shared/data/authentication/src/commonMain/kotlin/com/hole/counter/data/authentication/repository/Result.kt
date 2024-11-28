package com.hole.counter.data.authentication.repository

sealed class Result<out R>{
    data class Success<out T>(val data: T) : Result<T>()
    data class Failure<out T>(val cause: FailureCauseModel) : Result<T>()
}