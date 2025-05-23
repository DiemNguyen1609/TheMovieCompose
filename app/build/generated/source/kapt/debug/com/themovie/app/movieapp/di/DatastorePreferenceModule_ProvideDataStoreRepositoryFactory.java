package com.themovie.app.movieapp.di;

import android.content.Context;
import com.themovie.app.movieapp.data.DataStoreRepository;
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
public final class DatastorePreferenceModule_ProvideDataStoreRepositoryFactory implements Factory<DataStoreRepository> {
  private final Provider<Context> appProvider;

  public DatastorePreferenceModule_ProvideDataStoreRepositoryFactory(
      Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public DataStoreRepository get() {
    return provideDataStoreRepository(appProvider.get());
  }

  public static DatastorePreferenceModule_ProvideDataStoreRepositoryFactory create(
      Provider<Context> appProvider) {
    return new DatastorePreferenceModule_ProvideDataStoreRepositoryFactory(appProvider);
  }

  public static DataStoreRepository provideDataStoreRepository(Context app) {
    return Preconditions.checkNotNullFromProvides(DatastorePreferenceModule.INSTANCE.provideDataStoreRepository(app));
  }
}
