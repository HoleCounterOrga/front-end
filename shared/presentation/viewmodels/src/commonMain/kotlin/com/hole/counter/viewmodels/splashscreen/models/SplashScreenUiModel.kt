package com.hole.counter.viewmodels.splashscreen.models

data class SplashScreenUiModel(
    val state: State = State.Init
) {
    sealed class State{
        data object Init: State()

        data object Success: State()

        data object Failure: State()
    }
}