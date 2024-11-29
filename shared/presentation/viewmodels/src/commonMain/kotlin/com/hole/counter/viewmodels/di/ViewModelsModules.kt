package com.hole.counter.viewmodels.di

import com.hole.counter.core.http.di.httpCoreModule
import com.hole.counter.data.authentication.di.authRepositoryModule
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import com.hole.counter.viewmodels.home.HomeViewModel
import com.hole.counter.viewmodels.register.RegisterViewModel
import com.hole.counter.viewmodels.login.LoginViewModel
import com.hole.counter.viewmodels.leaderboard.LeaderBoardViewModel
import com.hole.counter.domain.authentication.di.authDomainModule
import com.hole.counter.domain.targets.di.targetsRepositoryModule
import com.hole.counter.viewmodels.register.mappers.RegisterFormMappers

val viewModelsModule = module {

    /*
    includes(httpModule)
    includes(encryptedPreferencesModule)

    includes(userRepositoryModule)
    includes(coursesRepositoryModule)

    includes(userDomainModule)
    includes(coursesDomainModule)

    includes(userEntityModule)

    factoryOf(::HomeViewModel)*/
    includes(httpCoreModule)

    includes(authRepositoryModule)
    includes(targetsRepositoryModule)
    includes(authDomainModule)

    factoryOf(::HomeViewModel)
    factoryOf(::RegisterViewModel)
    factoryOf(::LoginViewModel)
    factoryOf(::LeaderBoardViewModel)

    factoryOf(::RegisterFormMappers)
}