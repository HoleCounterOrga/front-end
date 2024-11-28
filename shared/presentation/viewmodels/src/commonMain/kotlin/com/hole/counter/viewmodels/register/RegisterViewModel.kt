package com.hole.counter.viewmodels.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.domain.authentication.register.RegisterUseCase
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel(
    private val registerUseCase: RegisterUseCase
): ViewModel(){

    private val _viewState = MutableStateFlow(RegisterUiStateModel())
    val viewState: StateFlow<RegisterUiStateModel> = _viewState.asStateFlow()

    init {
        viewModelScope.launch {
            registerUseCase()
        }
    }

    fun register(){
        viewModelScope.launch {
            registerUseCase()
        }
    }
}