package com.hole.counter.presentation.ui.commons.components

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardRegisterComponent(
    // Utilisé pour renvoyer vers le login si register ou déjà inscrit
    onRegisterClicked: () -> Unit,
) {
    // States pour les champs de texte
    val password = remember { mutableStateOf("") }
    val confirmPassword = remember { mutableStateOf("") }
    val passwordsMatch = password.value == confirmPassword.value

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
                text = "Inscription",
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

            // Champ adresse email
            TextFieldComponent(
                value = "",
                placeholder = "Adresse Email",
                onValueChange = {}
            )

            // Champ mot de passe
            TextFieldComponent(
                value = password.value,
                placeholder = "Mot de passe",
                onValueChange = { password.value = it }
            )

            // Champ confirmation du mot de passe
            TextFieldComponent(
                value = confirmPassword.value,
                placeholder = "Confirmer le Mot de passe",
                onValueChange = { confirmPassword.value = it }
            )

            // Renvoie une erreur si le password est vide ou ne correspond pas
            if (!passwordsMatch && confirmPassword.value.isNotEmpty()) {
                Text(
                    text = "Les mots de passe ne correspondent pas",
                    color = Color.Red,
                    modifier = Modifier.padding(8.dp)
                )
            }

            // Bouton d'inscription (renvoie vers le formulaire de login)
            Button(
                onClick = {
                    if (passwordsMatch) {
                        onRegisterClicked()
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black, // Fond noir
                    contentColor = Color.White   // Texte blanc
                ),
                modifier = Modifier.fillMaxWidth().padding(16.dp) // Ajout de marges si nécessaire
            ) {
                Text(text = "Créer un compte")
            }

            // Bouton de login (renvoie vers le formulaire de login)
            Button(
                onClick = { onRegisterClicked() },
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
