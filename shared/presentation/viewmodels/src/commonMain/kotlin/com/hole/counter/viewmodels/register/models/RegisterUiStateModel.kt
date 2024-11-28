package com.hole.counter.viewmodels.register.models

data class RegisterUiStateModel(
    val state: State = State.Init
){
    sealed class State{
        data object Init: State()
    }
}