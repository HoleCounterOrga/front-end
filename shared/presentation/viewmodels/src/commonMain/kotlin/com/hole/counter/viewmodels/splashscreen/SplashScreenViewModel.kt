package com.hole.counter.viewmodels.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.domain.user.getusertoken.GetUserTokenUseCase
import com.hole.counter.domain.user.getusertoken.models.GetUserTokenUseCaseModel
import com.hole.counter.domain.user.setusertoken.SetUserTokenUseCase
import com.hole.counter.viewmodels.splashscreen.mappers.SplashScreenUiMappers
import com.hole.counter.viewmodels.splashscreen.models.SplashScreenUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SplashScreenViewModel(
    private val getUserTokenUseCase: GetUserTokenUseCase,
    private val setUserTokenUseCase: SetUserTokenUseCase,
    private val splashScreenUiMappers: SplashScreenUiMappers,
): ViewModel(){

    private val _viewState = MutableStateFlow(SplashScreenUiModel())
    val viewState: StateFlow<SplashScreenUiModel> = _viewState.asStateFlow()

    init {
        //testSet()
        getUserToken()
    }

    /*
    private fun testSet(){
        viewModelScope.launch {
            setUserTokenUseCase()
        }
    }*/

    private fun getUserToken(){
        viewModelScope.launch {
            val state = when(getUserTokenUseCase()){
                is GetUserTokenUseCaseModel.Success -> splashScreenUiMappers.mapToSuccess()
                is GetUserTokenUseCaseModel.Failure -> splashScreenUiMappers.mapToError()
            }

            _viewState.update {
                it.copy(
                    state = state
                )
            }
        }
    }
}