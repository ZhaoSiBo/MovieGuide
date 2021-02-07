package com.starts.movieguide

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.starts.movieguide.databinding.ActivityMainBinding
import com.starts.movieguide.ui.DiscoverFragment

class MainActivity : DataBindingActivity() {

    private val tabFragmentsCreators: HashMap<Int, () -> Fragment> = HashMap()

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tabFragmentsCreators[0] = {DiscoverFragment()}
        tabFragmentsCreators[1] = {DiscoverFragment()}
        tabFragmentsCreators[2] = {DiscoverFragment()}
        tabFragmentsCreators[3] = {DiscoverFragment()}
        tabFragmentsCreators[4] = {DiscoverFragment()}

        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.offscreenPageLimit = tabFragmentsCreators.size
        binding.viewPager.adapter = object :FragmentStateAdapter(this){
            override fun getItemCount(): Int {
                return tabFragmentsCreators.size
            }

            override fun createFragment(position: Int): Fragment {
                return tabFragmentsCreators[position]?.invoke()?:throw Exception("MainActivity createFragment failed")
            }

        }

        binding.navigation.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        binding.navigation.setBackgroundColor(ContextCompat.getColor(this , R.color.colorBackground))
        binding.navigation.itemTextColor = ContextCompat.getColorStateList(this , R.color.navigation_text_color)
        binding.navigation.selectedItemId = R.id.discover
        binding.navigation.itemIconTintList = null
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

