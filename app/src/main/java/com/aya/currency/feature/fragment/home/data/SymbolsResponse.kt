package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SymbolsResponse (
    @field:SerializedName("success")
    var success : Boolean,
    @field:SerializedName("symbols")
    var symbols : ListSymbolsResponse

): Parcelable