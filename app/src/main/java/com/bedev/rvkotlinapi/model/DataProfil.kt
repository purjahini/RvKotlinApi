package com.bedev.rvkotlinapi.model


import com.google.gson.annotations.SerializedName

data class DataProfil(
    @SerializedName("data")
    val `data`: List<DataProfl>,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("id")
    val id: Int
)