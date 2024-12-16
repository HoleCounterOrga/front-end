package com.hole.counter.domain.user.getusertoken

import com.hole.counter.domain.user.getusertoken.models.GetUserTokenUseCaseModel

interface GetUserTokenUseCase{
    suspend operator fun invoke(): GetUserTokenUseCaseModel
}