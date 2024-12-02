package com.hole.counter.presentation.ui.login.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hole.counter.viewmodels.login.mappers.LoginTextField
import com.hole.counter.viewmodels.login.models.LoginUiStateModel

@Composable
fun LoginInitScreen(
    state: LoginUiStateModel.State.Init,
    onValueChange: (String, LoginTextField) -> Unit,
    onLogin: () -> Unit,
){
    Text(
        text = "Hole Counter",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive
    )

    CardLoginComponent(
        state = state,
        onLoginClicked = onLogin,
        onValueChange = onValueChange,
    )
}