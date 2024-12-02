package com.hole.counter.presentation.ui.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.hole.counter.presentation.ui.register.components.RegisterInitScreen
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent
import com.hole.counter.viewmodels.register.RegisterViewModel
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun RegisterScreen(
    component: RegisterComponent,
    registerViewModel: RegisterViewModel = koinViewModel()
) {
    val viewState by registerViewModel.viewState.collectAsState()

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            when(val state = viewState.state){
                is RegisterUiStateModel.State.Success -> component.onLogin()
                is RegisterUiStateModel.State.Failure -> {}
                is RegisterUiStateModel.State.Init -> {
                    RegisterInitScreen(
                        state = state,
                        onValueChange = registerViewModel::onValueChange,
                        onRegister = registerViewModel::register,
                        onLogin = { component.onLogin() },
                    )
                }
            }
        }
    }
}
