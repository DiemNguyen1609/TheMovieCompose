package com.themovie.app.movieapp.presentation.ui.tasks;

/**
 * UiState for the task list screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/themovie/app/movieapp/presentation/ui/tasks/TasksUiState;", "", "items", "", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "isLoading", "", "filteringUiInfo", "Lcom/themovie/app/movieapp/presentation/ui/tasks/FilteringUiInfo;", "userMessage", "", "(Ljava/util/List;ZLcom/themovie/app/movieapp/presentation/ui/tasks/FilteringUiInfo;Ljava/lang/Integer;)V", "getFilteringUiInfo", "()Lcom/themovie/app/movieapp/presentation/ui/tasks/FilteringUiInfo;", "()Z", "getItems", "()Ljava/util/List;", "getUserMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;ZLcom/themovie/app/movieapp/presentation/ui/tasks/FilteringUiInfo;Ljava/lang/Integer;)Lcom/themovie/app/movieapp/presentation/ui/tasks/TasksUiState;", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class TasksUiState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> items = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo filteringUiInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer userMessage = null;
    
    public TasksUiState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> items, boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo filteringUiInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userMessage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> getItems() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo getFilteringUiInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserMessage() {
        return null;
    }
    
    public TasksUiState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.themovie.app.movieapp.presentation.ui.tasks.TasksUiState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> items, boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.presentation.ui.tasks.FilteringUiInfo filteringUiInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userMessage) {
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