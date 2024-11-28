package com.hole.counter.presentation.ui

import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.di.mainModules
import com.hole.counter.presentation.ui.root.RootContent
import com.hole.counter.presentation.ui.root.navigation.DefaultRootComponent
import org.koin.compose.KoinApplication
import org.koin.dsl.KoinAppDeclaration

@Composable
fun App(
    appDeclaration: KoinAppDeclaration = {},
    rootComponent: DefaultRootComponent,
){

    KoinApplication(application= mainModules(appDeclaration)){
        RootContent(rootComponent)
    }

}