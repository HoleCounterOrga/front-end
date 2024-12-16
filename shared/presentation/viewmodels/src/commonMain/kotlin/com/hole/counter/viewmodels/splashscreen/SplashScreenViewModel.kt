package com.hole.counter.viewmodels.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.domain.user.getusertoken.GetUserTokenUseCase
import com.hole.counter.domain.user.getusertoken.models.GetUserTokenUseCaseModel
import kotlinx.coroutines.launch

class SplashScreenViewModel(
    private val getUserTokenUseCase: GetUserTokenUseCase
): ViewModel(){

    init {
        getUserToken()
    }

    private fun getUserToken(){
        viewModelScope.launch {
            when(getUserTokenUseCase()){
                is GetUserTokenUseCaseModel.Success -> {}
                is GetUserTokenUseCaseModel.Failure -> {}
            }
        }
    }
}