package com.themovie.app.movieapp.presentation.ui.taskdetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0003\u001a\b\u0010\f\u001a\u00020\u0001H\u0003\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u001aV\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u00a8\u0006\u0018"}, d2 = {"EditTaskContent", "", "loading", "", "empty", "task", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "onRefresh", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "EditTaskContentEmptyPreview", "EditTaskContentPreview", "EditTaskContentTaskCompletedPreview", "TaskDetailScreen", "onEditTask", "Lkotlin/Function1;", "", "onBack", "onDeleteTask", "viewModel", "Lcom/themovie/app/movieapp/presentation/ui/taskdetail/TaskDetailViewModel;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "app_debug"})
public final class TaskDetailScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TaskDetailScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onEditTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteTask, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ScaffoldState scaffoldState) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EditTaskContent(boolean loading, boolean empty, com.themovie.app.movieapp.data.source.network.DTOMovie task, kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void EditTaskContentPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void EditTaskContentTaskCompletedPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void EditTaskContentEmptyPreview() {
    }
}