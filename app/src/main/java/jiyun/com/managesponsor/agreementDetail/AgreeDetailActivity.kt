package jiyun.com.managesponsor.agreementDetail


import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.tedpark.tedpermission.rx2.TedRx2Permission
import io.reactivex.disposables.CompositeDisposable
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Agreement
import jiyun.com.managesponsor.databinding.AgreedetailActBinding
import java.util.*


class AgreeDetailActivity : AppCompatActivity(), AgreeDetailNavigator {

    private lateinit var binding: AgreedetailActBinding
    private val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)

        binding = DataBindingUtil.setContentView(this, R.layout.agreedetail_act)
        binding.apply {
            viewModel = AgreeDetailViewModel(this@AgreeDetailActivity)
            agree = Agreement("2018-0044-99", Date(), Date(),
                    15000, "이지윤", "11", "010-5107-3914", "성공회대학교 소프트웨어공학 발전기금", 20,
                    "CMS", "국민", "233002-04-133003", "이지윤", "920413", "비고\n비고입니다.")
        }

        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.detail_agree)
        }
    }


    override fun preparePhoneCall(phoneNumber: String) {
        disposables.add(TedRx2Permission.with(this)
                .setRationaleTitle(R.string.rationale_title)
                .setRationaleMessage(R.string.rationale_msg)
                .setPermissions(android.Manifest.permission.CALL_PHONE)
                .request()
                .doOnError { e -> e.printStackTrace() }
                .subscribe { permissionResult ->
                    if (permissionResult.isGranted) {
                        Toast.makeText(this, getString(R.string.permission_granted), Toast.LENGTH_SHORT).show()

                        makePhoneCall(phoneNumber)
                    } else {
                        Toast.makeText(this, getString(R.string.permission_denied), Toast.LENGTH_SHORT).show()
                    }
                })
    }


    private fun makePhoneCall(phoneNumber: String) {
        Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
            startActivity(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        disposables.dispose()
    }
}
