package com.themovie.app.movieapp.data;

import com.themovie.app.movieapp.data.source.local.TheMovieDao;
import com.themovie.app.movieapp.data.source.network.NetworkDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "com.themovie.app.movieapp.di.DefaultDispatcher",
    "com.themovie.app.movieapp.di.ApplicationScope"
})
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class DefaultTaskRepository_Factory implements Factory<DefaultTaskRepository> {
  private final Provider<NetworkDataSource> networkDataSourceProvider;

  private final Provider<TheMovieDao> localDataSourceProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  private final Provider<CoroutineScope> scopeProvider;

  public DefaultTaskRepository_Factory(Provider<NetworkDataSource> networkDataSourceProvider,
      Provider<TheMovieDao> localDataSourceProvider,
      Provider<CoroutineDispatcher> dispatcherProvider, Provider<CoroutineScope> scopeProvider) {
    this.networkDataSourceProvider = networkDataSourceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.scopeProvider = scopeProvider;
  }

  @Override
  public DefaultTaskRepository get() {
    return newInstance(networkDataSourceProvider.get(), localDataSourceProvider.get(), dispatcherProvider.get(), scopeProvider.get());
  }

  public static DefaultTaskRepository_Factory create(
      Provider<NetworkDataSource> networkDataSourceProvider,
      Provider<TheMovieDao> localDataSourceProvider,
      Provider<CoroutineDispatcher> dispatcherProvider, Provider<CoroutineScope> scopeProvider) {
    return new DefaultTaskRepository_Factory(networkDataSourceProvider, localDataSourceProvider, dispatcherProvider, scopeProvider);
  }

  public static DefaultTaskRepository newInstance(NetworkDataSource networkDataSource,
      TheMovieDao localDataSource, CoroutineDispatcher dispatcher, CoroutineScope scope) {
    return new DefaultTaskRepository(networkDataSource, localDataSource, dispatcher, scope);
  }
}
