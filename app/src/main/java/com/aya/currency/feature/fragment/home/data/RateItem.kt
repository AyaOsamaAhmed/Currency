package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RateItem (
    var Currency : String? = null ,
    var rate : String? = null

): Parcelable