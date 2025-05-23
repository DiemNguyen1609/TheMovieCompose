package com.themovie.app.movieapp.data;

/**
 * Default implementation of [TaskRepository]. Single entry point for managing tasks' data.
 *
 * @param networkDataSource - The network data source
 * @param localDataSource - The local data source
 * @param dispatcher - The dispatcher to be used for long running or complex operations, such as ID
 * generation or mapping many models.
 * @param scope - The coroutine scope used for deferred jobs where the result isn't important, such
 * as sending data to the network.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a0\u0018H\u0016J\u000e\u0010\u001b\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0011J&\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/themovie/app/movieapp/data/DefaultTaskRepository;", "Lcom/themovie/app/movieapp/data/TaskRepository;", "networkDataSource", "Lcom/themovie/app/movieapp/data/source/network/NetworkDataSource;", "localDataSource", "Lcom/themovie/app/movieapp/data/source/local/TheMovieDao;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/themovie/app/movieapp/data/source/network/NetworkDataSource;Lcom/themovie/app/movieapp/data/source/local/TheMovieDao;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;)V", "deleteAllTasks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTask", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "forceUpdate", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskStream", "Lkotlinx/coroutines/flow/Flow;", "getTasksStreamPaging", "Landroidx/paging/PagingData;", "refresh", "refreshTask", "updateTask", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DefaultTaskRepository implements com.themovie.app.movieapp.data.TaskRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.data.source.network.NetworkDataSource networkDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.data.source.local.TheMovieDao localDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @javax.inject.Inject()
    public DefaultTaskRepository(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.source.network.NetworkDataSource networkDataSource, @org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.source.local.TheMovieDao localDataSource, @com.themovie.app.movieapp.di.DefaultDispatcher()
    @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @com.themovie.app.movieapp.di.ApplicationScope()
    @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.themovie.app.movieapp.data.source.network.DTOMovie>> getTasksStreamPaging() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object refreshTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.themovie.app.movieapp.data.source.network.DTOMovie> getTaskStream(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
        return null;
    }
    
    /**
     * Get a Task with the given ID. Will return null if the task cannot be found.
     *
     * @param taskId - The ID of the task
     * @param forceUpdate - true if the task should be updated from the network data source first.
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean forceUpdate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.themovie.app.movieapp.data.source.network.DTOMovie> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Delete everything in the local data source and replace it with everything from the network
     * data source.
     *
     * `withContext` is used here in case the bulk `toLocal` mapping operation is complex.
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object refresh(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}