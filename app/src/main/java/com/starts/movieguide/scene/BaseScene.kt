package com.starts.movieguide.scene

import android.content.ComponentCallbacks
import android.content.res.Configuration
import com.bytedance.scene.Scene

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/9/21.
 *版本号：1.0

 */
abstract class BaseScene :Scene() , ComponentCallbacks {
    override fun onLowMemory() {

    }

    override fun onConfigurationChanged(newConfig: Configuration) {

    }
}