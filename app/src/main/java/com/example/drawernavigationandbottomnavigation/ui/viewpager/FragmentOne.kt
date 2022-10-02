package com.example.drawernavigationandbottomnavigation.ui.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.drawernavigationandbottomnavigation.databinding.FragmentOneBinding
import com.example.drawernavigationandbottomnavigation.ui.viewpager.adapter.DummyData
import com.example.drawernavigationandbottomnavigation.ui.viewpager.adapter.MyRecyclerViewAdapter


class FragmentOne : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(inflater, container, false)

        loadRecyclerView()

        return binding.root
    }

    private fun loadRecyclerView() {
        val myAdapter = MyRecyclerViewAdapter()
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = myAdapter
        val dummyData = DummyData.getDummyData(requireContext())
        myAdapter.updateData(dummyData)
    }


}