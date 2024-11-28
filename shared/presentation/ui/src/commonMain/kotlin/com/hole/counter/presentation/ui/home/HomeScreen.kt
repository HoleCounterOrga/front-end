package com.hole.counter.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.home.components.HomeFavoriteItems
import com.hole.counter.presentation.ui.home.navigator.HomeComponent
import com.hole.counter.viewmodels.home.HomeViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(
    component: HomeComponent,
    homeViewModel: HomeViewModel = koinViewModel()
){
    Scaffold {
        Column {

            Text("Test")

            HomeFavoriteItems()

            Text("Bouton")


            Button(
                onClick = { component.onAddTarget()}
            ) {
                Text("On Add target")
            }
        }
    }
}