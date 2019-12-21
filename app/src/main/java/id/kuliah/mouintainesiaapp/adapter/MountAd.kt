package id.kuliah.mouintainesiaapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.kuliah.mouintainesiaapp.R
import id.kuliah.mouintainesiaapp.model.mountcode

class MountAd( private val codelist: ArrayList<mountcode>) : RecyclerView.Adapter<MountAd.codeViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): codeViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.mounlist, parent, false)
        return codeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return codelist.size
    }

    override fun onBindViewHolder(holder: codeViewHolder, position: Int) {
        val kod = codelist[position]
        holder.tvNama.text = kod.nama
        Glide.with(holder.itemView.context)
            .load(kod.logo)
            .into(holder.gambarlogo)
    }

    inner class codeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_name)
        var gambarlogo: ImageView = itemView.findViewById(R.id.gambarlogo)
    }
}