package jiyun.com.managesponsor.util

import androidx.core.app.Fragment
import androidx.core.app.FragmentManager
import jiyun.com.managesponsor.R


fun replaceFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment) {
    fragmentManager.beginTransaction()
            .replace(R.id.frame_main, fragment)
            .commit()
}