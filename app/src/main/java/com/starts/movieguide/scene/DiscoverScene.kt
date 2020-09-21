package com.starts.movieguide.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bytedance.scene.Scene
import com.bytedance.scene.ktx.activityViewModels
import com.bytedance.scene.ktx.viewModels
import com.bytedance.scene.ui.template.AppCompatScene
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.starts.movieguide.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.compat.ScopeCompat.getViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import timber.log.Timber

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/28.
 *版本号：1.0

 */
class DiscoverScene : BaseScene() {

    lateinit var refreshLayout: SmartRefreshLayout
    lateinit var recyclerView: RecyclerView

    val discoverViewModel:DiscoverViewModel by lazy {
        getViewModel<DiscoverViewModel>()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.scene_discover , container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        refreshLayout = view.findViewById(R.id.refreshLayout)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireSceneContext())
        refreshLayout.setOnRefreshListener {
            Timber.d("刷新")
        }
        GlobalScope.launch {
            discoverViewModel.requestPopularMovieList(1){
                Timber.d(it)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        GlobalScope.launch {
            discoverViewModel.requestPopularMovieList(1){
                Timber.d(it)
            }
        }
    }

}