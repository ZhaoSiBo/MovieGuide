package com.starts.movieguide.scene

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bytedance.scene.ui.template.AppCompatScene
import com.starts.movieguide.R
import timber.log.Timber

class TabChildScene : AppCompatScene() {
    companion object {
        fun newInstance(index: Int): TabChildScene {
            return TabChildScene().apply {
                val bundle = Bundle()
                bundle.putInt("index", index)
                setArguments(bundle)
            }
        }
    }

    override fun onCreateContentView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle?): View {
        return TextView(requireSceneContext()).apply {
            val index = requireArguments()["index"] as Int
            background = ContextCompat.getDrawable(requireSceneContext() , R.drawable.primary_background)
            gravity = Gravity.CENTER
            text = "Child Scene #$index"
            setTextColor(ContextCompat.getColor(requireSceneContext() , R.color.white))
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setToolbarVisible(false)
        setStatusBarVisible(true)

    }


    override fun onResume() {
        super.onResume()
        Timber.d("onResume")
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        toolbar?.navigationIcon = null

    }
}