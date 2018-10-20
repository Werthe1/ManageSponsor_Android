package jiyun.com.managesponsor.common


import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import jiyun.com.managesponsor.R
import java.text.SimpleDateFormat
import java.util.*

@BindingConversion
fun convertDateToString(date : Date) : String
        = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA).format(date)


@BindingAdapter("startDate", "endDate")
fun setStartDateEndDate(view : TextView, startDate : Date, endDate: Date) {
    val startDateText = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA).format(startDate)
    val endDateText = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA).format(endDate)

    view.text = view.context.getString(R.string.pay_duration, startDateText, endDateText)
}