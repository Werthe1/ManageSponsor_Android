package jiyun.com.managesponsor.schedule


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Schedule


class ScheduleAdapter  : RecyclerView.Adapter<ScheduleViewHolder>() {

    private val dataSet = mutableListOf<Schedule>()


    fun addItems(items : MutableList<Schedule>) {
        dataSet.addAll(items)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder =
            ScheduleViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.item_schedule, parent, false))


    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.binding?.schedule = dataSet[position]
    }

    override fun getItemCount(): Int  = dataSet.size
}