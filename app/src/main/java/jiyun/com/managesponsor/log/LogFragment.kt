package jiyun.com.managesponsor.log

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.databinding.FragmentLogBinding


class LogFragment : Fragment() {

    private lateinit var binding: FragmentLogBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_log, container, false)

        return binding.root
    }
}