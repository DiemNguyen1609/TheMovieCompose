package com.themovie.app.movieapp;

/**
 * Models the navigation actions in the app.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/themovie/app/movieapp/TheMovieNavigationActions;", "", "navController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;)V", "navigateToAddEditTask", "", "title", "", "taskId", "", "navigateToStatistics", "navigateToTaskDetail", "navigateToTasks", "userMessage", "app_debug"})
public final class TheMovieNavigationActions {
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavHostController navController = null;
    
    public TheMovieNavigationActions(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
        super();
    }
    
    public final void navigateToTasks(int userMessage) {
    }
    
    public final void navigateToStatistics() {
    }
    
    public final void navigateToTaskDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
    }
    
    public final void navigateToAddEditTask(int title, @org.jetbrains.annotations.Nullable()
    java.lang.String taskId) {
    }
}