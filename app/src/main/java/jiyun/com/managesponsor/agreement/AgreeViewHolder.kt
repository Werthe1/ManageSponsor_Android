package jiyun.com.managesponsor.agreement


import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Observable
import jiyun.com.managesponsor.data.Agreement
import jiyun.com.managesponsor.data.Schedule
import jiyun.com.managesponsor.databinding.ItemAgreementBinding

class AgreeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding  : ItemAgreementBinding?= DataBindingUtil.bind(itemView)

    fun getClickObservable(item: Agreement): Observable<Agreement> =
            Observable.create { emitter ->
                itemView.setOnClickListener {
                    emitter.onNext(item)
                }
            }
}