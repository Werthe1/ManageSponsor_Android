package jiyun.com.managesponsor.log


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.BankLog
import jiyun.com.managesponsor.databinding.LogFragBinding
import java.util.*


class LogFragment : Fragment() {

    private lateinit var binding: LogFragBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.log_frag, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerVIew()
    }

    private fun initRecyclerVIew() {
        binding.recyclerLog.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@LogFragment.context)

            adapter =LogAdapter().apply {
                addItems(mutableListOf(
                       BankLog("정상", 1, Date(), "1101231254561", "성공회대학교 발전기금 소프트웨어공학 ", "이지윤"),
                        BankLog("에러", 0, Date(), "231231254561", "성공회대학교 산학협력단 기숙사 증축 지원금", "김혜리"),
                        BankLog("정상", 1, Date(), "1101231254561", "성공회대학교 발전기금 소프트웨어공학 ", "윤지이"),
                        BankLog("에러", 0, Date(), "55551254561", "성공회대학교 법인 경영학부 발전기금 어쩌고 장학금", "홍길동"),
                        BankLog("신청", 2, Date(), "464631254561", "성공회대학교 산학협력단 기숙사 증축 지원금", "이혜김")
                       ))
            }
        }
    }
}