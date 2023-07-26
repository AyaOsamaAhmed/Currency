package com.aya.currency.feature.fragment.home.domain

import com.aya.currency.core.network.MainRepository
import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseUseCase
import com.aya.currency.feature.fragment.home.data.SymbolsItem
import com.aya.currency.feature.fragment.home.data.SymbolsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SymbolsUseCase  @Inject constructor(private val mainRepository: MainRepository) :
    BaseUseCase<SymbolsResponse,SymbolsItem, String>() {
    override fun mapper(req: SymbolsResponse): SymbolsItem =
          SymbolsMapper.mapData(req)


    override fun executeRemote(params: String?): Flow<NetworkResponse<SymbolsResponse, ErrorResponse>> =
        flow {
            emit(mainRepository.symbols())
        }

}