package com.hole.counter.viewmodels.splashscreen.mappers

import com.hole.counter.viewmodels.splashscreen.models.SplashScreenUiModel

class SplashScreenUiMappers{

    fun mapToSuccess(): SplashScreenUiModel.State.Success =
        SplashScreenUiModel.State.Success

    fun mapToError():  SplashScreenUiModel.State.Failure =
        SplashScreenUiModel.State.Failure
}