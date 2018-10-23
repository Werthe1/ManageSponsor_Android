package jiyun.com.managesponsor.schedule


import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Observable
import jiyun.com.managesponsor.data.Schedule
import jiyun.com.managesponsor.databinding.ScheduleItemBinding

class ScheduleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ScheduleItemBinding? = DataBindingUtil.bind(itemView)

    fun getClickObservable(item: Schedule): Observable<Schedule> =
            Observable.create { emitter ->
                itemView.setOnClickListener {
                    emitter.onNext(item)
                }
            }
}