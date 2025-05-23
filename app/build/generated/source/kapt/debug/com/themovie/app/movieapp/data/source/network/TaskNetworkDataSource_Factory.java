package com.themovie.app.movieapp.data.source.network;

import com.diemn.apiclient.repository.ITheMovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class TaskNetworkDataSource_Factory implements Factory<TaskNetworkDataSource> {
  private final Provider<ITheMovieRepository> iTheMovieRepositoryProvider;

  public TaskNetworkDataSource_Factory(Provider<ITheMovieRepository> iTheMovieRepositoryProvider) {
    this.iTheMovieRepositoryProvider = iTheMovieRepositoryProvider;
  }

  @Override
  public TaskNetworkDataSource get() {
    return newInstance(iTheMovieRepositoryProvider.get());
  }

  public static TaskNetworkDataSource_Factory create(
      Provider<ITheMovieRepository> iTheMovieRepositoryProvider) {
    return new TaskNetworkDataSource_Factory(iTheMovieRepositoryProvider);
  }

  public static TaskNetworkDataSource newInstance(ITheMovieRepository iTheMovieRepository) {
    return new TaskNetworkDataSource(iTheMovieRepository);
  }
}
