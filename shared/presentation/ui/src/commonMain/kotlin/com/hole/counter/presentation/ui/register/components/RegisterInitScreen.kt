package com.hole.counter.presentation.ui.register.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hole.counter.viewmodels.register.models.RegisterTextFields
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel

@Composable
fun RegisterInitScreen(
    state: RegisterUiStateModel.State.Init,
    onValueChange: (String, RegisterTextFields) -> Unit,
    onRegister: () -> Unit,
    onLogin: () -> Unit,
){
    Text(
        text = "Hole Counter",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive
    )

    CardRegisterComponent(
        registerFormUiModel = state.registerFormUiModel,
        onLoginClicked = onLogin,
        onRegisterClicked = onRegister,
        onValueChange = onValueChange
    )

    if (state.registerErrorUiModel.errorMessage != null) {
        Text(
            text = state.registerErrorUiModel.errorMessage!!,
            color = androidx.compose.ui.graphics.Color.Red
        )
    }
}