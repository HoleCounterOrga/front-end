package com.hole.counter.viewmodels.login

import androidx.lifecycle.ViewModel
import com.hole.counter.domain.authentication.login.LoginUseCase
import com.hole.counter.viewmodels.leaderboard.models.LeaderBoardUiStateModel
import com.hole.counter.viewmodels.login.models.LoginUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel(
    private val loginUseCase: LoginUseCase,
): ViewModel(){

    private val _viewState = MutableStateFlow(LoginUiStateModel())
    val viewState: StateFlow<LoginUiStateModel> = _viewState.asStateFlow()

    init {}
}