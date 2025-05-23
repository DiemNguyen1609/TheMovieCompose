package com.themovie.app.movieapp.util;

import android.app.Application;
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
public final class NetworkConnectionState_Factory implements Factory<NetworkConnectionState> {
  private final Provider<Application> applicationProvider;

  public NetworkConnectionState_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public NetworkConnectionState get() {
    return newInstance(applicationProvider.get());
  }

  public static NetworkConnectionState_Factory create(Provider<Application> applicationProvider) {
    return new NetworkConnectionState_Factory(applicationProvider);
  }

  public static NetworkConnectionState newInstance(Application application) {
    return new NetworkConnectionState(application);
  }
}
