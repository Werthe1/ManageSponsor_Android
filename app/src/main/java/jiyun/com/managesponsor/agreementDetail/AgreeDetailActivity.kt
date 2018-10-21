package jiyun.com.managesponsor.agreementDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.databinding.AgreedetailActBinding

class AgreeDetailActivity : AppCompatActivity() {

    private lateinit var binding : AgreedetailActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.agreedetail_act)
    }
}
