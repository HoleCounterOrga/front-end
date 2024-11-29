package com.hole.counter.viewmodels.register.models

data class RegisterUiStateModel(
    val state: State = State.Init()
) {
    sealed class State{
        data class Init(
            val registerFormUiModel: RegisterFormUiModel = RegisterFormUiModel(),
            val registerErrorUiModel: RegisterErrorUiStateModel = RegisterErrorUiStateModel()
        ): State()

        data object Success: State()

        data object Failure: State()
    }
}

data class RegisterErrorUiStateModel(
    val success: Boolean = false,
    val errorMessage: String? = null
)