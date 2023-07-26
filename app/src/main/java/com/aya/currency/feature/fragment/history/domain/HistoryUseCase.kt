package com.aya.currency.feature.fragment.history.domain

import com.aya.currency.core.network.MainRepository
import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseUseCase
import com.aya.currency.feature.fragment.history.data.HistoryItem
import com.aya.currency.feature.fragment.history.data.HistoryResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HistoryUseCase  @Inject constructor(private val mainRepository: MainRepository) :
    BaseUseCase<HistoryResponse,HistoryItem, String>() {
    override fun mapper(req: HistoryResponse): HistoryItem =
         HistoryMapper.mapData(req)


    override fun executeRemote(params: String?): Flow<NetworkResponse<HistoryResponse, ErrorResponse>> =
        flow {
            emit(mainRepository.historyData(params!!))
        }

}