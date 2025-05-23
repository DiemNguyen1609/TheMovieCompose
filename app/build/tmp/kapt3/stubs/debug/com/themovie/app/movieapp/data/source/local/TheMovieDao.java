package com.themovie.app.movieapp.data.source.local;

/**
 * Data Access Object for the task table.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000fH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/themovie/app/movieapp/data/source/local/TheMovieDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "Lcom/themovie/app/movieapp/data/source/local/LocalMovie;", "getById", "observeAllPaging", "Landroidx/paging/PagingSource;", "observeById", "Lkotlinx/coroutines/flow/Flow;", "upsert", "task", "(Lcom/themovie/app/movieapp/data/source/local/LocalMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertAll", "tasks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface TheMovieDao {
    
    /**
     * Observes list of tasks.
     *
     * @return all tasks.
     */
    @androidx.room.Query(value = "SELECT * FROM theMovie")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.themovie.app.movieapp.data.source.local.LocalMovie> observeAllPaging();
    
    /**
     * Observes a single task.
     *
     * @param taskId the task id.
     * @return the task with taskId.
     */
    @androidx.room.Query(value = "SELECT * FROM theMovie WHERE id = :taskId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.themovie.app.movieapp.data.source.local.LocalMovie> observeById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId);
    
    /**
     * Select all tasks from the tasks table.
     *
     * @return all tasks.
     */
    @androidx.room.Query(value = "SELECT * FROM theMovie")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.themovie.app.movieapp.data.source.local.LocalMovie>> $completion);
    
    /**
     * Select a task by id.
     *
     * @param taskId the task id.
     * @return the task with taskId.
     */
    @androidx.room.Query(value = "SELECT * FROM theMovie WHERE id = :taskId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.themovie.app.movieapp.data.source.local.LocalMovie> $completion);
    
    /**
     * Insert or update a task in the database. If a task already exists, replace it.
     *
     * @param task the task to be inserted or updated.
     */
    @androidx.room.Upsert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.source.local.LocalMovie task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Insert or update tasks in the database. If a task already exists, replace it.
     *
     * @param tasks the tasks to be inserted or updated.
     */
    @androidx.room.Upsert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upsertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.local.LocalMovie> tasks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Delete a task by id.
     *
     * @return the number of tasks deleted. This should always be 1.
     */
    @androidx.room.Query(value = "DELETE FROM theMovie WHERE id = :taskId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    /**
     * Delete all tasks.
     */
    @androidx.room.Query(value = "DELETE FROM theMovie")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}