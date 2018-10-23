package jiyun.com.managesponsor.agreementDetail

import android.content.Intent
import android.view.LayoutInflater
import androidx.fragment.app.FragmentManager


interface AgreeDetailNavigator {

    fun getSupportFragmentManager() : FragmentManager
    fun preparePhoneCall(phoneNumber : String)
}