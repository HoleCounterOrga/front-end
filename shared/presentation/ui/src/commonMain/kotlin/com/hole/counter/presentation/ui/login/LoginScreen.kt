package com.hole.counter.presentation.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.hole.counter.presentation.ui.commons.components.CardComponent
import com.hole.counter.presentation.ui.login.navigator.LoginComponent
import com.hole.counter.viewmodels.login.LoginViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginScreen(
    component: LoginComponent,
    loginViewModel: LoginViewModel = koinViewModel()
){
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize(), // Occupe tout l'espace disponible
            verticalArrangement = Arrangement.Center, // Centre verticalement
            horizontalAlignment = Alignment.CenterHorizontally // Centre horizontalement
        )  {

            CardComponent(
                onRegisterClicked = {
                    component.onLogin()
                }
            )
        }
    }
}