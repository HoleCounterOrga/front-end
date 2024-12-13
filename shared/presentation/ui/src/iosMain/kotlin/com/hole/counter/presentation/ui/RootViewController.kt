package com.hole.counter.presentation.ui

import androidx.compose.ui.window.ComposeUIViewController
import com.hole.counter.presentation.ui.root.navigation.RootComponent

fun rootViewController(root: RootComponent) = ComposeUIViewController { App(rootComponent = root) }