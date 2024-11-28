package com.hole.counter.presentation.ui.root.navigation

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.hole.counter.presentation.ui.addtarget.navigator.AddTargetComponent
import com.hole.counter.presentation.ui.home.navigator.HomeComponent
import com.hole.counter.presentation.ui.leaderboard.navigator.LeaderComponent
import com.hole.counter.presentation.ui.login.navigator.LoginComponent
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    fun onBackClicked(toIndex: Int)

    sealed class Child {
        class Home(val component: HomeComponent): Child()
        class Register(val component: RegisterComponent) : Child()
        class Login(val component: LoginComponent) : Child()
        class AddTarget(val component: AddTargetComponent) : Child()
        class LeaderBoard(val component: LeaderComponent) : Child()
    }
}