package com.themovie.app.movieapp.presentation.ui.tasks;

/**
 * ViewModel for the task list screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0015J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0015H\u0002J\u0006\u0010%\u001a\u00020\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/themovie/app/movieapp/presentation/ui/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/themovie/app/movieapp/data/TaskRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/themovie/app/movieapp/data/TaskRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_filterUiInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/themovie/app/movieapp/presentation/ui/tasks/FilteringUiInfo;", "_filteredTasksAsync", "Lcom/themovie/app/movieapp/util/Async;", "", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_savedFilterType", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/themovie/app/movieapp/presentation/ui/tasks/TasksFilterType;", "_userMessage", "", "uiState", "Lcom/themovie/app/movieapp/presentation/ui/tasks/TasksUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "filterTasks", "filteringType", "getFilterUiInfo", "requestType", "refresh", "", "setFiltering", "showEditResultMessage", "result", "showSnackbarMessage", "message", "snackbarMessageShown", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.data.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.themovie.app.movieapp.presentation.ui.tasks.TasksFilterType> _savedFilterType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo> _filterUiInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _userMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.themovie.app.movieapp.util.Async<java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie>>> _filteredTasksAsync = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.themovie.app.movieapp.presentation.ui.tasks.TasksUiState> uiState = null;
    
    @javax.inject.Inject()
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.themovie.app.movieapp.presentation.ui.tasks.TasksUiState> getUiState() {
        return null;
    }
    
    public final void setFiltering(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.presentation.ui.tasks.TasksFilterType requestType) {
    }
    
    public final void showEditResultMessage(int result) {
    }
    
    public final void snackbarMessageShown() {
    }
    
    private final void showSnackbarMessage(int message) {
    }
    
    public final void refresh() {
    }
    
    private final java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> filterTasks(com.themovie.app.movieapp.presentation.ui.tasks.TasksFilterType filteringType) {
        return null;
    }
    
    private final com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo getFilterUiInfo(com.themovie.app.movieapp.presentation.ui.tasks.TasksFilterType requestType) {
        return null;
    }
}