package com.example.cloneandroidjr.data.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

data class RoleItem(
    val title: String,
    @DrawableRes
    val image: Int,
    val description: String,
    val location: String,
    val company: String,
    val payment: BigDecimal
)
