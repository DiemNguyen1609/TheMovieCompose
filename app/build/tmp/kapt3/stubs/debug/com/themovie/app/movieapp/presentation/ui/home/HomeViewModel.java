package com.themovie.app.movieapp.presentation.ui.home;

/**
 * ViewModel for the task list screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/themovie/app/movieapp/presentation/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/themovie/app/movieapp/data/TaskRepository;", "dataStoreRepository", "Lcom/themovie/app/movieapp/data/DataStoreRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/themovie/app/movieapp/data/TaskRepository;Lcom/themovie/app/movieapp/data/DataStoreRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_obsTheMovieData", "Landroidx/paging/PagingData;", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "obsTheMovieData", "Lkotlinx/coroutines/flow/StateFlow;", "getObsTheMovieData", "()Lkotlinx/coroutines/flow/StateFlow;", "getData", "", "saveMovieList", "movieList", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.data.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.data.DataStoreRepository dataStoreRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.themovie.app.movieapp.data.source.network.DTOMovie>> _obsTheMovieData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.themovie.app.movieapp.data.source.network.DTOMovie>> obsTheMovieData = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.DataStoreRepository dataStoreRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.themovie.app.movieapp.data.source.network.DTOMovie>> getObsTheMovieData() {
        return null;
    }
    
    private final void getData() {
    }
    
    public final void saveMovieList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> movieList) {
    }
}