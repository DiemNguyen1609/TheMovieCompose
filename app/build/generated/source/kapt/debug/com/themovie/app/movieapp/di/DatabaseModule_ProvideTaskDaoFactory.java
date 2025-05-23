package com.themovie.app.movieapp.di;

import com.themovie.app.movieapp.data.source.local.TheMovieDao;
import com.themovie.app.movieapp.data.source.local.TheMovieDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideTaskDaoFactory implements Factory<TheMovieDao> {
  private final Provider<TheMovieDatabase> databaseProvider;

  public DatabaseModule_ProvideTaskDaoFactory(Provider<TheMovieDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public TheMovieDao get() {
    return provideTaskDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideTaskDaoFactory create(
      Provider<TheMovieDatabase> databaseProvider) {
    return new DatabaseModule_ProvideTaskDaoFactory(databaseProvider);
  }

  public static TheMovieDao provideTaskDao(TheMovieDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTaskDao(database));
  }
}
