package com.starts.movieguide.scene

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.collection.SparseArrayCompat
import androidx.core.content.ContextCompat
import com.bytedance.scene.Scene
import com.bytedance.scene.group.GroupScene
import com.bytedance.scene.navigation.NavigationScene
import com.bytedance.scene.ui.template.AppCompatScene
import com.bytedance.scene.ui.template.BottomNavigationViewScene
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.starts.movieguide.R
import com.starts.movieguide.getMaterialColor
import timber.log.Timber

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/28.
 *版本号：1.0

 */
class MainScene : BottomNavigationViewScene() {
    override fun getSceneMap(): SparseArrayCompat<Scene> {
        val sparseArrayCompat = SparseArrayCompat<Scene>()
        sparseArrayCompat.put(R.id.discover, DiscoverScene())
        sparseArrayCompat.put(R.id.news, TabChildScene.newInstance(1))
        sparseArrayCompat.put(R.id.tickets, TabChildScene.newInstance(2))
        sparseArrayCompat.put(R.id.account, TabChildScene.newInstance(3))
        sparseArrayCompat.put(R.id.notifications, TabChildScene.newInstance(4))
        return sparseArrayCompat
    }

    override fun getMenuResId(): Int {
        return R.menu.menu_main
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bottomNavigationView.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        bottomNavigationView.setBackgroundColor(ContextCompat.getColor(requireSceneContext() , R.color.colorBackground))
        bottomNavigationView.itemTextColor = ContextCompat.getColorStateList(requireSceneContext() , R.color.navigation_text_color)
        bottomNavigationView.selectedItemId = R.id.discover
        bottomNavigationView.itemIconTintList = null
    }

}


