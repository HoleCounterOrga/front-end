package com.hole.counter.presentation.ui.commons.components

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardComponent(
    onRegisterClicked: () -> Unit,
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally // Centre horizontalement
        ) {

            Text(
                text = "Welcome back",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            TextFieldComponent(value = "", placeholder = "", onValueChange = {})

            TextFieldComponent(value = "", placeholder = "", onValueChange = {})

            TextFieldComponent(value = "", placeholder = "", onValueChange = {})

            Button(
                onClick = { onRegisterClicked() },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black, // Fond noir
                    contentColor = Color.White   // Texte blanc
                ),
                modifier = Modifier.fillMaxWidth().padding(16.dp) // Ajout de marges si nécessaire
            ) {
                Text(text = "Créer un compte")
            }
        }

    }
}