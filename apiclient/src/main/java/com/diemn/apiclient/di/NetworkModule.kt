package com.diemn.apiclient.di

import com.diemn.apiclient.network.ApiService
import com.diemn.apiclient.repository.ITheMovieRepository
import com.diemn.apiclient.repository.ITheMovieRepositoryImpl
import com.diemn.apiclient.network.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient = RetrofitClient().client

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit = RetrofitClient().retrofit

    @Singleton
    @Provides
    fun provideApiService(): ApiService = RetrofitClient().apiService

    @Singleton
    @Provides
    fun provideNetworkRepository(apiService: ApiService): ITheMovieRepository =
        ITheMovieRepositoryImpl(
            apiService = apiService
        )

}
