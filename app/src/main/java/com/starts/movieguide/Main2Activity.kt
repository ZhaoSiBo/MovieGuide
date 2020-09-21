package com.starts.movieguide

import com.bytedance.scene.Scene
import com.bytedance.scene.ui.SceneActivity
import com.starts.movieguide.scene.MainScene

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/28.
 *版本号：1.0

 */
class Main2Activity :SceneActivity() {
    override fun supportRestore(): Boolean {
        return true
    }

    override fun getHomeSceneClass(): Class<out Scene> {
        return MainScene::class.java
    }
}