package jiyun.com.managesponsor

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import jiyun.com.managesponsor.databinding.MainActBinding
import jiyun.com.managesponsor.schedule.ScheduleFragment
import jiyun.com.managesponsor.setting.SettingActivity
import jiyun.com.managesponsor.util.replaceFragmentToActivity

class MainActivity : AppCompatActivity() , MainNavigator{

    private lateinit var binding: MainActBinding
    private val mViewModel  = MainViewModel(this)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_act)
        binding.viewModel = mViewModel

        initDefaultFragment()

        initToolbar()
    }

    private fun initDefaultFragment() {
        binding.bnvMain.selectedItemId = R.id.action_schedule

        replaceFragmentToActivity(supportFragmentManager, ScheduleFragment())
    }


    private fun initToolbar() {
        setSupportActionBar(binding.toolbarMain)
        supportActionBar?.apply {
            setDisplayShowTitleEnabled(false)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?) : Boolean {
        startActivity(Intent(this, SettingActivity::class.java))
        return true
    }
}
