package com.diemn.apiclient.network

import com.diemn.apiclient.response.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movies")
    suspend fun getListMovies(
        @Query("page") page: Int
    ): MoviesResponse
}