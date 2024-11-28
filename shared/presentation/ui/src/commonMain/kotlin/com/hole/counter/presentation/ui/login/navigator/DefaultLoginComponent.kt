package com.hole.counter.presentation.ui.login.navigator

import com.arkivanov.decompose.ComponentContext
import com.hole.counter.presentation.ui.home.navigator.HomeComponent

class DefaultLoginComponent(
    componentContext: ComponentContext,
    private val onLoginNavigation: () -> Unit,
) : LoginComponent, ComponentContext by componentContext {

    override fun onLogin() {
        onLoginNavigation()
    }
}