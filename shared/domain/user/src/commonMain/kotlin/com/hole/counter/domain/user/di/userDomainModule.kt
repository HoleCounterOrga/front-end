package com.hole.counter.domain.user.di

import org.koin.dsl.module
import com.hole.counter.domain.user.getusertoken.GetUserTokenUseCase
import com.hole.counter.domain.user.getusertoken.GetUserTokenUseCaseImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind


val userDomainModule = module {

    singleOf(::GetUserTokenUseCaseImpl) bind GetUserTokenUseCase::class
}