package com.esatgozcu.viewpager2simpleexample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.esatgozcu.viewpager2simpleexample.view.fragment.FirstPageFragment
import com.esatgozcu.viewpager2simpleexample.view.fragment.SecondPageFragment

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int  = 2
    override fun createFragment(position: Int): Fragment {
        return if (position == 0){
            FirstPageFragment()
        } else{
            SecondPageFragment()
        }
    }
}