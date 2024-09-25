package com.themovie.app.movieapp.presentation.ui.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.themovie.app.movieapp.data.TaskRepository
import com.themovie.app.movieapp.data.source.network.DTOMovie
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the task list screen.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val taskRepository: TaskRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _isLoading = MutableStateFlow(false)

    private val _obsTheMovieData = MutableStateFlow<PagingData<DTOMovie>>(PagingData.empty())
    val obsTheMovieData: StateFlow<PagingData<DTOMovie>> = _obsTheMovieData.cachedIn(viewModelScope)
        .stateIn(viewModelScope, SharingStarted.Eagerly, PagingData.empty())

    init {
        viewModelScope.launch {
            taskRepository.refresh().let {
                if (it){
                    getData()
                }
            }
        }
    }

    private fun getData(){
        viewModelScope.launch {
            taskRepository.getTasksStreamPaging().collectLatest {
                _obsTheMovieData.value = it
            }
        }
    }
}