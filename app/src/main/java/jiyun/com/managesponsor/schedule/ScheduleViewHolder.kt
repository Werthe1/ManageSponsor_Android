package jiyun.com.managesponsor.schedule


import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import jiyun.com.managesponsor.databinding.ItemScheduleBinding

class ScheduleViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding  : ItemScheduleBinding?= DataBindingUtil.bind(itemView)
}