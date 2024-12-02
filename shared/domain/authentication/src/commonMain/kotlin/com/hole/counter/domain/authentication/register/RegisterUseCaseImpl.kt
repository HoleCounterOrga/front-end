package com.hole.counter.domain.authentication.register

import com.hole.counter.data.authentication.repository.AuthenticationRepository
import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel

class RegisterUseCaseImpl(
    private val authenticationRepository: AuthenticationRepository
) : RegisterUseCase {

    override suspend operator fun invoke(
        username: String,
        email: String,
        password: String,
        role: String
    ): RegisterUseCaseModel {
        return try {
            authenticationRepository.register(username, email, password, role)
            RegisterUseCaseModel.Success // En cas de succès
        } catch (e: Exception) {
            RegisterUseCaseModel.Failure // En cas d'échec
        }
    }
}