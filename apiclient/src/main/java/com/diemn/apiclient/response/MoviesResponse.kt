package com.diemn.apiclient.response

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("data")
    val data: List<MovieItemResponse>? = null,
    @SerializedName("metadata")
    val metadata: MetaDataResponse? = null,
)

data class MetaDataResponse(
    @SerializedName("current_page")
    val currentPage: String? = null,
    @SerializedName("per_page")
    val perPage: Int? = null,
    @SerializedName("page_count")
    val pageCount: Int? = null,
    @SerializedName("total_count")
    val totalCount: Int? = null,
)

data class MovieItemResponse(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("poster")
    val poster: String? = null,
    @SerializedName("year")
    val year: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("imdb_rating")
    val imdbRating: String? = null,
    @SerializedName("genres")
    val genres: List<String>? = null,
    @SerializedName("images")
    val images: List<String>? = null,
)