package com.example.viewpager2withbottomnavi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class FragmentOne : Fragment() {

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
        modelList.add(0, MoveInfoModel(R.drawable.movie1, "1 Final Score"))
        modelList.add(1, MoveInfoModel(R.drawable.movie2, "2 First Man"))
        modelList.add(2, MoveInfoModel(R.drawable.movie3, "3 Funny Girl"))
        modelList.add(3, MoveInfoModel(R.drawable.movie1, "4 Final Score"))
        modelList.add(4, MoveInfoModel(R.drawable.movie2, "5 First Man"))
        modelList.add(5, MoveInfoModel(R.drawable.movie3, "6 Funny Girl"))
        modelList.add(6, MoveInfoModel(R.drawable.movie1, "7 Final Score"))
        modelList.add(7, MoveInfoModel(R.drawable.movie2, "8 First Man"))
        modelList.add(8, MoveInfoModel(R.drawable.movie3, "9 Funny Girl"))
        modelList.add(9, MoveInfoModel(R.drawable.movie1, "10 Final Score"))
        modelList.add(10, MoveInfoModel(R.drawable.movie2, "11 First Man"))
        modelList.add(11, MoveInfoModel(R.drawable.movie3, "12 Funny Girl"))
        modelList.add(12, MoveInfoModel(R.drawable.movie1, "13 Final Score"))
        modelList.add(13, MoveInfoModel(R.drawable.movie2, "14 First Man"))
        modelList.add(14, MoveInfoModel(R.drawable.movie3, "15 Funny Girl"))
        modelList.add(15, MoveInfoModel(R.drawable.movie1, "16 Final Score"))
        modelList.add(16, MoveInfoModel(R.drawable.movie2, "17 First Man"))
        modelList.add(17, MoveInfoModel(R.drawable.movie3, "18 Funny Girl"))


        val adapter = PhotoAdapter(modelList)
        recyclerView.adapter = adapter
    }
}