package jiyun.com.managesponsor.scheduledetail

import android.app.DatePickerDialog
import android.app.Dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import jiyun.com.managesponsor.R

import jiyun.com.managesponsor.databinding.ScheduledetailFragBinding
import java.util.*

class ScheduleDetailFragment : DialogFragment() {

    private lateinit var binding: ScheduledetailFragBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(this.context, R.style.PreviewDialogAnimation)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.scheduledetail_frag, container, false)
        binding.today = Date()

        return binding.root
    }


    fun onCalendarClick() {
        openDatePicker()
    }


    private fun openDatePicker() {
        val calendar = Calendar.getInstance()

        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this.context, R.style.BaseDatePickerTheme,
                DatePickerDialog.OnDateSetListener { _, pickYear, pickMonth, pickDay ->
                    binding.textDetailDate.text = getString(R.string.pick_date, pickYear, pickMonth+1, pickDay)
                }, year, month, day)

        if (!datePickerDialog.isShowing) {
            datePickerDialog.show()
        }
    }

}