package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SymbolItem (
    var Country : String,
    var Currency : String

): Parcelable