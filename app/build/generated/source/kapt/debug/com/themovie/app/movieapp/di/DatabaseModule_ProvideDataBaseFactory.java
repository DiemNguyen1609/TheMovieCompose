package com.themovie.app.movieapp.di;

import android.content.Context;
import com.themovie.app.movieapp.data.source.local.TheMovieDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseModule_ProvideDataBaseFactory implements Factory<TheMovieDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideDataBaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public TheMovieDatabase get() {
    return provideDataBase(contextProvider.get());
  }

  public static DatabaseModule_ProvideDataBaseFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideDataBaseFactory(contextProvider);
  }

  public static TheMovieDatabase provideDataBase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDataBase(context));
  }
}
