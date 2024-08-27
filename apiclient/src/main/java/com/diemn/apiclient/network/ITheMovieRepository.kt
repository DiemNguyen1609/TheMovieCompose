package com.diemn.apiclient.network

import com.diemn.apiclient.response.MoviesResponse

interface ITheMovieRepository {
    suspend fun getListMovie(page: Int): MoviesResponse
}