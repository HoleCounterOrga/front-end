package com.hole.counter.presentation.ui.splashscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.splashscreen.navigator.SplashScreenComponent
import com.hole.counter.viewmodels.splashscreen.SplashScreenViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SplashScreen(
    component: SplashScreenComponent,
    splashScreenViewModel: SplashScreenViewModel = koinViewModel()
){

    Scaffold {
        Column {
            Text("Replace with loader")
        }
    }
}