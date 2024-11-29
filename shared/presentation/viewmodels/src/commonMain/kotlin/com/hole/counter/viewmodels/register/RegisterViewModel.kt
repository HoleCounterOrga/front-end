package com.hole.counter.viewmodels.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.domain.authentication.register.RegisterUseCase
import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel
import com.hole.counter.viewmodels.register.mappers.RegisterFormMappers
import com.hole.counter.viewmodels.register.models.RegisterTextFields
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class RegisterViewModel(
    private val registerUseCase: RegisterUseCase,
    private val registerFormMappers: RegisterFormMappers,
) : ViewModel() {

    private val _viewState = MutableStateFlow(RegisterUiStateModel())
    val viewState: StateFlow<RegisterUiStateModel> = _viewState.asStateFlow()

    fun onValueChange(value: String, field: RegisterTextFields){
        val currentState = viewState.value.state as? RegisterUiStateModel.State.Init ?: return
        _viewState.update {
            it.copy(
                state = currentState.copy(
                    registerFormUiModel = registerFormMappers.mapTo(currentState.registerFormUiModel, value, field)
                )
            )
        }
    }

    fun register() {
        val currentState = viewState.value.state as? RegisterUiStateModel.State.Init ?: return
        val formData = currentState.registerFormUiModel
        viewModelScope.launch {
            val updatedState = when(registerUseCase(formData.username, formData.email, formData.password, formData.passwordConfirmation)){
                is RegisterUseCaseModel.Success -> {
                    RegisterUiStateModel.State.Success
                }
                is RegisterUseCaseModel.Failure -> RegisterUiStateModel.State.Failure
            }

            _viewState.update {
                it.copy(
                    state = updatedState
                )
            }
        }
    }
}