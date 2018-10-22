package jiyun.com.managesponsor.agreementDetail

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.View
import jiyun.com.managesponsor.util.startOtherActivity

class AgreeDetailViewModel(val navi : AgreeDetailNavigator) {

    fun onDialClick(phoneNumber : String) {
        navi.preparePhoneCall(phoneNumber)
    }
}