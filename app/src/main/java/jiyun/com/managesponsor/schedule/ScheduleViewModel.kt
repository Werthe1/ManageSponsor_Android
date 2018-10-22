package jiyun.com.managesponsor.schedule

import android.view.View
import jiyun.com.managesponsor.scheduledetail.ScheduleDetailFragment
import java.util.*

class ScheduleViewModel(val navi : ScheduleNavigator) {

    fun onWriteFABClick(view : View) {
        ScheduleDetailFragment().show(navi.getSupportFragmentManager(), "preview")
    }
}