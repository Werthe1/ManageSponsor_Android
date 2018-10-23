package jiyun.com.managesponsor.agreement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.subjects.PublishSubject
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Agreement

class AgreeAdapter  : RecyclerView.Adapter<AgreeViewHolder>() {

    private val dataSet = mutableListOf<Agreement>()
    val clickSubject = PublishSubject.create<Agreement>()


    fun addItems(items : MutableList<Agreement>) {
        dataSet.addAll(items)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgreeViewHolder =
            AgreeViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.agree_item, parent, false))


    override fun onBindViewHolder(holder: AgreeViewHolder, position: Int) {
        holder.apply {
            dataSet[position].also {
                binding?.agree = it
                getClickObservable(it).subscribe(clickSubject)
            }
        }
    }

    override fun getItemCount(): Int  = dataSet.size
}