package com.example.cloneandroidjr

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.androidjr.R
import com.example.androidjr.databinding.ActivityMainBinding
import com.example.cloneandroidjr.tabs.TabAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpBottomNav()

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrasaction = fragmentManager.beginTransaction()
        fragmentTrasaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTrasaction.commit()
    }

    private fun setUpBottomNav() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> replaceFragment(HomeFragment())
                R.id.menu_bookmarks -> replaceFragment(BookmarkFragment())
                R.id.menu_profile -> replaceFragment(ProfileFragment())

                else -> {
                }
            }
            true
        }
    }


}