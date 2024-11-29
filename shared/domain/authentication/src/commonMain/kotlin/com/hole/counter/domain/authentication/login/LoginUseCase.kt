package com.hole.counter.domain.authentication.login

import com.hole.counter.domain.authentication.login.models.LoginUseCaseModel

interface LoginUseCase{
    suspend fun invoke(username: String, password: String): LoginUseCaseModel
}