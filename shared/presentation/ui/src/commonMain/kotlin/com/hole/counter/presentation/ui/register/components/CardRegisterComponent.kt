package com.hole.counter.presentation.ui.register.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hole.counter.presentation.ui.commons.components.TextFieldComponent
import com.hole.counter.viewmodels.register.models.RegisterFormUiModel
import com.hole.counter.viewmodels.register.models.RegisterTextFields
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel

@Composable
fun CardRegisterComponent(
    state: RegisterUiStateModel.State.Init,
    onRegisterClicked: () -> Unit,
    onLoginClicked: () -> Unit,
    onValueChange: (String, RegisterTextFields) -> Unit,
) {
    Column {
        // Champs de texte et logique d'affichage
        TextFieldComponent(
            value = state.registerFormUiModel.username,
            placeholder = "Nom d'utilisateur",
            onValueChange = { onValueChange(it,RegisterTextFields.Username ) }
        )
        TextFieldComponent(
            value = state.registerFormUiModel.email,
            placeholder = "Adresse Email",
            onValueChange = { onValueChange(it,RegisterTextFields.Email ) }
        )
        TextFieldComponent(
            isPassword = true,
            value = state.registerFormUiModel.password,
            placeholder = "Mot de passe",
            onValueChange = { onValueChange(it,RegisterTextFields.Password ) }
        )
        TextFieldComponent(
            isPassword = true,
            value = state.registerFormUiModel.passwordConfirmation,
            placeholder = "Confirmer le Mot de passe",
            onValueChange = { onValueChange(it,RegisterTextFields.PasswordConfirmation ) }
        )

        // Bouton pour créer l'utilisateur
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            onClick = {
                onRegisterClicked()
            },
            enabled = true,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            ),


        ) {
            Text(text = "Créer un compte")
        }

        Button(
            onClick = {
                onLoginClicked()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black, // Fond noir
                contentColor = Color.White   // Texte blanc
            ),
            modifier = Modifier.fillMaxWidth().padding(16.dp) // Ajout de marges si nécessaire
        ) {
            Text(text = "Se connecter")
        }
    }
}
