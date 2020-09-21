/*
 * Designed and developed by 2020 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.starts.movieguide.di

import com.starts.movieguide.network.MovieClient
import com.starts.movieguide.network.MovieService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

//@Module
//@InstallIn(ApplicationComponent::class)
//object NetworkModule {
//
//    @Provides
//    @Singleton
//    fun provideOkHttpClient(): OkHttpClient {
//        return OkHttpClient.Builder()
//            .addInterceptor(HttpRequestInterceptor())
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .client(okHttpClient)
//            .baseUrl("https://api.themoviedb.org/3/")
//            .addConverterFactory(MoshiConverterFactory.create())
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideMovieService(retrofit: Retrofit): MovieService {
//        return retrofit.create(MovieService::class.java)
//    }
//
//    @Provides
//    @Singleton
//    fun provideMovieClient(pokedexService: MovieService): MovieClient {
//        return MovieClient(pokedexService)
//    }
//}
