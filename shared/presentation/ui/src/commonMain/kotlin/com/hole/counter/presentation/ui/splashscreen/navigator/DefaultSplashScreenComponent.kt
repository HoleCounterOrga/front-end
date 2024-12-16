package com.hole.counter.presentation.ui.splashscreen.navigator

import com.arkivanov.decompose.ComponentContext

class DefaultSplashScreenComponent(
    componentContext: ComponentContext,
    private val onAccountSetNavigation: () -> Unit,
    private val onNotSetNavigation: () -> Unit,
) : SplashScreenComponent, ComponentContext by componentContext {

    override fun onAccountSet() {
        onAccountSetNavigation()
    }

    override fun onNotSet() {
        onNotSetNavigation()
    }
}