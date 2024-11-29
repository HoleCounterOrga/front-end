package com.hole.counter.presentation.ui.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hole.counter.presentation.ui.register.components.CardRegisterComponent
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent
import com.hole.counter.viewmodels.register.RegisterViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun RegisterScreen(
    component: RegisterComponent,
    registerViewModel: RegisterViewModel = koinViewModel()
) {
    val navigateToLogin by registerViewModel.navigateToLogin.collectAsState()
    val viewState by registerViewModel.viewState.collectAsState()

    if (navigateToLogin) {
        component.onRegister() // Redirige vers l'écran de connexion
        registerViewModel.resetNavigationFlag() // Réinitialiser pour éviter une double navigation
    }

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hole Counter",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )

            CardRegisterComponent(
                onRegisterClicked = { component.onRegister() },
                onLoginClicked = { component.onLogin() },
                onRegister = { username, email, password, role ->
                    registerViewModel.register(username, email, password, role)
                }
            )

            if (viewState.errorMessage != null) {
                Text(
                    text = viewState.errorMessage!!,
                    color = androidx.compose.ui.graphics.Color.Red
                )
            }
        }
    }
}
