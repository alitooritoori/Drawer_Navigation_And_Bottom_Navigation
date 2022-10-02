package com.example.drawernavigationandbottomnavigation.ui.viewpager.model

sealed class MyRecyclerViewItemsData {

    data class Info(
        val userName: String,
        val age: String,
        val gender: String
    ): MyRecyclerViewItemsData()

    data class Description(
        val desc: String
    ): MyRecyclerViewItemsData()

}