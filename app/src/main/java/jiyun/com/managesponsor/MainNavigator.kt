package jiyun.com.managesponsor

import androidx.fragment.app.FragmentManager

interface MainNavigator {

    fun applyToolbarTitle(titleId : Int)

    fun getSupportFragmentManager() : FragmentManager
}