package com.bedev.rvkotlinapi.model


import com.google.gson.annotations.SerializedName

data class DataJdwl(
    @SerializedName("hari")
    val hari: String,
    @SerializedName("kode_dosen1")
    val kodeDosen1: String,
    @SerializedName("kode_dosen2")
    val kodeDosen2: String,
    @SerializedName("kode_jadwal")
    val kodeJadwal: String,
    @SerializedName("kode_kelas")
    val kodeKelas: String,
    @SerializedName("kode_mk")
    val kodeMk: String,
    @SerializedName("nama_dosen")
    val namaDosen: String,
    @SerializedName("nama_mk")
    val namaMk: String,
    @SerializedName("nama_mki")
    val namaMki: String,
    @SerializedName("nama_ruang")
    val namaRuang: String,
    @SerializedName("sks1")
    val sks1: String,
    @SerializedName("waktu")
    val waktu: String
)