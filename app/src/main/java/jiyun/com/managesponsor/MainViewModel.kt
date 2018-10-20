package jiyun.com.managesponsor


import android.view.MenuItem
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.google.android.material.bottomnavigation.BottomNavigationView
import jiyun.com.managesponsor.agreement.AgreeFragment
import jiyun.com.managesponsor.log.LogFragment
import jiyun.com.managesponsor.schedule.ScheduleFragment
import jiyun.com.managesponsor.util.replaceFragmentToActivity

@BindingMethods(
        BindingMethod(
                type = BottomNavigationView::class,
                attribute = "app:onNavigationItemSelected",
                method = "setOnNavigationItemSelectedListener"
        )
)


class MainViewModel(val context: MainNavigator) {

    fun onNavigationClick(item: MenuItem): Boolean =
            when (item.itemId) {
                R.id.action_agreement -> {
                    replaceFragmentToActivity(context.getSupportFragmentManager(), AgreeFragment())
                    true
                }
                R.id.action_schedule -> {
                    replaceFragmentToActivity(context.getSupportFragmentManager(), ScheduleFragment())
                    true
                }
                R.id.action_log -> {
                    replaceFragmentToActivity(context.getSupportFragmentManager(), LogFragment())
                    true
                }
                else -> {
                    replaceFragmentToActivity(context.getSupportFragmentManager(), ScheduleFragment())
                    true
                }
            }
}


