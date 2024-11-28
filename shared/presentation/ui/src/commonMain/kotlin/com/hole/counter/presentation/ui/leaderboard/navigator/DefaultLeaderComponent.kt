package com.hole.counter.presentation.ui.leaderboard.navigator

import com.arkivanov.decompose.ComponentContext

class DefaultLeaderComponent(
    componentContext: ComponentContext,
    private val onAddTargetClicked: () -> Unit,
) : LeaderComponent, ComponentContext by componentContext {

    override fun onBackNavigation() {
        onAddTargetClicked()
    }
}