package com.example.cloneandroidjr.tabs

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cloneandroidjr.HomeFragment
import com.example.cloneandroidjr.tabs.ui.AllFragment
import com.example.cloneandroidjr.tabs.ui.AndroidFragment
import com.example.cloneandroidjr.tabs.ui.FlutterFragment
import com.example.cloneandroidjr.tabs.ui.IosFragment
import com.example.cloneandroidjr.utilities.TOTAL_TABS

class TabAdapter(
    fragmentActivity: HomeFragment
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = TOTAL_TABS

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllFragment()
            1 -> AndroidFragment()
            2 -> IosFragment()
            else -> FlutterFragment()
        }
    }
}