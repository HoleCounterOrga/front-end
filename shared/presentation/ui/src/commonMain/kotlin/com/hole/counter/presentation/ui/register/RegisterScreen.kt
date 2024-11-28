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
import com.hole.counter.presentation.ui.commons.components.CardComponent
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent
import com.hole.counter.viewmodels.register.RegisterViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun RegisterScreen(
    component: RegisterComponent,
    registerViewModel: RegisterViewModel = koinViewModel()
){
    val viewModel by registerViewModel.viewState.collectAsState()

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize(), // Occupe tout l'espace disponible
            verticalArrangement = Arrangement.Center, // Centre verticalement
            horizontalAlignment = Alignment.CenterHorizontally // Centre horizontalement
        )  {

            CardComponent(
                onRegisterClicked = {
                    component.onRegister()
                }
            )
        }
    }
}