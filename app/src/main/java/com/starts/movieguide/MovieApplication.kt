package com.starts.movieguide

import android.app.Application
import com.starts.movieguide.network.HttpRequestInterceptor
import com.starts.movieguide.network.MovieClient
import com.starts.movieguide.network.MovieService
import com.starts.movieguide.scene.DiscoverViewModel
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/28.
 *版本号：1.0

 */

class MovieApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
        val networkModule = module{
            single {
                OkHttpClient.Builder()
                    .addInterceptor(HttpRequestInterceptor())
                    .build()
            }
            single {
                Retrofit.Builder()
                    .client(get())
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
            }
            single {
                MovieClient(get<Retrofit>().create(MovieService::class.java))
            }
            viewModel {
                DiscoverViewModel(get())
            }
        }



        startKoin {
            AndroidLogger(Level.DEBUG)
            androidContext(this@MovieApplication)
            modules(networkModule)

        }

    }
}