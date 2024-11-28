package com.hole.counter.presentation.ui.home.navigator

import com.arkivanov.decompose.ComponentContext

class DefaultHomeComponent(
    componentContext: ComponentContext,
    private val onLeaderBoardNavigation: () -> Unit,
    private val onAddTargetNavigation: () -> Unit,
) : HomeComponent, ComponentContext by componentContext {

    override fun onLeaderBoard() {
        onLeaderBoardNavigation()
    }

    override fun onAddTarget() {
        onAddTargetNavigation()
    }
}