package com.hole.counter.domain.authentication.register

import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel

interface RegisterUseCase{
    suspend operator fun invoke(): RegisterUseCaseModel
}