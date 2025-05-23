package com.themovie.app.movieapp.presentation.ui.home;

import androidx.lifecycle.SavedStateHandle;
import com.themovie.app.movieapp.data.DataStoreRepository;
import com.themovie.app.movieapp.data.TaskRepository;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public HomeViewModel_Factory(Provider<TaskRepository> taskRepositoryProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
    this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(taskRepositoryProvider.get(), dataStoreRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<TaskRepository> taskRepositoryProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new HomeViewModel_Factory(taskRepositoryProvider, dataStoreRepositoryProvider, savedStateHandleProvider);
  }

  public static HomeViewModel newInstance(TaskRepository taskRepository,
      DataStoreRepository dataStoreRepository, SavedStateHandle savedStateHandle) {
    return new HomeViewModel(taskRepository, dataStoreRepository, savedStateHandle);
  }
}
