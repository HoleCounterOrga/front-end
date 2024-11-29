package com.hole.counter.domain.authentication.register.models

sealed class RegisterUseCaseModel {
    data object Success : RegisterUseCaseModel()
    data object Failure : RegisterUseCaseModel()
}