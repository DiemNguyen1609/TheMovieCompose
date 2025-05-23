package com.themovie.app.movieapp.presentation.ui.tasks;

import androidx.lifecycle.SavedStateHandle;
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
public final class TasksViewModel_Factory implements Factory<TasksViewModel> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public TasksViewModel_Factory(Provider<TaskRepository> taskRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public TasksViewModel get() {
    return newInstance(taskRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static TasksViewModel_Factory create(Provider<TaskRepository> taskRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new TasksViewModel_Factory(taskRepositoryProvider, savedStateHandleProvider);
  }

  public static TasksViewModel newInstance(TaskRepository taskRepository,
      SavedStateHandle savedStateHandle) {
    return new TasksViewModel(taskRepository, savedStateHandle);
  }
}
