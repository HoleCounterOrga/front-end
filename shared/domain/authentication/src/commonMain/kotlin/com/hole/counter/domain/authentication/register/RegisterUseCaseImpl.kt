package com.hole.counter.domain.authentication.register

import com.hole.counter.data.authentication.repository.AuthenticationRepository
import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel

class RegisterUseCaseImpl(
    private val authenticationRepository: AuthenticationRepository
): RegisterUseCase{
    override suspend fun invoke(): RegisterUseCaseModel {
        authenticationRepository.register()
        return RegisterUseCaseModel.Failure
    }

}