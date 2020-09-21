package com.starts.movieguide.scene

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.skydoves.sandwich.message
import com.skydoves.sandwich.onError
import com.skydoves.sandwich.onException
import com.skydoves.sandwich.onSuccess
import com.skydoves.whatif.whatIfNotNull
import com.starts.movieguide.model.MoviePopular
import com.starts.movieguide.network.MovieClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/9/21.
 *版本号：1.0

 */
class DiscoverViewModel(private val movieClient:MovieClient) :  ViewModel(){
    val moviePopularList = MutableLiveData<List<MoviePopular>>()

    suspend fun requestPopularMovieList(page:Int , error:(String) ->Unit) = withContext(Dispatchers.IO){
        movieClient.requestPopularMovieList(page){
            it.onSuccess {
                data.whatIfNotNull {response->
                    moviePopularList.postValue(response.results)
                }
            }
                .onError {
                    error(message())
                }.onException {
                    error(message())
                }

        }
    }


}