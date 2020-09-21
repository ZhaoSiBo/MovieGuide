package com.starts.movieguide.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import androidx.annotation.Keep

@Keep
@JsonClass(generateAdapter = true)
data class MoviePopularResponse(
    @Json(name = "page")
    val page: Int = 0,
    @Json(name = "results")
    val results: List<MoviePopular> = listOf(),
    @Json(name = "total_pages")
    val totalPages: Int = 0,
    @Json(name = "total_results")
    val totalResults: Int = 0
)