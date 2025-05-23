package com.themovie.app.movieapp.data;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DataStoreRepositoryImpl_Factory implements Factory<DataStoreRepositoryImpl> {
  private final Provider<Context> contextProvider;

  public DataStoreRepositoryImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreRepositoryImpl get() {
    return newInstance(contextProvider.get());
  }

  public static DataStoreRepositoryImpl_Factory create(Provider<Context> contextProvider) {
    return new DataStoreRepositoryImpl_Factory(contextProvider);
  }

  public static DataStoreRepositoryImpl newInstance(Context context) {
    return new DataStoreRepositoryImpl(context);
  }
}
