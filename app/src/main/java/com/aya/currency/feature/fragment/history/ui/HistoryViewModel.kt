package com.aya.currency.feature.fragment.history.ui

import android.app.Application
import com.aya.currency.base.Action
import com.aya.currency.base.AndroidBaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


sealed class HistoryAction  : Action {
    data class ShowLoading(val show: Boolean) : HistoryAction()
    data class ShowFailureMsg(val message: String?) : HistoryAction()
}

@HiltViewModel
class HistoryViewModel @Inject constructor(
    app: Application,
) : AndroidBaseViewModel<HistoryAction>(app) {



/*
    fun CancelOrder() {
        updateStatusOrderUseCase.invoke(viewModelScope,paramOrder) { res ->
            when (res) {
                is Resource.Failure ->
                    produce(HistoryAction.ShowFailureMsg(res.message))
                is Resource.Progress ->
                    produce(HistoryAction.ShowLoading(res.loading))
                is Resource.Success -> {
                    handleDetailsOrderSuccess(res.data)
                }
            }
        }
    }

    private fun handleDetailsOrderSuccess(response: BaseResponse<OrderItem>) {
        if(response.status) {
            produce(HistoryAction.DetailsOrder(response.data!!))
        }else
            produce(HistoryAction.ShowFailureMsg(response.message))

    }
*/
}