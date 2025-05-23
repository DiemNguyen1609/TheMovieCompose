package com.themovie.app.movieapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.themovie.app.movieapp.di.IoDispatcher")
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
public final class CoroutinesModule_ProvidesIODispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesIODispatcher();
  }

  public static CoroutinesModule_ProvidesIODispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesIODispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesIODispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesIODispatcherFactory INSTANCE = new CoroutinesModule_ProvidesIODispatcherFactory();
  }
}
