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


class MainViewModel(val navi: MainNavigator) {

    fun onNavigationClick(item: MenuItem): Boolean =
            when (item.itemId) {
                R.id.action_agreement -> {
                    replaceFragmentToActivity(navi.getSupportFragmentManager(), AgreeFragment())
                    navi.applyToolbarTitle(R.string.action_agreement)
                    true
                }
                R.id.action_schedule -> {
                    replaceFragmentToActivity(navi.getSupportFragmentManager(), ScheduleFragment())
                    navi.applyToolbarTitle(R.string.action_schedule)
                    true
                }
                R.id.action_log -> {
                    replaceFragmentToActivity(navi.getSupportFragmentManager(), LogFragment())
                    navi.applyToolbarTitle(R.string.action_log)
                    true
                }
                else -> {
                    replaceFragmentToActivity(navi.getSupportFragmentManager(), ScheduleFragment())
                    navi.applyToolbarTitle(R.string.action_schedule)
                    true
                }
            }
}


