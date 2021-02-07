package com.starts.movieguide.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.starts.movieguide.R
import com.starts.movieguide.databinding.SceneDiscoverBinding
import org.koin.android.ext.android.bind

/**

 *文件描述：.
 *作者：Created by Administrator on 2020/8/27.
 *版本号：1.0

 */
class DiscoverFragment : Fragment() {

    lateinit var binding:SceneDiscoverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SceneDiscoverBinding.inflate(layoutInflater, container ,true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        

    }


}