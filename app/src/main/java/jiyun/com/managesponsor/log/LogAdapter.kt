package jiyun.com.managesponsor.log

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.BankLog

class LogAdapter  : RecyclerView.Adapter<LogViewHolder>() {

    private val dataSet = mutableListOf<BankLog>()


    fun addItems(items : MutableList<BankLog>) {
        dataSet.addAll(items)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogViewHolder =
            LogViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.item_log, parent, false))


    override fun onBindViewHolder(holder: LogViewHolder, position: Int) {
        holder.binding?.log = dataSet[position]
    }

    override fun getItemCount(): Int  = dataSet.size
}