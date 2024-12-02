package com.hole.counter.presentation.ui.register.navigator

import com.arkivanov.decompose.ComponentContext
import com.hole.counter.presentation.ui.home.navigator.HomeComponent

class DefaultRegisterComponent(
    componentContext: ComponentContext,
    private val onRegisterNavigation: () -> Unit,
    private val onLoginNavigation: () -> Unit,
) : RegisterComponent, ComponentContext by componentContext {

    override fun onRegister() {
        onRegisterNavigation()
    }

    override fun onLogin() {
        onLoginNavigation()
    }
}