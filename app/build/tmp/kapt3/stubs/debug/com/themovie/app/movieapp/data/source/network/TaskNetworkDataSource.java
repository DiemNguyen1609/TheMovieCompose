package com.themovie.app.movieapp.data.source.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/themovie/app/movieapp/data/source/network/TaskNetworkDataSource;", "Lcom/themovie/app/movieapp/data/source/network/NetworkDataSource;", "iTheMovieRepository", "Lcom/diemn/apiclient/repository/ITheMovieRepository;", "(Lcom/diemn/apiclient/repository/ITheMovieRepository;)V", "accessMutex", "Lkotlinx/coroutines/sync/Mutex;", "tasks", "", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "loadTasks", "Lcom/diemn/apiclient/response/MovieItemResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTasks", "", "newTasks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TaskNetworkDataSource implements com.themovie.app.movieapp.data.source.network.NetworkDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.diemn.apiclient.repository.ITheMovieRepository iTheMovieRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.sync.Mutex accessMutex = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> tasks;
    
    @javax.inject.Inject()
    public TaskNetworkDataSource(@org.jetbrains.annotations.NotNull()
    com.diemn.apiclient.repository.ITheMovieRepository iTheMovieRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object loadTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.diemn.apiclient.response.MovieItemResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> newTasks, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}