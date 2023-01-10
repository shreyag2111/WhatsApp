package Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager, fragments: Array<Fragment>) : FragmentPagerAdapter(fm) {
    var   fragments : Array<Fragment> = fragments

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return  fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Chats"
            1 -> return "Status"
            2 -> return "Call"
            else  -> return "Chats"
        }
    }
}