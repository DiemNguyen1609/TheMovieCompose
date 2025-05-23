package com.themovie.app.movieapp;

/**
 * Destinations used in the [HomeActivity]
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/themovie/app/movieapp/TheMovieDestinations;", "", "()V", "ADD_EDIT_TASK_ROUTE", "", "STATISTICS_ROUTE", "TASKS_ROUTE", "TASK_DETAIL_ROUTE", "app_debug"})
public final class TheMovieDestinations {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASKS_ROUTE = "tasks?userMessage={userMessage}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATISTICS_ROUTE = "statistics";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASK_DETAIL_ROUTE = "task/{taskId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_EDIT_TASK_ROUTE = "addEditTask/{title}?taskId={taskId}";
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.TheMovieDestinations INSTANCE = null;
    
    private TheMovieDestinations() {
        super();
    }
}