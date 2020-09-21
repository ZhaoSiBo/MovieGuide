package com.starts.movieguide.network

import com.starts.movieguide.Constants
import okhttp3.Interceptor
import okhttp3.Response
import timber.log.Timber

class HttpRequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
//        val request = originalRequest.newBuilder().url(originalRequest.url).build()

        val builder = request.url.newBuilder()
        val newUrl = builder
            .addQueryParameter("api_key", Constants.API_KEY)
            .addQueryParameter("language", Constants.LANGUAGE)
            .build()

        val newRequest = request.newBuilder().url(newUrl).build()
        Timber.d(newRequest.body.toString())
        return chain.proceed(newRequest)
    }
}