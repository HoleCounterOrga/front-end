package com.hole.counter.viewmodels.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.data.authentication.repository.AuthenticationRepositoryImpl
import com.hole.counter.domain.authentication.register.RegisterUseCase
import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel(
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    private val _viewState = MutableStateFlow(RegisterUiStateModel())
    val viewState: StateFlow<RegisterUiStateModel> = _viewState.asStateFlow()

    private val _navigateToLogin = MutableStateFlow(false) // Nouvel état pour la navigation
    val navigateToLogin: StateFlow<Boolean> = _navigateToLogin.asStateFlow()

    fun register(username: String, email: String, password: String, role: String) {
        viewModelScope.launch {
            val result = registerUseCase(username, email, password, role)
            _viewState.value = when (result) {
                is RegisterUseCaseModel.Success -> {
                    _navigateToLogin.value = true // Indiquer que la navigation est nécessaire
                    RegisterUiStateModel(success = true)
                }
                is RegisterUseCaseModel.Failure -> RegisterUiStateModel(success = false, errorMessage = "Registration failed")
            }
        }
    }

    fun resetNavigationFlag() {
        _navigateToLogin.value = false // Réinitialiser l'état de navigation
    }
}