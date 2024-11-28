package com.hole.counter.presentation.ui.leaderboard.navigator

import com.arkivanov.decompose.ComponentContext
import com.hole.counter.presentation.ui.home.navigator.HomeComponent

class DefaultLeaderComponent(
    componentContext: ComponentContext,
    private val onRegisterClickedPressed: () -> Unit,
) : LeaderComponent, ComponentContext by componentContext {

    override fun onBackNavigation() {
        TODO("Not yet implemented")
    }
}