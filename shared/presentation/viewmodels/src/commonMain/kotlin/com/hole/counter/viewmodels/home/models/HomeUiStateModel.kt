package com.hole.counter.viewmodels.home.models

data class HomeUiStateModel(
    val state: State = State.Init
){
    sealed class State{
        data object Init: State()
    }
}