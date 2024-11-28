package com.hole.counter.presentation.ui.di

import com.hole.counter.viewmodels.di.viewModelsModule
import org.koin.dsl.KoinAppDeclaration

fun mainModules(appDeclaration: KoinAppDeclaration): KoinAppDeclaration = {
    modules(
        viewModelsModule
    )
    appDeclaration()
}