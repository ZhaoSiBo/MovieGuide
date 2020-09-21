package com.starts.movieguide.network

import com.starts.movieguide.model.MoviePopularResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/9/19.
 *版本号：1.0

 */
interface MovieService  {
    @GET("3/movie/popular")
    fun requestPopularMovieList(@Query("page") page: Int):Call<MoviePopularResponse>
}