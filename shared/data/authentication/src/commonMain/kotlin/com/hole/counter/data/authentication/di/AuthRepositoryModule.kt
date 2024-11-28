package com.hole.counter.data.authentication.di

import com.hole.counter.data.authentication.repository.AuthenticationRepository
import com.hole.counter.data.authentication.repository.AuthenticationRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authRepositoryModule = module {

    singleOf(::AuthenticationRepositoryImpl) bind AuthenticationRepository::class
}