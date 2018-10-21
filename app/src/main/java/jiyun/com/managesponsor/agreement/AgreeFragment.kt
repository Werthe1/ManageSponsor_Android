package jiyun.com.managesponsor.agreement


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Agreement
import jiyun.com.managesponsor.databinding.AgreeFragBinding
import java.util.*

class AgreeFragment : Fragment() {

    private lateinit var binding: AgreeFragBinding


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
                        Agreement("2015101820-1", Date(), Date(), 20000, "이지윤", "1101231254561", 20, "CMS",
                        "국민", "233002-04-131313", "이지윤", "920413"),
                        Agreement("2012101820-1", Date(), Date(), 15000, "윤지이", "1231231254561", 25, "급여공제",
                                "우리", "1302-04-131313", "윤지이", "960212")))
            }
        }
    }
}
