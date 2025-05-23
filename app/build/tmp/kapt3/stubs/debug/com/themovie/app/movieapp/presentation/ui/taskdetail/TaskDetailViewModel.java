package com.themovie.app.movieapp.presentation.ui.taskdetail;

/**
 * ViewModel for the Details screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010H\u0002J\u0006\u0010\"\u001a\u00020\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006#"}, d2 = {"Lcom/themovie/app/movieapp/presentation/ui/taskdetail/TaskDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/themovie/app/movieapp/data/TaskRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/themovie/app/movieapp/data/TaskRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isTaskDeleted", "_taskAsync", "Lkotlinx/coroutines/flow/Flow;", "Lcom/themovie/app/movieapp/util/Async;", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "_userMessage", "", "taskId", "", "getTaskId", "()Ljava/lang/String;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/themovie/app/movieapp/presentation/ui/taskdetail/TaskDetailUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteTask", "Lkotlinx/coroutines/Job;", "handleTask", "task", "refresh", "", "showSnackbarMessage", "message", "snackbarMessageShown", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TaskDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.data.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String taskId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _userMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isTaskDeleted = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.themovie.app.movieapp.util.Async<com.themovie.app.movieapp.data.source.network.DTOMovie>> _taskAsync = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailUiState> uiState = null;
    
    @javax.inject.Inject()
    public TaskDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteTask() {
        return null;
    }
    
    public final void refresh() {
    }
    
    public final void snackbarMessageShown() {
    }
    
    private final void showSnackbarMessage(int message) {
    }
    
    private final com.themovie.app.movieapp.util.Async<com.themovie.app.movieapp.data.source.network.DTOMovie> handleTask(com.themovie.app.movieapp.data.source.network.DTOMovie task) {
        return null;
    }
}