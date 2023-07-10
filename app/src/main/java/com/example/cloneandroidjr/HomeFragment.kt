package com.example.cloneandroidjr

import android.content.res.Resources.NotFoundException
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.androidjr.R
import com.example.androidjr.databinding.FragmentHomeBinding
import com.example.cloneandroidjr.adapter.RoleItemAdapter
import com.example.cloneandroidjr.data.RoleModel
import com.example.cloneandroidjr.tabs.TabAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val role = RoleModel()
    private lateinit var adapter: RoleItemAdapter
    private lateinit var tabAdapter: TabAdapter
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var roleItemAdapter: RoleItemAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRoleList()
        //setUpTabs()
    }

    private fun setUpRoleList() = binding.run {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = RoleItemAdapter(requireContext(), role.items)
        recyclerView.adapter = adapter
    }

//    private fun setUpTabs() {
//        tabLayout = binding.tabLayout
//        viewPager = binding.viewPager2
//        tabAdapter = TabAdapter(this)
//        TabLayoutMediator(tabLayout, viewPager) { tab, index ->
//            tab.text = when (index) {
//                0 -> { "Todos" }
//                1 -> { "Android" }
//                2 -> { "Ios" }
//                3 -> { "Flutter" }
//                else -> {
//                    throw NotFoundException("Position Not Found")
//                }
//            }
//        }.attach()
//
//        viewPager.adapter = tabAdapter
//
//        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                tab?.let {
//                    viewPager.currentItem = tab.position
//                    roleItemAdapter.filterList(tab.position)
//                    roleItemAdapter.notifyDataSetChanged()
//                }
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {}
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {}
//        })
//
//        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
//            override fun onPageSelected(position: Int) {
//                super.onPageSelected(position)
//                tabLayout.selectTab(tabLayout.getTabAt(position))
//            }
//        })
//    }
}




