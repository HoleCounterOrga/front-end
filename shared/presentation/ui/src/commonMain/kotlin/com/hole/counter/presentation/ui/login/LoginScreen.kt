package com.hole.counter.presentation.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.login.navigator.LoginComponent
import com.hole.counter.viewmodels.login.LoginViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginScreen(
    component: LoginComponent,
    loginViewModel: LoginViewModel = koinViewModel()
){
    Scaffold {
        Column {
            Text("Login Screen")
        }
    }
}