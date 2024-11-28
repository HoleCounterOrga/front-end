import SwiftUI
import shared

fun MainViewController() = ComposeUIViewController {
    val rootComponent = remember {
        DefaultRootComponent(DefaultComponentContext(ApplicationLifecycle()))
    }
    App(rootComponent = rootComponent)
}