package com.diemn.apiclient.response

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("data")
    val data: List<MovieItemResponse>? = null,
    @SerializedName("page")
    val currentPage: String? = null,
    @SerializedName("limit")
    val perPage: Int? = null,
    @SerializedName("total_pages")
    val pageCount: Int? = null,
    @SerializedName("total_items")
    val totalCount: Int? = null,
)

data class ImdbResponse(
    @SerializedName("rating")
    val rating: String? = null,
    @SerializedName("vote")
    val vote: Int? = null,
    @SerializedName("id")
    val id: Int? = null,
)

data class MovieItemResponse(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("poster")
    val poster: String? = null,
    @SerializedName("directors")
    val directors: List<String>? = null,
    @SerializedName("year")
    val year: String? = null,
    @SerializedName("fullplot")
    val fullPlot: String? = null,
    @SerializedName("genres")
    val genres: List<String>? = null,
    @SerializedName("cast")
    val cast: List<String>? = null,
    @SerializedName("countries")
    val countries: List<String>? = null,
    @SerializedName("imdb")
    val imdb: ImdbResponse? = null,
)