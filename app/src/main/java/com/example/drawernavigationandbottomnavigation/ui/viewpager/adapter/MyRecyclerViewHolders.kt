package com.example.drawernavigationandbottomnavigation.ui.viewpager.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.drawernavigationandbottomnavigation.R
import com.example.drawernavigationandbottomnavigation.databinding.ItemView1Binding
import com.example.drawernavigationandbottomnavigation.databinding.ItemView2Binding
import com.example.drawernavigationandbottomnavigation.ui.viewpager.model.MyRecyclerViewItemsData

sealed class MyRecyclerViewHolders(binding: ViewBinding): RecyclerView.ViewHolder(binding.root) {

    class InfoViewHolder(private val binding: ItemView1Binding): MyRecyclerViewHolders(binding) {
        fun bind(info: MyRecyclerViewItemsData.Info) {
            binding.tvUserName.text = "UserName: ${info.userName}"
            binding.tvAge.text = "Age: ${info.age}"
            binding.tvGender.text = "Gender: ${info.gender}"
        }
    }

    class DescriptionViewHolder(private val binding: ItemView2Binding): MyRecyclerViewHolders(binding) {
        fun bind(desc: MyRecyclerViewItemsData.Description) {
            binding.tvDescription.text = desc.desc
        }
    }
}



// Without Binding... Just for Learning
/**
 *

sealed class HelloHelders(itemView: View): RecyclerView.ViewHolder(itemView) {

    class MyInfo(itemView: View): HelloHelders(itemView) {
        fun bind(info: MyRecyclerViewItemsData.Info) {
            val name = itemView.findViewById<TextView>(R.id.tv_userName)
            name.text = info.gender
            val age = itemView.findViewById<TextView>(R.id.tv_age)
            age.text = info.age
            val gender = itemView.findViewById<TextView>(R.id.tv_gender)
            gender.text = info.gender
        }
    }


    class MyDesc(itemView: View): HelloHelders(itemView) {
        fun bind(desc: MyRecyclerViewItemsData.Description) {
            val des = itemView.findViewById<TextView>(R.id.tv_Description)
            des.text = desc.desc
        }
    }

}

 */