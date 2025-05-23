package com.diemn.apiclient.repository

import com.diemn.apiclient.response.MoviesResponse

interface ITheMovieRepository {
    suspend fun getListMovie(page: Int): MoviesResponse
}