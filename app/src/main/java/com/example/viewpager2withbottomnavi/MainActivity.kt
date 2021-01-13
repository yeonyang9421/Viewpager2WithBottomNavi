package com.example.viewpager2withbottomnavi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val firstBottomFragment by lazy { FirstBottomFragment() }
    private val secondBottomFragment by lazy { SecondBottomFragment() }
    private val thirdBottomFragment by lazy { ThirdBottomFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        bnv_main.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.first -> {
                        changeFragment(firstBottomFragment)
                    }
                    R.id.second -> {
                        changeFragment(secondBottomFragment)
                    }
                    R.id.third -> {
                        changeFragment(thirdBottomFragment)
                    }
                }
                true
            }
            selectedItemId = R.id.first
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_container, fragment).commit()
    }
}