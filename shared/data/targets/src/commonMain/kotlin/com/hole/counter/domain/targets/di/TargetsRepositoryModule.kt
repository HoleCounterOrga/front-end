package com.hole.counter.domain.targets.di

import com.hole.counter.domain.targets.repository.TargetsRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import com.hole.counter.domain.targets.repository.TargetsRepositoryImpl

val targetsRepositoryModule = module {
    singleOf(::TargetsRepositoryImpl) bind TargetsRepository::class
}