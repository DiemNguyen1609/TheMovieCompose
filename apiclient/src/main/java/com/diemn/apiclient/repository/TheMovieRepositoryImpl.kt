package com.diemn.apiclient.repository

import com.diemn.apiclient.network.ApiService
import com.diemn.apiclient.response.MoviesResponse

class ITheMovieRepositoryImpl(private val apiService: ApiService) : ITheMovieRepository {

    override suspend fun getListMovie(page: Int): MoviesResponse {
        return apiService.getListMovies(page = page)
    }
}