package com.hole.counter.viewmodels.di

import com.hole.counter.core.encrypted_preferences.di.encryptedPreferencesModule
import com.hole.counter.core.http.di.httpCoreModule
import com.hole.counter.data.authentication.di.authRepositoryModule
import com.hole.counter.data.user.di.userRepositoryModule
import com.hole.counter.domain.authentication.di.authDomainModule
import com.hole.counter.domain.targets.di.targetsRepositoryModule
import com.hole.counter.domain.user.di.userDomainModule
import com.hole.counter.viewmodels.home.HomeViewModel
import com.hole.counter.viewmodels.leaderboard.LeaderBoardViewModel
import com.hole.counter.viewmodels.login.LoginViewModel
import com.hole.counter.viewmodels.login.mappers.LoginFormMappers
import com.hole.counter.viewmodels.register.RegisterViewModel
import com.hole.counter.viewmodels.register.mappers.RegisterFormMappers
import com.hole.counter.viewmodels.splashscreen.SplashScreenViewModel
import com.hole.counter.viewmodels.splashscreen.mappers.SplashScreenUiMappers
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

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
    includes(encryptedPreferencesModule)

    includes(authRepositoryModule)
    includes(targetsRepositoryModule)
    includes(userRepositoryModule)

    includes(authDomainModule)
    includes(userDomainModule)

    factoryOf(::SplashScreenViewModel)
    factoryOf(::HomeViewModel)
    factoryOf(::RegisterViewModel)
    factoryOf(::LoginViewModel)
    factoryOf(::LeaderBoardViewModel)
    factoryOf(::LoginFormMappers)
    factoryOf(::SplashScreenUiMappers)

    factoryOf(::RegisterFormMappers)
}