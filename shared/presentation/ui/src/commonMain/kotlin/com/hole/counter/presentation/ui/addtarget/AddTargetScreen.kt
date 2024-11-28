package com.hole.counter.presentation.ui.addtarget

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.addtarget.navigator.AddTargetComponent

@Composable
fun AddTargetScreen(
    component: AddTargetComponent
){
    Scaffold {
        Column {
            Text("Add target")
        }
    }
}