package develop.abdusamid.viewpagerframgment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import develop.abdusamid.viewpagerframgment.databinding.ItemViewpagerBinding

class RvAdapter(var context: Context, var arrayList: ArrayList<String>) :
    RecyclerView.Adapter<RvAdapter.VH>() {

    inner class VH(var itemRV: ItemViewpagerBinding) : RecyclerView.ViewHolder(itemRV.root) {
        fun onBind(string: String) {
            val itemRv = itemRV.itemTv
            itemRv.text = string
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(arrayList[position])
    }

    override fun getItemCount(): Int = arrayList.size
}