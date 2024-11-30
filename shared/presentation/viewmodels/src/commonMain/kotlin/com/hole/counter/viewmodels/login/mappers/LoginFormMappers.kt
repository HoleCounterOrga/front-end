package com.hole.counter.viewmodels.login.mappers

import com.hole.counter.viewmodels.login.models.LoginFormUIModel
import com.hole.counter.viewmodels.register.models.RegisterTextFields

class LoginFormMappers {

    fun mapTo(loginFormUIModel: LoginFormUIModel, value: String, loginTextFields: LoginTextField): LoginFormUIModel =
        when(loginTextFields) {
            LoginTextField.Username -> loginFormUIModel.copy(username = value)
            LoginTextField.Password -> loginFormUIModel.copy(password = value)
        }
}
enum class LoginTextField{
    Username,
    Password
}