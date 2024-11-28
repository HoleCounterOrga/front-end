package com.hole.counter.presentation.ui.register.navigator

import com.arkivanov.decompose.ComponentContext
import com.hole.counter.presentation.ui.home.navigator.HomeComponent

class DefaultRegisterComponent(
    componentContext: ComponentContext,
    private val onRegisterClickedPressed: () -> Unit,
) : RegisterComponent, ComponentContext by componentContext {

    override fun onRegisterSuccess() {
        TODO("Not yet implemented")
    }
}