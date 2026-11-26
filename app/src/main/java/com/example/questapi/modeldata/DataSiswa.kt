package com.example.questapi.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id: Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String,
)
