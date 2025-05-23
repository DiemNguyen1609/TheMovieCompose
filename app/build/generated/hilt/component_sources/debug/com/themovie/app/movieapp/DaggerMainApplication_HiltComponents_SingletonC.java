package com.themovie.app.movieapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.diemn.apiclient.di.NetworkModule;
import com.diemn.apiclient.di.NetworkModule_ProvideApiServiceFactory;
import com.diemn.apiclient.di.NetworkModule_ProvideNetworkRepositoryFactory;
import com.diemn.apiclient.network.ApiService;
import com.diemn.apiclient.repository.ITheMovieRepository;
import com.themovie.app.movieapp.data.DataStoreRepository;
import com.themovie.app.movieapp.data.DefaultTaskRepository;
import com.themovie.app.movieapp.data.source.local.TheMovieDao;
import com.themovie.app.movieapp.data.source.local.TheMovieDatabase;
import com.themovie.app.movieapp.data.source.network.NetworkDataSource;
import com.themovie.app.movieapp.data.source.network.TaskNetworkDataSource;
import com.themovie.app.movieapp.di.CoroutinesModule_ProvidesCoroutineScopeFactory;
import com.themovie.app.movieapp.di.CoroutinesModule_ProvidesDefaultDispatcherFactory;
import com.themovie.app.movieapp.di.DatabaseModule_ProvideDataBaseFactory;
import com.themovie.app.movieapp.di.DatabaseModule_ProvideTaskDaoFactory;
import com.themovie.app.movieapp.di.DatastorePreferenceModule_ProvideDataStoreRepositoryFactory;
import com.themovie.app.movieapp.presentation.ui.home.HomeViewModel;
import com.themovie.app.movieapp.presentation.ui.home.HomeViewModel_HiltModules;
import com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailViewModel;
import com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailViewModel_HiltModules;
import com.themovie.app.movieapp.presentation.ui.tasks.TasksViewModel;
import com.themovie.app.movieapp.presentation.ui.tasks.TasksViewModel_HiltModules;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.IdentifierNameString;
import dagger.internal.KeepFieldType;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineScope;

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
public final class DaggerMainApplication_HiltComponents_SingletonC {
  private DaggerMainApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new SingletonCImpl(applicationContextModule, networkModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectHiltTestActivity(HiltTestActivity hiltTestActivity) {
    }

    @Override
    public void injectHomeActivity(HomeActivity homeActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(3).put(LazyClassKeyProvider.com_themovie_app_movieapp_presentation_ui_home_HomeViewModel, HomeViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_themovie_app_movieapp_presentation_ui_taskdetail_TaskDetailViewModel, TaskDetailViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_themovie_app_movieapp_presentation_ui_tasks_TasksViewModel, TasksViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_themovie_app_movieapp_presentation_ui_home_HomeViewModel = "com.themovie.app.movieapp.presentation.ui.home.HomeViewModel";

      static String com_themovie_app_movieapp_presentation_ui_tasks_TasksViewModel = "com.themovie.app.movieapp.presentation.ui.tasks.TasksViewModel";

      static String com_themovie_app_movieapp_presentation_ui_taskdetail_TaskDetailViewModel = "com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailViewModel";

      @KeepFieldType
      HomeViewModel com_themovie_app_movieapp_presentation_ui_home_HomeViewModel2;

      @KeepFieldType
      TasksViewModel com_themovie_app_movieapp_presentation_ui_tasks_TasksViewModel2;

      @KeepFieldType
      TaskDetailViewModel com_themovie_app_movieapp_presentation_ui_taskdetail_TaskDetailViewModel2;
    }
  }

  private static final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<TaskDetailViewModel> taskDetailViewModelProvider;

    private Provider<TasksViewModel> tasksViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.taskDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.tasksViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(3).put(LazyClassKeyProvider.com_themovie_app_movieapp_presentation_ui_home_HomeViewModel, ((Provider) homeViewModelProvider)).put(LazyClassKeyProvider.com_themovie_app_movieapp_presentation_ui_taskdetail_TaskDetailViewModel, ((Provider) taskDetailViewModelProvider)).put(LazyClassKeyProvider.com_themovie_app_movieapp_presentation_ui_tasks_TasksViewModel, ((Provider) tasksViewModelProvider)).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_themovie_app_movieapp_presentation_ui_tasks_TasksViewModel = "com.themovie.app.movieapp.presentation.ui.tasks.TasksViewModel";

      static String com_themovie_app_movieapp_presentation_ui_home_HomeViewModel = "com.themovie.app.movieapp.presentation.ui.home.HomeViewModel";

      static String com_themovie_app_movieapp_presentation_ui_taskdetail_TaskDetailViewModel = "com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailViewModel";

      @KeepFieldType
      TasksViewModel com_themovie_app_movieapp_presentation_ui_tasks_TasksViewModel2;

      @KeepFieldType
      HomeViewModel com_themovie_app_movieapp_presentation_ui_home_HomeViewModel2;

      @KeepFieldType
      TaskDetailViewModel com_themovie_app_movieapp_presentation_ui_taskdetail_TaskDetailViewModel2;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.themovie.app.movieapp.presentation.ui.home.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.defaultTaskRepositoryProvider.get(), singletonCImpl.provideDataStoreRepositoryProvider.get(), viewModelCImpl.savedStateHandle);

          case 1: // com.themovie.app.movieapp.presentation.ui.taskdetail.TaskDetailViewModel 
          return (T) new TaskDetailViewModel(singletonCImpl.defaultTaskRepositoryProvider.get(), viewModelCImpl.savedStateHandle);

          case 2: // com.themovie.app.movieapp.presentation.ui.tasks.TasksViewModel 
          return (T) new TasksViewModel(singletonCImpl.defaultTaskRepositoryProvider.get(), viewModelCImpl.savedStateHandle);

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends MainApplication_HiltComponents.SingletonC {
    private final NetworkModule networkModule;

    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<ApiService> provideApiServiceProvider;

    private Provider<ITheMovieRepository> provideNetworkRepositoryProvider;

    private Provider<TaskNetworkDataSource> taskNetworkDataSourceProvider;

    private Provider<NetworkDataSource> bindNetworkDataSourceProvider;

    private Provider<TheMovieDatabase> provideDataBaseProvider;

    private Provider<CoroutineScope> providesCoroutineScopeProvider;

    private Provider<DefaultTaskRepository> defaultTaskRepositoryProvider;

    private Provider<DataStoreRepository> provideDataStoreRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        NetworkModule networkModuleParam) {
      this.networkModule = networkModuleParam;
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam, networkModuleParam);

    }

    private TheMovieDao theMovieDao() {
      return DatabaseModule_ProvideTaskDaoFactory.provideTaskDao(provideDataBaseProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final NetworkModule networkModuleParam) {
      this.provideApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<ApiService>(singletonCImpl, 3));
      this.provideNetworkRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ITheMovieRepository>(singletonCImpl, 2));
      this.taskNetworkDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 1);
      this.bindNetworkDataSourceProvider = DoubleCheck.provider((Provider) taskNetworkDataSourceProvider);
      this.provideDataBaseProvider = DoubleCheck.provider(new SwitchingProvider<TheMovieDatabase>(singletonCImpl, 4));
      this.providesCoroutineScopeProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineScope>(singletonCImpl, 5));
      this.defaultTaskRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<DefaultTaskRepository>(singletonCImpl, 0));
      this.provideDataStoreRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<DataStoreRepository>(singletonCImpl, 6));
    }

    @Override
    public void injectMainApplication(MainApplication mainApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.themovie.app.movieapp.data.DefaultTaskRepository 
          return (T) new DefaultTaskRepository(singletonCImpl.bindNetworkDataSourceProvider.get(), singletonCImpl.theMovieDao(), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher(), singletonCImpl.providesCoroutineScopeProvider.get());

          case 1: // com.themovie.app.movieapp.data.source.network.TaskNetworkDataSource 
          return (T) new TaskNetworkDataSource(singletonCImpl.provideNetworkRepositoryProvider.get());

          case 2: // com.diemn.apiclient.repository.ITheMovieRepository 
          return (T) NetworkModule_ProvideNetworkRepositoryFactory.provideNetworkRepository(singletonCImpl.networkModule, singletonCImpl.provideApiServiceProvider.get());

          case 3: // com.diemn.apiclient.network.ApiService 
          return (T) NetworkModule_ProvideApiServiceFactory.provideApiService(singletonCImpl.networkModule);

          case 4: // com.themovie.app.movieapp.data.source.local.TheMovieDatabase 
          return (T) DatabaseModule_ProvideDataBaseFactory.provideDataBase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 5: // @com.themovie.app.movieapp.di.ApplicationScope kotlinx.coroutines.CoroutineScope 
          return (T) CoroutinesModule_ProvidesCoroutineScopeFactory.providesCoroutineScope(CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher());

          case 6: // com.themovie.app.movieapp.data.DataStoreRepository 
          return (T) DatastorePreferenceModule_ProvideDataStoreRepositoryFactory.provideDataStoreRepository(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
