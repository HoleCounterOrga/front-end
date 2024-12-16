package com.hole.counter.data.user.di

import org.koin.dsl.module
import com.hole.counter.data.user.localencryptedprefs.LocalEncryptedPreferencesRepositoryImpl
import com.hole.counter.data.user.localencryptedprefs.LocalEncryptedPreferencesRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind

val userRepositoryModule = module {

    singleOf(::LocalEncryptedPreferencesRepositoryImpl) bind LocalEncryptedPreferencesRepository::class
}