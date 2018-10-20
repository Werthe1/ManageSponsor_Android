package jiyun.com.managesponsor.log


import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import jiyun.com.managesponsor.databinding.ItemLogBinding

class LogViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding  : ItemLogBinding?= DataBindingUtil.bind(itemView)
}