package com.hole.counter.viewmodels.leaderboard.models

data class LeaderBoardUiStateModel(
    val state: State = State.Init
){
    sealed class State{
        data object Init: State()
    }
}