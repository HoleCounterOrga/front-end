package com.hole.counter.presentation.ui.home.navigator

import com.arkivanov.decompose.ComponentContext

class DefaultHomeComponent(
    componentContext: ComponentContext,
    private val onRegisterClickedPressed: () -> Unit,
) : HomeComponent, ComponentContext by componentContext {

    override fun onBackNavigation() {
        TODO("Not yet implemented")
    }
}