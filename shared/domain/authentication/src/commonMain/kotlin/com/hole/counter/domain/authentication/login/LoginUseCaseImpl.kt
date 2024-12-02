package com.hole.counter.domain.authentication.login

import com.hole.counter.data.authentication.repository.AuthenticationRepository
import com.hole.counter.domain.authentication.login.models.LoginUseCaseModel

class LoginUseCaseImpl(
    private val authenticationRepository: AuthenticationRepository
): LoginUseCase{

    override suspend fun invoke(
        username: String,
        password: String
    ): LoginUseCaseModel {
        return try {
            authenticationRepository.login(username, password)
            LoginUseCaseModel.Success
        } catch (e: Exception) {
            LoginUseCaseModel.Failure
        }
    }

}