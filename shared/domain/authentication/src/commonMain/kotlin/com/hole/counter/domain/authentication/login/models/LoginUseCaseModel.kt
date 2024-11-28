package com.hole.counter.domain.authentication.login.models

sealed class LoginUseCaseModel{

    //To-do: change to data class
    data object Success: LoginUseCaseModel()

    data object Failure: LoginUseCaseModel()
}