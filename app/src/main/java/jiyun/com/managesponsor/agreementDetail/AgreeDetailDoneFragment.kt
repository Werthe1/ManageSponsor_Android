package jiyun.com.managesponsor.agreementDetail

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.databinding.AgreedetailDoneBinding
import java.util.*

class AgreeDetailDoneFragment : DialogFragment() {

    private lateinit var binding : AgreedetailDoneBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(this.context).apply {

            window?.apply {
                setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.agreedetail_done, container, false)
        binding.viewModel = this

        return binding.root
    }

    fun onDialogBtnClick(view : View) {
        when(view.id) {
            R.id.btn_done_ok -> {
                dismiss()
            }
            R.id.btn_done_cancel -> {
                dismiss()
            }
        }
    }
}