package com.example.drawernavigationandbottomnavigation.ui.viewpager.adapter

import android.content.Context
import com.example.drawernavigationandbottomnavigation.ui.viewpager.model.MyRecyclerViewItemsData

object DummyData {
    fun getDummyData(context: Context): ArrayList<MyRecyclerViewItemsData> {
        val myDataList = arrayListOf<MyRecyclerViewItemsData>()

        val personalData1 = MyRecyclerViewItemsData.Info(
            "Sarfaraz Ali",
            "25",
            "Male"
        )

        val personalData2 = MyRecyclerViewItemsData.Info(
            "Tauseef",
            "24",
            "Male"
        )
        val personalData3 = MyRecyclerViewItemsData.Info(
            "Ammar",
            "26",
            "Male"
        )

        val personalData4 = MyRecyclerViewItemsData.Info(
            "Amir",
            "27",
            "Male"
        )

        val personalData5 = MyRecyclerViewItemsData.Info(
            "Usama",
            "26",
            "Male"
        )

        val personalData6 = MyRecyclerViewItemsData.Info(
            "Abdullah",
            "27",
            "Male"
        )

        val descroption1 = MyRecyclerViewItemsData.Description(
            "I am Working in AByte"
        )

        val descroption2 = MyRecyclerViewItemsData.Description(
            "I am Working in Rapid Solution"
        )

        val descroption3 = MyRecyclerViewItemsData.Description(
            "I am Working in Programmers Force"
        )

        val descroption4 = MyRecyclerViewItemsData.Description(
            "I am Working in Affinity"
        )

        val descroption5 = MyRecyclerViewItemsData.Description(
            "I am Working in Coding Pixel"
        )

        myDataList.add(personalData1)
        myDataList.add(personalData2)
        myDataList.add(personalData3)
        myDataList.add(personalData4)
        myDataList.add(descroption4)
        myDataList.add(descroption5)
        myDataList.add(personalData5)
        myDataList.add(personalData6)
        myDataList.add(descroption1)
        myDataList.add(descroption2)
        myDataList.add(descroption3)

        return myDataList
    }

}