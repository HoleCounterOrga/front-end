package com.hole.counter.domain.authentication.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.hole.counter.domain.authentication.login.LoginUseCaseImpl
import com.hole.counter.domain.authentication.login.LoginUseCase
import com.hole.counter.domain.authentication.register.RegisterUseCase
import com.hole.counter.domain.authentication.register.RegisterUseCaseImpl
import org.koin.dsl.bind

val authDomainModule = module {

    singleOf(::LoginUseCaseImpl) bind LoginUseCase::class

    singleOf(::RegisterUseCaseImpl) bind RegisterUseCase::class
}