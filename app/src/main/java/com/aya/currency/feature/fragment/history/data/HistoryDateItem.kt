package com.aya.currency.feature.fragment.history.data

import com.aya.currency.base.BasePaginationParcelable
import com.aya.currency.feature.fragment.home.data.ListRateItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class HistoryDateItem (
    var id : Int? = null,
    var date : String? = null,
    var fromRate : ListRateItem? = null,
    var toRate : ListRateItem? = null,


    override var viewType: Int

): BasePaginationParcelable {
    override fun unique(): Int = id!!
}