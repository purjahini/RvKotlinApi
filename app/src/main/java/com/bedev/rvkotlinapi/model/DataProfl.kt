package com.bedev.rvkotlinapi.model


import com.google.gson.annotations.SerializedName

data class DataProfl(
    @SerializedName("agama")
    val agama: String,
    @SerializedName("alamat_kos")
    val alamatKos: String,
    @SerializedName("almt")
    val almt: String,
    @SerializedName("ayah")
    val ayah: String,
    @SerializedName("darah")
    val darah: String,
    @SerializedName("dosen_wali")
    val dosenWali: String,
    @SerializedName("dusun")
    val dusun: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("foto")
    val foto: String,
    @SerializedName("ibu")
    val ibu: String,
    @SerializedName("kalmt")
    val kalmt: String,
    @SerializedName("kec")
    val kec: String,
    @SerializedName("kelamin")
    val kelamin: String,
    @SerializedName("kelas")
    val kelas: String,
    @SerializedName("kpos")
    val kpos: String,
    @SerializedName("ktlhr")
    val ktlhr: String,
    @SerializedName("nama")
    val nama: String,
    @SerializedName("nik")
    val nik: String,
    @SerializedName("nisn")
    val nisn: String,
    @SerializedName("nmortu")
    val nmortu: String,
    @SerializedName("npm")
    val npm: String,
    @SerializedName("prop")
    val prop: String,
    @SerializedName("rt")
    val rt: String,
    @SerializedName("rw")
    val rw: String,
    @SerializedName("tahun_masuk")
    val tahunMasuk: String,
    @SerializedName("telp")
    val telp: String,
    @SerializedName("tgl_msk")
    val tglMsk: String,
    @SerializedName("tlhr")
    val tlhr: String,
    @SerializedName("transpor")
    val transpor: String
)