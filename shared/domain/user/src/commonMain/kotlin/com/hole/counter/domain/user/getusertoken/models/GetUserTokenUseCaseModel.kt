package com.hole.counter.domain.user.getusertoken.models

sealed class GetUserTokenUseCaseModel{

    data object Success: GetUserTokenUseCaseModel()

    data object Failure: GetUserTokenUseCaseModel()
}