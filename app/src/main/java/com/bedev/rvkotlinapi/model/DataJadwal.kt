package com.bedev.rvkotlinapi.model


import com.google.gson.annotations.SerializedName

data class DataJadwal(
    @SerializedName("data")
    val `data`: List<DataJdwl>,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("id")
    val id: Int
)