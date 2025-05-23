package com.themovie.app.movieapp.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u00a2\u0006\u0002\b\u0005\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007\u00a2\u0006\u0002\b\u0006\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0001\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u00a2\u0006\u0002\b\b\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"toExternal", "Lcom/themovie/app/movieapp/data/source/network/DTOMovie;", "Lcom/diemn/apiclient/response/MovieItemResponse;", "Lcom/themovie/app/movieapp/data/source/local/LocalMovie;", "", "networkToExternal", "localToExternal", "toLocal", "networkToLocal", "externalToLocal", "app_debug"})
public final class ModelMappingExtKt {
    
    /**
     * Data model mapping extension functions. There are three model types:
     *
     * - Task: External model exposed to other layers in the architecture.
     * Obtained using `toExternal`.
     *
     * - NetworkTask: Internal model used to represent a task from the network. Obtained using
     * `toNetwork`.
     *
     * - LocalTask: Internal model used to represent a task stored locally in a database. Obtained
     * using `toLocal`.
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.data.source.local.LocalMovie toLocal(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.source.network.DTOMovie $this$toLocal) {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "externalToLocal")
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.themovie.app.movieapp.data.source.local.LocalMovie> externalToLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> $this$toLocal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.data.source.network.DTOMovie toExternal(@org.jetbrains.annotations.NotNull()
    com.themovie.app.movieapp.data.source.local.LocalMovie $this$toExternal) {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "localToExternal")
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> localToExternal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.themovie.app.movieapp.data.source.local.LocalMovie> $this$toExternal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.data.source.local.LocalMovie toLocal(@org.jetbrains.annotations.NotNull()
    com.diemn.apiclient.response.MovieItemResponse $this$toLocal) {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "networkToLocal")
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.themovie.app.movieapp.data.source.local.LocalMovie> networkToLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.diemn.apiclient.response.MovieItemResponse> $this$toLocal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.data.source.network.DTOMovie toExternal(@org.jetbrains.annotations.NotNull()
    com.diemn.apiclient.response.MovieItemResponse $this$toExternal) {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "networkToExternal")
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.themovie.app.movieapp.data.source.network.DTOMovie> networkToExternal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.diemn.apiclient.response.MovieItemResponse> $this$toExternal) {
        return null;
    }
}