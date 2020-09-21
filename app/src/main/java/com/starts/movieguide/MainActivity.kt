package com.starts.movieguide

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.starts.movieguide.databinding.ActivityMainBinding

class MainActivity : DataBindingActivity() {

    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf()

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.offscreenPageLimit = tabFragmentsCreators.size
        binding.navigation.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        binding.navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.discover -> {
                    binding.viewPager.setCurrentItem(0, false)
                    true
                }
                R.id.news -> {
                    binding.viewPager.setCurrentItem(1, false)
                    true
                }
                R.id.tickets -> {
                    binding.viewPager.setCurrentItem(2, false)
                    true
                }
                R.id.account -> {
                    binding.viewPager.setCurrentItem(3, false)
                    true
                }
                R.id.notifications -> {
                    binding.viewPager.setCurrentItem(4, false)
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}

