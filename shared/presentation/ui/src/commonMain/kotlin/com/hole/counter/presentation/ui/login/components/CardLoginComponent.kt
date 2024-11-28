package com.hole.counter.presentation.ui.login.components

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

@Composable
fun CardLoginComponent(
    onLoginClicked: () -> Unit,
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
                value = "",
                placeholder = "Nom d'utilisateur",
                onValueChange = {}
            )

            // Champ mot de passe
            TextFieldComponent(
                value = "",
                placeholder = "Mot de passe",
                onValueChange = {}
            )

            Text(
                "Minimal checkbox"
            )
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it }
            )

            Text(
                if (checked) "Checkbox is checked" else "Checkbox is unchecked"
            )

            // Bouton de connexion (renvoie vers le formulaire de login)
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
