package com.aya.currency.feature.fragment.history.data

import android.os.Parcelable
import com.aya.currency.feature.fragment.home.data.ListSymbolsResponse
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class HistoryResponse (
    @field:SerializedName("success")
    var success : Boolean,
    @field:SerializedName("timestamp")
    var timestamp : Int,
    @field:SerializedName("base")
    var base : String,
    @field:SerializedName("date")
    var date : String,
    @field:SerializedName("rates")
    var rates : ListSymbolsResponse

): Parcelable
