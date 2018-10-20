package jiyun.com.managesponsor.schedule

import android.databinding.DataBindingUtil
import android.os.Bundle
import androidx.core.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Schedule
import jiyun.com.managesponsor.databinding.FragmentScheduleBinding
import java.util.*

class ScheduleFragment : Fragment() {

    private lateinit var binding: FragmentScheduleBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_schedule, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerVIew()
    }


    private fun initRecyclerVIew() {
        binding.recyclerSchedule.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ScheduleFragment.context)

            adapter = ScheduleAdapter().apply {
                addItems(mutableListOf(
                        Schedule(Date(), "제 123123회 후원인의 밤 행사 (주최 : 동문회)\n성공회대 일만관 2401", "이지윤", 1),
                        Schedule(Date(), "후원인 2019 달력 발송 및 소식지 발송", "김혜리", 0),
                        Schedule(Date(), "우편물 및 기념품 발송 ", "김혜리", 0),
                        Schedule(Date(), "김정호 고문님 CEO 장학금 요청 - 김태윤 학생 복학 확인했음. 지원 김태윤 학생에게  계속하는지 여부 확인할 것.", "김혜리", 0)))
            }
        }
    }

}