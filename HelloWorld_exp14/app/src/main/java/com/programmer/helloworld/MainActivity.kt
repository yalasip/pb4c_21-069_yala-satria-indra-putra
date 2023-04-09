package com.programmer.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Deklarasi variabel
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Menentukan LayoutManager untuk RecyclerView
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager

        //Link kan RecyclerView dengan class Adapter
        adapter = RecyclerAdapter()
        recycler_view.adapter = adapter
    }
}