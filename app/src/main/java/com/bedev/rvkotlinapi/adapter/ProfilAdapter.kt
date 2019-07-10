package com.bedev.rvkotlinapi.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bedev.rvkotlinapi.R
import com.bedev.rvkotlinapi.model.DataProfl
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_profil.view.*

class ProfilAdapter(private val dataProflList: MutableList<DataProfl>) : RecyclerView.Adapter<MyHolder>() {

    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyHolder {
        context = parent.context
        return MyHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_profil,
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int = dataProflList.size


    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val data = dataProflList[position]

        val npm = holder.itemView.tvNpm
        npm.text = data.npm
        val nama = holder.itemView.tvNama
        nama.text = data.nama
        val nik = holder.itemView.tvNik
        nik.text = data.nik
        val tahunMasuk = holder.itemView.tvTahunMasuk
        tahunMasuk.text = data.tahunMasuk
        val tgl = holder.itemView.tvTanggalLahir
        tgl.text = data.tlhr
        val alamat = holder.itemView.tvAlamat
        alamat.text = data.almt
        val email = holder.itemView.tvEmail
        email.text = data.email
        val golDarah = holder.itemView.tvGolonganDarah
        golDarah.text = data.darah
        val kos = holder.itemView.tvAlamatKos
        kos.text = data.alamatKos
        val hp = holder.itemView.tvHp
        hp.text = data.telp

        val foto = holder.itemView.ivImageProfile

        Picasso.get()
            .load("http://informatika.upgris.ac.id/mobile/image/16670054.jpg")
            .into(foto)




        holder.itemView.setOnClickListener {


        }

    }
}