package com.themovie.app.movieapp.presentation.ui.tasks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0003\u001ah\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\u001a\b\u0010\u0015\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0003\u001a&\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\u001a\b\u0010\u0018\u001a\u00020\u0001H\u0003\u001an\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u001a\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007\u00a8\u0006\""}, d2 = {"TaskItem", "", "task", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "onTaskClick", "Lkotlin/Function1;", "TaskItemCompletedPreview", "TaskItemPreview", "TasksContent", "loading", "", "tasks", "", "currentFilteringLabel", "", "noTasksLabel", "noTasksIconRes", "onRefresh", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "TasksContentEmptyPreview", "TasksContentPreview", "TasksEmptyContent", "TasksEmptyContentPreview", "TasksScreen", "userMessage", "onAddTask", "onUserMessageDisplayed", "openDrawer", "viewModel", "Lcom/themovie/app/movieapp/presentation/ui/tasks/TasksViewModel;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "app_debug"})
public final class TasksScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TasksScreen(@androidx.annotation.StringRes()
    int userMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAddTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.themovie.app.movieapp.data.source.network.DTOMovie, kotlin.Unit> onTaskClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUserMessageDisplayed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> openDrawer, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.presentation.ui.tasks.TasksViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ScaffoldState scaffoldState) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void TasksContent(boolean loading, java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> tasks, @androidx.annotation.StringRes()
    int currentFilteringLabel, @androidx.annotation.StringRes()
    int noTasksLabel, @androidx.annotation.DrawableRes()
    int noTasksIconRes, kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, kotlin.jvm.functions.Function1<? super com.themovie.app.movieapp.data.source.network.DTOMovie, kotlin.Unit> onTaskClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void TaskItem(com.themovie.app.movieapp.data.source.network.DTOMovie task, kotlin.jvm.functions.Function1<? super com.themovie.app.movieapp.data.source.network.DTOMovie, kotlin.Unit> onTaskClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void TasksEmptyContent(@androidx.annotation.StringRes()
    int noTasksLabel, @androidx.annotation.DrawableRes()
    int noTasksIconRes, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void TasksContentPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void TasksContentEmptyPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void TasksEmptyContentPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void TaskItemPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void TaskItemCompletedPreview() {
    }
}