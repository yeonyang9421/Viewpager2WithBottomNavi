package com.example.viewpager2withbottomnavi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class FragmentThree : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_for_recycler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        val modelList = ArrayList<MoveInfoModel>()

        modelList.add(0, MoveInfoModel(R.drawable.image3, "1 더킹"))
        modelList.add(1, MoveInfoModel(R.drawable.image4, "2 레지던트이블"))
        modelList.add(2, MoveInfoModel(R.drawable.image5, "3 럭키"))
        modelList.add(3, MoveInfoModel(R.drawable.image3, "4 더킹"))
        modelList.add(4, MoveInfoModel(R.drawable.image4, "5 레지던트이블"))
        modelList.add(5, MoveInfoModel(R.drawable.image5, "6 럭키"))
        modelList.add(6, MoveInfoModel(R.drawable.image3, "7 더킹"))
        modelList.add(7, MoveInfoModel(R.drawable.image4, "8 레지던트이블"))
        modelList.add(8, MoveInfoModel(R.drawable.image5, "9 럭키"))
        modelList.add(9, MoveInfoModel(R.drawable.image3, "10 더킹"))
        modelList.add(10, MoveInfoModel(R.drawable.image4, "11 레지던트이블"))
        modelList.add(11, MoveInfoModel(R.drawable.image5, "12 럭키"))
        modelList.add(12, MoveInfoModel(R.drawable.image3, "13 더킹"))
        modelList.add(13, MoveInfoModel(R.drawable.image4, "14 레지던트이블"))
        modelList.add(14, MoveInfoModel(R.drawable.image5, "15 럭키"))
        modelList.add(15, MoveInfoModel(R.drawable.image3, "16 더킹"))
        modelList.add(16, MoveInfoModel(R.drawable.image4, "17 레지던트이블"))
        modelList.add(17, MoveInfoModel(R.drawable.image5, "18 럭키"))

        val adapter = PhotoAdapter(modelList)
        recyclerView.adapter = adapter
    }
}