package jiyun.com.managesponsor.agreement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jiyun.com.managesponsor.R
import jiyun.com.managesponsor.data.Agreement

class AgreeAdapter  : RecyclerView.Adapter<AgreeViewHolder>() {

    private val dataSet = mutableListOf<Agreement>()


    fun addItems(items : MutableList<Agreement>) {
        dataSet.addAll(items)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgreeViewHolder =
            AgreeViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.item_agreement, parent, false))


    override fun onBindViewHolder(holder: AgreeViewHolder, position: Int) {
        holder.binding?.agree = dataSet[position]
    }

    override fun getItemCount(): Int  = dataSet.size
}