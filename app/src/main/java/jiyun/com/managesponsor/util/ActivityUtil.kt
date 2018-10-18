package jiyun.com.managesponsor.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import jiyun.com.managesponsor.R


fun replaceFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment) {
    fragmentManager.beginTransaction()
            .replace(R.id.frame_main, fragment)
            .commit()
}