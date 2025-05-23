package com.diemn.apiclient.network

import com.diemn.apiclient.response.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("Movies/movie")
    suspend fun getListMovies(
        @Query("page") page: Int = 1,
        @Query("limit") limit: Int = 10
    ): MoviesResponse
}