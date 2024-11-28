package com.hole.counter.presentation.ui.root

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import com.hole.counter.presentation.ui.addtarget.AddTargetScreen
import com.hole.counter.presentation.ui.home.HomeScreen
import com.hole.counter.presentation.ui.leaderboard.LeaderBoardScreen
import com.hole.counter.presentation.ui.login.LoginScreen
import com.hole.counter.presentation.ui.register.RegisterScreen
import com.hole.counter.presentation.ui.root.navigation.RootComponent
import com.hole.counter.presentation.ui.root.navigation.RootComponent.Child

@Composable
fun RootContent(
    component: RootComponent,
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier
        .fillMaxSize()
        .windowInsetsPadding(WindowInsets.systemBars)) {
        Children(
            stack = component.stack,
            modifier = Modifier.fillMaxSize(),
            animation = stackAnimation(fade() + scale())
        ) {
            when (val instance = it.instance) {
                is Child.Home -> HomeScreen(component = instance.component)
                is Child.Login -> LoginScreen(component = instance.component)
                is Child.Register -> RegisterScreen(component = instance.component)
                is Child.AddTarget -> AddTargetScreen(component = instance.component)
                is Child.LeaderBoard -> LeaderBoardScreen(component = instance.component)
            }
        }
    }
}