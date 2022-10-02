package com.example.drawernavigationandbottomnavigation.ui.notification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drawernavigationandbottomnavigation.R
import com.example.drawernavigationandbottomnavigation.databinding.FragmentNotificationBinding
import com.example.drawernavigationandbottomnavigation.ui.viewpager.FragmentOne
import com.example.drawernavigationandbottomnavigation.ui.viewpager.FragmentThree
import com.example.drawernavigationandbottomnavigation.ui.viewpager.FragmentTwo
import com.example.drawernavigationandbottomnavigation.ui.viewpager.MyViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class NotificationFragment : Fragment() {

    private lateinit var binding: FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBinding.inflate(inflater,container, false)

//        val viewPagerAdapter = activity?.let { MyViewPagerAdapter(it) }
//        viewPagerAdapter?.addFragments(FragmentThree(), "3")
//        viewPagerAdapter?.addFragments(FragmentTwo(), "2")
//        viewPagerAdapter?.addFragments(FragmentOne(), "1")
//        binding.viewPager.adapter = viewPagerAdapter
//
//        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
//            tab.text = viewPagerAdapter?.mFragmentTitleList?.get(position)
//        }.attach()

        return binding.root
    }


}