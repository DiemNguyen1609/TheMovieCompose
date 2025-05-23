package com.themovie.app.movieapp.util;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/themovie/app/movieapp/util/NetworkConnectionState;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "checkInternet", "T", "callAPI", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNetworkAvailable", "", "app_debug"})
public final class NetworkConnectionState {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @javax.inject.Inject()
    public NetworkConnectionState(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public final <T extends java.lang.Object>T checkInternet(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> callAPI) {
        return null;
    }
}