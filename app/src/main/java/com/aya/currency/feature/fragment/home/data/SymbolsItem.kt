package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SymbolsItem (

    @field:SerializedName("success")
    var success : Boolean? = null,
    @field:SerializedName("symbols")
    var symbols : MutableList<SymbolItem> = mutableListOf()


): Parcelable