package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LatestItem (
    @field:SerializedName("success")
    var success : Boolean? = null ,
    @field:SerializedName("timestamp")
    var timestamp : Int? = null ,
    @field:SerializedName("base")
    var base : String? = null ,
    @field:SerializedName("date")
    var date : String? = null ,
    @field:SerializedName("rates")
    var rates : MutableList<RateItem> = mutableListOf()

): Parcelable
