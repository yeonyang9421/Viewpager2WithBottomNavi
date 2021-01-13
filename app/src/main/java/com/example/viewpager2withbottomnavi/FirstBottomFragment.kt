package com.example.viewpager2withbottomnavi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.first_bottom_fragment.*

class FirstBottomFragment : Fragment() {
    private val fragmentOne by lazy { FragmentOne() }
    private val fragmentTwo by lazy { FragmentTwo() }
    private val fragmentThree by lazy { FragmentThree() }
    private val fragments: List<Fragment> = listOf(fragmentOne, fragmentTwo, fragmentThree)

//    private val pagerAdapter: MainViewPagerAdapter by lazy {
//        MainViewPagerAdapter(requireActivity() as AppCompatActivity,fragments)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_bottom_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewPager.adapter = MainViewPagerAdapter(requireActivity() as AppCompatActivity, fragments)

        TabLayoutMediator(tabLayout, viewPager, false) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }

}

