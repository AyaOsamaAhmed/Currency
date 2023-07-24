package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LatestResponse (
    @field:SerializedName("success")
    var success : Boolean,
    @field:SerializedName("timestamp")
    var timestamp : Int,
    @field:SerializedName("base")
    var base : String,
    @field:SerializedName("date")
    var date : String,
    @field:SerializedName("rates")
    var rates : SymbolsItem

): Parcelable
