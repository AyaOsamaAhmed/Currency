package com.aya.currency.feature.fragment.home.ui

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.aya.currency.base.Action
import com.aya.currency.base.AndroidBaseViewModel
import com.aya.currency.core.network.Resource
import com.aya.currency.feature.fragment.history.data.HistoryDateItem
import com.aya.currency.feature.fragment.history.data.HistoryItem
import com.aya.currency.feature.fragment.history.domain.HistoryUseCase
import com.aya.currency.feature.fragment.home.data.*
import com.aya.currency.feature.fragment.home.domain.LatestUseCase
import com.aya.currency.feature.fragment.home.domain.SymbolsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


sealed class HomeAction  : Action {
    data class ShowLoading(val show: Boolean) : HomeAction()
    data class ShowFailureMsg(val message: String?) : HomeAction()
    data class ShowLatest (val data: List<RateItem>) : HomeAction()
    data class GetSymbols (val data : SymbolsItem )  : HomeAction()
    data class GetHistory (val data : List<HistoryDateItem>) : HomeAction()
    data class GetOtherCurrency(val data : List<ListRateItem>) : HomeAction()

}

@HiltViewModel
class HomeViewModel @Inject constructor(
    app: Application,
    private val latestUseCae : LatestUseCase,
    private val symbolsUseCase: SymbolsUseCase,
    private  val historyUseCase: HistoryUseCase
) : AndroidBaseViewModel<HomeAction>(app) {

    var fromCurrency = ""
    var toCurrency = ""

    var rates = mutableListOf<RateItem>()

    init {
        getLatest()
        getSymbols()
    }

     private fun getLatest( ) {
        latestUseCae.invoke(viewModelScope,"") { res ->
            when (res) {
                is Resource.Failure ->
                    produce(HomeAction.ShowFailureMsg(res.message))
                is Resource.Progress ->
                    produce(HomeAction.ShowLoading(res.loading))
                is Resource.Success -> {
                    handleLatestSuccess(res.data)
                }
            }
        }
    }

    private fun handleLatestSuccess(response: LatestItem) {
        if(response.success!!) {
            rates = response.rates
            produce(HomeAction.ShowLatest(response.rates))
        }else
            produce(HomeAction.ShowFailureMsg(response.success.toString()))

    }


    private fun getSymbols() {
        symbolsUseCase.invoke(viewModelScope,"") { res ->
            when (res) {
                is Resource.Failure ->
                    produce(HomeAction.ShowFailureMsg(res.message))
                is Resource.Progress ->
                    produce(HomeAction.ShowLoading(res.loading))
                is Resource.Success -> {
                    handleSymbolsSuccess(res.data)
                }
            }
        }
    }

    private fun handleSymbolsSuccess(response: SymbolsItem) {
        if(response.success!!) {
            produce(HomeAction.GetSymbols(response))
        }else
            produce(HomeAction.ShowFailureMsg(response.success.toString()))

    }


    var listDate = mutableListOf<String>()
    var listHistoryDate = mutableListOf<HistoryDateItem>()


    fun getHistoryDate(date : String ) {
        historyUseCase.invoke(viewModelScope,date) { res ->
            when (res) {
                is Resource.Failure ->
                    produce(HomeAction.ShowFailureMsg(res.message))
                is Resource.Progress ->
                    produce(HomeAction.ShowLoading(res.loading))
                is Resource.Success -> {
                    handleHistoryDateSuccess(res.data)
                }
            }
        }
    }

    private fun handleHistoryDateSuccess(response: HistoryItem) {
        if(response.success!!) {
            listHistoryDate.add(HistoryDateItem(0,response.date,getRate(0,response.rates , fromCurrency), getRate(1,response.rates,toCurrency),0))
              produce(HomeAction.GetHistory(listHistoryDate))
        }else
            produce(HomeAction.ShowFailureMsg("Error Response"))

    }

    private fun getRate(id : Int, data : List<RateItem>, date : String) : ListRateItem? {

            data.forEach {
            if(it.Currency == date){
                return ListRateItem(id, it.Currency.toString() , it.rate.toString(),id)

            }
        }
        return null
    }

}