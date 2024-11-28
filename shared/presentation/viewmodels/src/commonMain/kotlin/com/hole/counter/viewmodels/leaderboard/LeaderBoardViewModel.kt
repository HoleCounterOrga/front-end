package com.hole.counter.viewmodels.leaderboard

import androidx.lifecycle.ViewModel
import com.hole.counter.viewmodels.home.models.HomeUiStateModel
import com.hole.counter.viewmodels.leaderboard.models.LeaderBoardUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LeaderBoardViewModel(): ViewModel(){

    private val _viewState = MutableStateFlow(LeaderBoardUiStateModel())
    val viewState: StateFlow<LeaderBoardUiStateModel> = _viewState.asStateFlow()

    init {}
}