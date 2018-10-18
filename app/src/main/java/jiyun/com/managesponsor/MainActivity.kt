package jiyun.com.managesponsor

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jiyun.com.managesponsor.databinding.ActivityMainBinding
import jiyun.com.managesponsor.schedule.ScheduleFragment
import jiyun.com.managesponsor.util.replaceFragmentToActivity

class MainActivity : AppCompatActivity() , MainNavigator{

    private lateinit var binding: ActivityMainBinding
    private val mViewModel  = MainViewModel(this)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = mViewModel

        initDefaultFragment()
    }

    private fun initDefaultFragment() {
        binding.bnvMain.selectedItemId = R.id.action_schedule

        replaceFragmentToActivity(supportFragmentManager, ScheduleFragment())
    }
}
