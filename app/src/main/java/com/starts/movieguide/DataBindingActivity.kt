package com.starts.movieguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.starts.movieguide.databinding.SceneDiscoverBinding
import org.koin.android.ext.android.bind

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/27.
 *版本号：1.0

 */
abstract class DataBindingActivity : AppCompatActivity() {

    protected inline fun <reified T : ViewDataBinding> binding(
        @LayoutRes resId: Int
    ): Lazy<T> = lazy { DataBindingUtil.setContentView<T>(this, resId) }
}