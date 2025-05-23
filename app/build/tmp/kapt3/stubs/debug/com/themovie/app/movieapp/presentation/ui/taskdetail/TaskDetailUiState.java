package com.themovie.app.movieapp.presentation.ui.taskdetail;

/**
 * UiState for the Details screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/themovie/app/movieapp/presentation/ui/taskdetail/TaskDetailUiState;", "", "task", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "isLoading", "", "userMessage", "", "isTaskDeleted", "(Lcom/themovie/app/movieapp/data/source/network/DTOMovie;ZLjava/lang/Integer;Z)V", "()Z", "getTask", "()Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "getUserMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/themovie/app/movieapp/data/source/network/DTOMovie;ZLjava/lang/Integer;Z)Lcom/themovie/app/movieapp/presentation/ui/taskdetail/TaskDetailUiState;", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class TaskDetailUiState {
    @org.jetbrains.annotations.Nullable()
    private final com.themovie.app.movieapp.data.source.network.DTOMovie task = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer userMessage = null;
    private final boolean isTaskDeleted = false;
    
    public TaskDetailUiState(@org.jetbrains.annotations.Nullable()
    com.themovie.app.movieapp.data.source.network.DTOMovie task, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userMessage, boolean isTaskDeleted) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.themovie.app.movieapp.data.source.network.DTOMovie getTask() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserMessage() {
        return null;
    }
    
    public final boolean isTaskDeleted() {
        return false;
    }
    
    public TaskDetailUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.themovie.app.movieapp.data.source.network.DTOMovie component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailUiState copy(@org.jetbrains.annotations.Nullable()
    com.themovie.app.movieapp.data.source.network.DTOMovie task, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userMessage, boolean isTaskDeleted) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}