package com.hole.counter.viewmodels.register.mappers

import com.hole.counter.viewmodels.register.models.RegisterFormUiModel
import com.hole.counter.viewmodels.register.models.RegisterTextFields

class RegisterFormMappers{

    fun mapTo(registerFormUiModel: RegisterFormUiModel, value: String, registerTextFields: RegisterTextFields): RegisterFormUiModel =
        when(registerTextFields){
            RegisterTextFields.Username -> registerFormUiModel.copy(username = value)
            RegisterTextFields.Email -> registerFormUiModel.copy(email = value)
            RegisterTextFields.Password -> registerFormUiModel.copy(password = value)
            RegisterTextFields.PasswordConfirmation -> registerFormUiModel.copy(passwordConfirmation = value)
        }
}