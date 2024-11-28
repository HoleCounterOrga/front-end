package com.hole.counter.viewmodels.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hole.counter.viewmodels.home.models.HomeUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(): ViewModel(){

    private val _viewState = MutableStateFlow(HomeUiStateModel())
    val viewState: StateFlow<HomeUiStateModel> = _viewState.asStateFlow()

    init {}
}