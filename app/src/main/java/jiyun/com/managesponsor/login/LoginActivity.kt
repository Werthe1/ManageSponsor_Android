package jiyun.com.managesponsor.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.View
import android.view.Window
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import androidx.databinding.DataBindingUtil
import jiyun.com.managesponsor.MainActivity
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.databinding.LoginActBinding
import jiyun.com.managesponsor.util.startOtherActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : LoginActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.login_act)
        binding.viewModel = this
    }


    fun onLoginBtnClick(view : View) {
        startOtherActivity(this, MainActivity())
    }
}
