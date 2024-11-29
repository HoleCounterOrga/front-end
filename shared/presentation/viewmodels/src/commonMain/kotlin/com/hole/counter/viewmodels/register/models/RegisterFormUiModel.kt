package com.hole.counter.viewmodels.register.models

data class RegisterFormUiModel(
    val email: String = "",
    val username: String = "",
    val password: String = "",
    val passwordConfirmation: String= "",
)

enum class RegisterTextFields{
    Email, Username, Password, PasswordConfirmation
}