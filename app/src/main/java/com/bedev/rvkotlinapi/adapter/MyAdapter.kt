package com.bedev.rvkotlinapi.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bedev.rvkotlinapi.R
import com.bedev.rvkotlinapi.model.DataJdwl
import kotlinx.android.synthetic.main.item_view.view.*

class MyAdapter(private val dataJdwlList: MutableList<DataJdwl>) : RecyclerView.Adapter<MyHolder>() {

    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyHolder {
        context = parent.context
        return MyHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_view,
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int = dataJdwlList.size


    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val data = dataJdwlList[position]

        val namaDosen = holder.itemView.listNamaDosenJadwal
        namaDosen.text = data.namaDosen
        val mataKuliah = holder.itemView.listNamaMatakuliahDosenJadwal
        mataKuliah.text = data.namaMk
        val jam = holder.itemView.tvJam
        jam.text = data.waktu+" WIB"
        val ruang = holder.itemView.tvRuang
        ruang.text = data.namaRuang
        val sks = holder.itemView.tvSks
        sks.text = data.sks1+" SKS"
        val hariClient = holder.itemView.tvHari
        val hariserver = data.hari
        if (hariserver!!.equals("1")){ hariClient.text = "senin"}
        else if (hariserver!!.equals("2")){hariClient.text = "Selasa"}
        else if (hariserver!!.equals("3")){hariClient.text = "Rabu"}
        else if (hariserver!!.equals("4")){hariClient.text = "Kamis"}
        else if (hariserver!!.equals("5")){hariClient.text = "Jum'at"}
        else if (hariserver!!.equals("6")){hariClient.text = "Sabtu"}
        else if (hariserver!!.equals("7")){hariClient.text = "Minggu"}

        holder.itemView.setOnClickListener {


        }

    }
}
