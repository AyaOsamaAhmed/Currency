package com.aya.currency.feature.fragment.home.ui

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.aya.currency.base.Action
import com.aya.currency.base.AndroidBaseViewModel
import com.aya.currency.core.network.Resource
import com.aya.currency.core.usecase.BaseResponse
import com.aya.currency.feature.fragment.home.domain.LatestUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


sealed class HomeAction  : Action {
    data class ShowLoading(val show: Boolean) : HomeAction()
    data class ShowFailureMsg(val message: String?) : HomeAction()
    data class ShowLatest (val data:Any) : HomeAction()
}

@HiltViewModel
class HomeViewModel @Inject constructor(
    app: Application,
    private val latestUseCae : LatestUseCase
) : AndroidBaseViewModel<HomeAction>(app) {

    val param  = ""

    init {
        getLatest()
    }
    private fun getLatest() {
        latestUseCae.invoke(viewModelScope,param) { res ->
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

    private fun handleLatestSuccess(response: BaseResponse<Any>) {
        if(response.status) {
            produce(HomeAction.ShowLatest(response.data!!))
        }else
            produce(HomeAction.ShowFailureMsg(response.message))

    }

}