package com.hole.counter.viewmodels.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.domain.authentication.login.LoginUseCase
import com.hole.counter.domain.authentication.login.models.LoginUseCaseModel
import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel
import com.hole.counter.viewmodels.leaderboard.models.LeaderBoardUiStateModel
import com.hole.counter.viewmodels.login.mappers.LoginFormMappers
import com.hole.counter.viewmodels.login.mappers.LoginTextField
import com.hole.counter.viewmodels.login.models.LoginUiStateModel
import com.hole.counter.viewmodels.register.mappers.RegisterFormMappers
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUseCase: LoginUseCase,
    private val loginFormMappers: LoginFormMappers,
): ViewModel(){

    private val _viewState = MutableStateFlow(LoginUiStateModel())
    val viewState: StateFlow<LoginUiStateModel> = _viewState.asStateFlow()

    fun onValueChange(value: String, field: LoginTextField){
        val currentState = viewState.value.state as? LoginUiStateModel.State.Init ?: return

        _viewState.update {
            it.copy(
                state = currentState.copy(
                    loginFormUiModel = loginFormMappers.mapTo(currentState.loginFormUiModel, value, field),
                )
            )
        }
    }

    fun login() {
        val currentState = viewState.value.state as? LoginUiStateModel.State.Init ?: return
        val formData = currentState.loginFormUiModel

        viewModelScope.launch {
            val updatedState = when(loginUseCase(formData.username, formData.password)){
                is LoginUseCaseModel.Success -> {
                    LoginUiStateModel.State.Success
                }
                is LoginUseCaseModel.Failure -> LoginUiStateModel.State.Failure
            }

            _viewState.update {
                it.copy(
                    state = updatedState
                )
            }
        }
    }
}