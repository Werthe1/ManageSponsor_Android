package jiyun.com.managesponsor.agreement


import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.disposables.CompositeDisposable
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.agreementDetail.AgreeDetailActivity
import jiyun.com.managesponsor.data.Agreement
import jiyun.com.managesponsor.databinding.AgreeFragBinding
import jiyun.com.managesponsor.util.startOtherActivity
import java.util.*

class AgreeFragment : Fragment() {

    private lateinit var binding: AgreeFragBinding
    private val disposables = CompositeDisposable()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.agree_frag, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerVIew()
    }


    private fun initRecyclerVIew() {
        binding.recyclerAgree.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@AgreeFragment.context)

            adapter = AgreeAdapter().apply {
                addItems(mutableListOf(
                        Agreement("2018-0044-99", Date(), Date(),
                                15000, "이지윤" , "11", "010-1234-5678","성공회대학교 소프트웨어공학 발전기금",20,
                                "CMS", "국민", "233002-04-133003", "이지윤", "920413", "비고\n비고입니다."),
                        Agreement("2018-0044-99", Date(), Date(),
                                15000, "이지윤" , "11", "010-4567-8970","성공회대학교 소프트웨어공학 발전기금",20,
                                "CMS", "국민", "233002-04-133003", "이지윤", "920413", "비고\n비고입니다.")))


                disposables.add(
                        clickSubject.subscribe {
                            (activity as AppCompatActivity).startOtherActivity(AgreeDetailActivity())
                        }
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        disposables.dispose()
    }
}
