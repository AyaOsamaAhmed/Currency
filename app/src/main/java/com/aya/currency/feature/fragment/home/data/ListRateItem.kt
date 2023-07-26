package com.aya.currency.feature.fragment.home.data

import com.aya.currency.base.BasePaginationParcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListRateItem (
    var id : Int? = null ,
    var Currency : String? = null ,
    var rate : String? = null,

  override var viewType: Int

): BasePaginationParcelable {
    override fun unique(): Int = id!!
}