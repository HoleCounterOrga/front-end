package com.hole.counter.presentation.ui.register

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent
import com.hole.counter.viewmodels.register.RegisterViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun RegisterScreen(
    component: RegisterComponent,
    registerViewModel: RegisterViewModel = koinViewModel()
){
    Scaffold {
        Column {
            Text("Register Screen")
        }
    }
}