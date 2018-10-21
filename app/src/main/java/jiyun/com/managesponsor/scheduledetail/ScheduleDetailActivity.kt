package jiyun.com.managesponsor.scheduledetail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.databinding.ScheduledetailActBinding

class ScheduleDetailActivity : AppCompatActivity() {

    private lateinit var binding : ScheduledetailActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.scheduledetail_act)

    }
}