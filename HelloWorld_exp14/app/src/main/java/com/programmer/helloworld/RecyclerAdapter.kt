package com.programmer.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    //Image list
    private val images = intArrayOf(
        R.drawable.cardview_7,
        R.drawable.cardview_8,
        R.drawable.cardview_9,
        R.drawable.cardview_10,
        R.drawable.cardview_11,
        R.drawable.cardview_12)
    //Title list
    private val titles = arrayOf(
        "1 Persebaya",
        "2 Persija",
        "3 Persib",
        "4 Persegeres",
        "5 Bali United",
        "6 Madura United")
    //Detail list
    private val details = arrayOf(
        "Persevaya merupakan klub yang berasal dari Surabaya",
        "Persija merupakan klub yang berasal dari Jakarta",
        "Persib merupakan klub yang berasal dari Bandung",
        "Persegres merupakan klub yang berasal dari Gresik",
        "Bali United merupakan klub yang berasal dari Bali",
        "Madura United merupakan klub berasal dari Madura")
    //ViewHolder class
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        init{
            itemImage = itemView.findViewById(R.id.cardImage)
            itemTitle = itemView.findViewById(R.id.cardTitle)
            itemDetail = itemView.findViewById(R.id.cardDetail)

            itemView.setOnClickListener { v: View ->
                var position: Int = getAdapterPosition()
                Snackbar.make(v, "Click on item ${titles[position]}",
                    Snackbar.LENGTH_LONG).setAction("Action",null).show()
            }
        }

    }

    //onCreateViewHolder()
    override fun onCreateViewHolder(ViewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(ViewGroup.context)
            .inflate(R.layout.card_layout, ViewGroup, false)
        return ViewHolder(v)
    }
    //onBindViewHolder()
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }
    //getItemCount()
    override fun getItemCount(): Int {
        return titles.size
    }
}