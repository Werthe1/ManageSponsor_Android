package jiyun.com.managesponsor.schedule


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.subjects.PublishSubject
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Schedule


class ScheduleAdapter : RecyclerView.Adapter<ScheduleViewHolder>() {

    private val dataSet = mutableListOf<Schedule>()
    val clickSubject = PublishSubject.create<Schedule>()


    fun addItems(items: MutableList<Schedule>) {
        dataSet.addAll(items)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder =
            ScheduleViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.item_schedule, parent, false))


    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.apply {
            dataSet[position].also {
                binding?.schedule = it
                getClickObservable(it).subscribe(clickSubject)
            }
        }
    }

    override fun getItemCount(): Int = dataSet.size
}