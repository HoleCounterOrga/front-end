package com.hole.counter.presentation.ui.addtarget.navigator

import com.arkivanov.decompose.ComponentContext

class DefaultAddTargetComponent(
    componentContext: ComponentContext,
    private val onLeaderBoardNavigation: () -> Unit,
    private val addNewBoardNavigation: () -> Unit,
) : AddTargetComponent, ComponentContext by componentContext {

    override fun onNavigationBack() {
        TODO("Not yet implemented")
    }
}