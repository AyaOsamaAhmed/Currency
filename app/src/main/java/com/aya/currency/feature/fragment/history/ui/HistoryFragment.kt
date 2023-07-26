package com.aya.currency.feature.fragment.history.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.aya.currency.R
import com.aya.currency.base.BaseFragment
import com.aya.currency.core.extension.observe
import com.aya.currency.databinding.HistoryFragmentBinding
import com.aya.currency.feature.fragment.history.ui.adapter.HistoryAdapter
import com.aya.currency.feature.fragment.history.ui.adapter.OtherCurrencyAdapter
import com.aya.currency.feature.fragment.home.ui.HomeAction
import com.aya.currency.feature.fragment.home.ui.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class HistoryFragment : BaseFragment<HistoryFragmentBinding, HomeViewModel>()  {

    private lateinit var nav : NavHostFragment
    private lateinit var navController : NavController

    override val mViewModel: HomeViewModel by activityViewModels()

    private val otherAdapter : OtherCurrencyAdapter = OtherCurrencyAdapter()
    private val historyAdapter : HistoryAdapter = HistoryAdapter()

    override fun onFragmentReady() {
        mViewModel.apply {
            observe(viewState) {
                handleViewState(it)
            }
        }

        val c = Calendar.getInstance()
        val format = SimpleDateFormat("yyyy-MM-dd")
        val regDate = format.format(c.time)
        Log.d("", "Current Date Time : $regDate")

        repeat(3) {
            c.add(Calendar.DATE, -1)  // number of days to add
            val endDate = format.format(c.time)
            Log.d("", "end Time : $endDate")
            mViewModel.getHistoryDate(endDate)
            mViewModel.listDate.add(endDate)
        }

        binding.apply {

            rvHistoryCurrency.adapter = historyAdapter
            rvOtherCurrency.adapter = otherAdapter

        }

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav =  activity?.supportFragmentManager?.findFragmentById(R.id.main_layout) as NavHostFragment
        navController = nav.navController
    }


    private fun handleViewState(action: HomeAction) {
        when (action) {
            is HomeAction.ShowLoading -> {
                showProgress(action.show)
            }

            is HomeAction.GetHistory -> {
                historyAdapter.submitList(action.data)
            }

            is HomeAction.GetOtherCurrency->{
                otherAdapter.submitList(action.data)
            }
        }
    }

}