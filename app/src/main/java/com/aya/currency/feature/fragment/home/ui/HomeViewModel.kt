package com.aya.currency.feature.fragment.home.ui

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.aya.currency.base.Action
import com.aya.currency.base.AndroidBaseViewModel
import com.aya.currency.core.network.Resource
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
}

@HiltViewModel
class HomeViewModel @Inject constructor(
    app: Application,
    private val latestUseCae : LatestUseCase,
    private val symbolsUseCase: SymbolsUseCase
) : AndroidBaseViewModel<HomeAction>(app) {

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


}