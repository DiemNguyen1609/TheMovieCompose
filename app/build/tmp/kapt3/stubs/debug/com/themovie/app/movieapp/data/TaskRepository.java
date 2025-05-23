package com.themovie.app.movieapp.data;

/**
 * Interface to the data layer.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u000fH&J\u000e\u0010\u0012\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/themovie/app/movieapp/data/TaskRepository;", "", "deleteAllTasks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTask", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "forceUpdate", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskStream", "Lkotlinx/coroutines/flow/Flow;", "getTasksStreamPaging", "Landroidx/paging/PagingData;", "refresh", "refreshTask", "updateTask", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TaskRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.themovie.app.movieapp.data.source.network.DTOMovie>> getTasksStreamPaging();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refresh(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.themovie.app.movieapp.data.source.network.DTOMovie> getTaskStream(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean forceUpdate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.themovie.app.movieapp.data.source.network.DTOMovie> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Interface to the data layer.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}