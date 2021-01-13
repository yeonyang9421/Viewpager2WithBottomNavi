package com.example.viewpager2withbottomnavi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentTwo.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentTwo : Fragment() {
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

        modelList.add(0, MoveInfoModel(R.drawable.movie4, "1 Grans"))
        modelList.add(1, MoveInfoModel(R.drawable.image1, "2 군도"))
        modelList.add(2, MoveInfoModel(R.drawable.image2, "3 공조"))
        modelList.add(3, MoveInfoModel(R.drawable.movie4, "4 Grans"))
        modelList.add(4, MoveInfoModel(R.drawable.image1, "5 군도"))
        modelList.add(5, MoveInfoModel(R.drawable.image2, "6 공조"))
        modelList.add(6, MoveInfoModel(R.drawable.movie4, "7 Grans"))
        modelList.add(7, MoveInfoModel(R.drawable.image1, "8 군도"))
        modelList.add(8, MoveInfoModel(R.drawable.image2, "9 공조"))
        modelList.add(9, MoveInfoModel(R.drawable.movie4, "10 Grans"))
        modelList.add(10, MoveInfoModel(R.drawable.image1, "11 군도"))
        modelList.add(11, MoveInfoModel(R.drawable.image2, "12 공조"))
        modelList.add(12, MoveInfoModel(R.drawable.movie4, "13 Grans"))
        modelList.add(13, MoveInfoModel(R.drawable.image1, "14 군도"))
        modelList.add(14, MoveInfoModel(R.drawable.image2, "15 공조"))


        val adapter = PhotoAdapter(modelList)
        recyclerView.adapter = adapter
    }
}