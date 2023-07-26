package com.aya.currency.feature.fragment.history.ui.adapter

import com.aya.currency.R
import com.aya.currency.base.BaseAdapter
import com.aya.currency.base.BaseViewHolder
import com.aya.currency.databinding.ItemHistoryBinding
import com.aya.currency.feature.fragment.home.data.ListRateItem

class OtherCurrencyAdapter() : BaseAdapter<ListRateItem, ItemHistoryBinding>(){
    override fun layoutRes(): Int = R.layout.item_history

    override fun onViewHolderCreated(viewHolder: BaseViewHolder<ListRateItem>) {
        super.onViewHolderCreated(viewHolder)

    }

    override fun onBindItemBinding(
        binding: ItemHistoryBinding,
        item: ListRateItem,
        position: Int
    ) {
        binding.currency.text = item.Currency
        binding.rate.text = item.rate

        super.onBindItemBinding(binding, item, position)
    }

}