package jiyun.com.managesponsor.util


import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import jiyun.com.managesponsor.R


fun replaceFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment) {
    fragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
            .replace(R.id.frame_main, fragment)
            .commit()
}

fun AppCompatActivity.startOtherActivity(activity: Activity) {
    startActivity(Intent(this, activity::class.java))
}

