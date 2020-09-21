package com.starts.movieguide.network

import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.request
import com.starts.movieguide.model.MoviePopularResponse

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/9/19.
 *版本号：1.0

 */
class MovieClient(private val movieService: MovieService) {
    fun requestPopularMovieList(
        page: Int,
        onResult: (response: ApiResponse<MoviePopularResponse>) -> Unit
    ) {
        movieService.requestPopularMovieList(page)
            .request(onResult)
    }

}