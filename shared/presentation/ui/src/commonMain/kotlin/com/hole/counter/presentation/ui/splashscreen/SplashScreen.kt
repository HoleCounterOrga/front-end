package com.hole.counter.presentation.ui.splashscreen

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
import com.hole.counter.presentation.ui.splashscreen.navigator.SplashScreenComponent
import com.hole.counter.viewmodels.splashscreen.SplashScreenViewModel
import com.hole.counter.viewmodels.splashscreen.models.SplashScreenUiModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SplashScreen(
    component: SplashScreenComponent,
    splashScreenViewModel: SplashScreenViewModel = koinViewModel()
){

    val viewState by splashScreenViewModel.viewState.collectAsState()

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            when(val state = viewState.state){
                is SplashScreenUiModel.State.Init -> Text("Replace with loader")
                is SplashScreenUiModel.State.Success -> Text("Failure")
                is SplashScreenUiModel.State.Failure -> Text("Success")
            }
        }
    }
}