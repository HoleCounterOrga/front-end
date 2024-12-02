package com.hole.counter.viewmodels.login.models

import com.hole.counter.viewmodels.register.models.RegisterFormUiModel
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel.State
import org.koin.core.logger.MESSAGE

data class LoginUiStateModel(
    val state: State = State.Init()
) {
    sealed class State{
        data class Init(
            val loginFormUiModel: LoginFormUIModel = LoginFormUIModel(),
            val loginErrorUiModel: LoginErrorUiStateModel = LoginErrorUiStateModel(),
        ): State()

        data object Success: State()

        data object Failure: State()
    }
}

data class LoginErrorUiStateModel(
    val errorMESSAGE: String = "Nom d'utilisateur ou mot de passe incorrecte"
)