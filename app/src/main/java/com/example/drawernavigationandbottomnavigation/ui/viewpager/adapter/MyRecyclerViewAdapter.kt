package com.example.drawernavigationandbottomnavigation.ui.viewpager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.drawernavigationandbottomnavigation.R
import com.example.drawernavigationandbottomnavigation.databinding.ItemView1Binding
import com.example.drawernavigationandbottomnavigation.databinding.ItemView2Binding
import com.example.drawernavigationandbottomnavigation.ui.viewpager.model.MyRecyclerViewItemsData
import java.lang.IllegalArgumentException

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyRecyclerViewHolders>() {

    private var itemDataList: ArrayList<MyRecyclerViewItemsData> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewHolders {
        return when(viewType) {
            R.layout.item_view_1 -> {
                MyRecyclerViewHolders.InfoViewHolder(
                    ItemView1Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            R.layout.item_view_2 -> {
                MyRecyclerViewHolders.DescriptionViewHolder(
                    ItemView2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            else -> throw IllegalArgumentException("Exception")
        }
    }

    override fun onBindViewHolder(holder: MyRecyclerViewHolders, position: Int) {
        when(holder) {
            is MyRecyclerViewHolders.DescriptionViewHolder -> holder.bind(itemDataList[position] as MyRecyclerViewItemsData.Description)
            is MyRecyclerViewHolders.InfoViewHolder -> holder.bind(itemDataList[position] as MyRecyclerViewItemsData.Info)
        }
    }

    override fun getItemCount(): Int {
        return itemDataList.size
    }

    override fun getItemViewType(position: Int): Int {

        return when(itemDataList[position]) {
            is MyRecyclerViewItemsData.Info -> R.layout.item_view_1
            is MyRecyclerViewItemsData.Description -> R.layout.item_view_2
        }
    }

    fun updateData(newList: ArrayList<MyRecyclerViewItemsData>) {
        itemDataList.clear()
        itemDataList = newList
        notifyDataSetChanged()
    }
}



// without binding....  Just for Learning
/**

class HelloAdapter(): RecyclerView.Adapter<HelloHelders>(){

    private var helloArray: ArrayList<MyRecyclerViewItemsData> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelloHelders {
       return when(viewType) {
            R.layout.item_view_1 -> {
                HelloHelders.MyInfo(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_view_1, parent, false)
                )
            }

            R.layout.item_view_2 -> {
                HelloHelders.MyDesc(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_view_2, parent, false)
                )
            }
           else -> throw IllegalArgumentException("Exception")
       }
    }

    override fun onBindViewHolder(holder: HelloHelders, position: Int) {
        when(holder) {
            is HelloHelders.MyInfo -> holder.bind(helloArray[position] as MyRecyclerViewItemsData.Info)
            is HelloHelders.MyDesc -> holder.bind(helloArray[position] as MyRecyclerViewItemsData.Description)
        }
    }

    override fun getItemCount(): Int {
        return helloArray.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(helloArray[position]) {
            is MyRecyclerViewItemsData.Description -> R.layout.item_view_2
            is MyRecyclerViewItemsData.Info -> R.layout.item_view_1
        }
    }

    fun updateData(newArray: ArrayList<MyRecyclerViewItemsData>) {
        helloArray.clear()
        helloArray = newArray
        notifyDataSetChanged()
    }
}
 */