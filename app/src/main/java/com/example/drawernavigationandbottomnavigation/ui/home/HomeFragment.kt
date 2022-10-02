package com.example.drawernavigationandbottomnavigation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.drawernavigationandbottomnavigation.databinding.FragmentHomeBinding
import com.example.drawernavigationandbottomnavigation.ui.viewpager.FragmentOne
import com.example.drawernavigationandbottomnavigation.ui.viewpager.FragmentThree
import com.example.drawernavigationandbottomnavigation.ui.viewpager.FragmentTwo
import com.example.drawernavigationandbottomnavigation.ui.viewpager.MyViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        homeViewModel.text.observe(viewLifecycleOwner) {
//        }

        val pagerAdapter = activity?.let { MyViewPagerAdapter(it) }
        pagerAdapter?.addFragments(FragmentOne(), "ONE")
        pagerAdapter?.addFragments(FragmentTwo(), "TWO")
        pagerAdapter?.addFragments(FragmentThree(), "THREE")

        binding.viewPager.adapter = pagerAdapter
        //binding.viewPager.currentItem = 0

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = pagerAdapter?.mFragmentTitleList?.get(position)
        }.attach()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}