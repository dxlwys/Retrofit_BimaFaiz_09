package com.example.infocovid_19.api.model

data class IndonesiaResponse(
    val name: String,
    val positif: String,
    val sembuh: String,
    val meninggal: String,
    val dirawat: String
)