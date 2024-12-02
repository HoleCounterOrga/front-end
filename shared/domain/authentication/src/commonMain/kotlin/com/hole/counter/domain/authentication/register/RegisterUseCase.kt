package com.hole.counter.domain.authentication.register

import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel

interface RegisterUseCase {
    operator suspend fun invoke(username: String, email: String, password: String, role: String): RegisterUseCaseModel
}