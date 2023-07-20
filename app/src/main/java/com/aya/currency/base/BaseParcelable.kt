package com.aya.currency.base

import android.os.Parcelable

interface BaseParcelable : Parcelable {
    fun unique(): Any
}