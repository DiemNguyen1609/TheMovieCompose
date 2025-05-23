package com.themovie.app.movieapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/themovie/app/movieapp/di/CoroutinesModule;", "", "()V", "providesCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesDefaultDispatcher", "providesIODispatcher", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class CoroutinesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.di.CoroutinesModule INSTANCE = null;
    
    private CoroutinesModule() {
        super();
    }
    
    @dagger.Provides()
    @IoDispatcher()
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher providesIODispatcher() {
        return null;
    }
    
    @dagger.Provides()
    @DefaultDispatcher()
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher providesDefaultDispatcher() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @ApplicationScope()
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope providesCoroutineScope(@DefaultDispatcher()
    @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        return null;
    }
}