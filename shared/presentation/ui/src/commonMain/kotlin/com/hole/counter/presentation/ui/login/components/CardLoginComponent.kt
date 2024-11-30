package com.hole.counter.presentation.ui.login.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
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
import com.hole.counter.viewmodels.login.mappers.LoginTextField
import com.hole.counter.viewmodels.login.models.LoginUiStateModel

@Composable
fun CardLoginComponent(
    onLoginClicked: () -> Unit,
    onValueChange: (String, LoginTextField) -> Unit,
    state: LoginUiStateModel.State.Init
    //onCheckedChange: (Boolean) -> Unit
) {

    var checked by remember { mutableStateOf(true) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(800.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center, // Centre verticalement
            horizontalAlignment = Alignment.CenterHorizontally, // Centre horizontalement
        ) {
            Text(
                text = "Connexion",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Champ nom d'utilisateur
            TextFieldComponent(
                value = state.loginFormUiModel.username,
                placeholder = "Nom d'utilisateur",
                onValueChange = { onValueChange(it, LoginTextField.Username) }
            )

            TextFieldComponent(
                isPassword = true,
                value = state.loginFormUiModel.password,
                placeholder = "Mot de passe",
                onValueChange = { onValueChange(it, LoginTextField.Password) }
            )

            /*
            Row(
                verticalAlignment = Alignment.CenterVertically, // Aligne les éléments verticalement
                modifier = Modifier.fillMaxWidth() // Prend toute la largeur disponible
            ) {
                Text(
                    text = "Se souvenir de moi"
                )
                Checkbox(
                    checked = checked,
                    onCheckedChange = onCheckedChange
                )
            }
            */

            // Bouton de login (connecte l'utilisateur, renvoie vers la page d'accueil)
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
}
