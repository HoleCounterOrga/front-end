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
import com.hole.counter.presentation.ui.commons.components.CardRegisterComponent
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

            Text(
                text = "Hole Counter",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )

            CardRegisterComponent(
                onRegisterClicked = {
                    component.onRegister()
                }
            )
        }
    }
}