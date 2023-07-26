package com.aya.currency.feature.fragment.history.ui.adapter

import com.aya.currency.R
import com.aya.currency.base.BaseAdapter
import com.aya.currency.base.BaseViewHolder
import com.aya.currency.databinding.ItemHistoryBinding
import com.aya.currency.feature.fragment.history.data.HistoryDateItem

class HistoryAdapter()
    : BaseAdapter<HistoryDateItem, ItemHistoryBinding>(){
    override fun layoutRes(): Int = R.layout.item_history

    override fun onViewHolderCreated(viewHolder: BaseViewHolder<HistoryDateItem>) {
        super.onViewHolderCreated(viewHolder)

    }

    override fun onBindItemBinding(
        binding: ItemHistoryBinding,
        item: HistoryDateItem,
        position: Int
    ) {
        binding.currency.text = item.toRate?.Currency
        binding.rate.text = item.toRate?.rate

        super.onBindItemBinding(binding, item, position)
    }

}