package com.hole.counter.viewmodels.login.models

data class LoginUiStateModel(
    val state: State = State.Init
){
    sealed class State{
        data object Init: State()
    }
}