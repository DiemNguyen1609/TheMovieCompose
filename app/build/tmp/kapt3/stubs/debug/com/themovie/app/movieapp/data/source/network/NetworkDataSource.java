package com.themovie.app.movieapp.data.source.network;

/**
 * Main entry point for accessing tasks data from the network.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/themovie/app/movieapp/data/source/network/NetworkDataSource;", "", "loadTasks", "", "Lcom/diemn/apiclient/response/MovieItemResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTasks", "", "tasks", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NetworkDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.diemn.apiclient.response.MovieItemResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> tasks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}