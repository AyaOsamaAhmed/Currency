package com.aya.currency.feature.fragment.home.domain

import com.aya.currency.core.network.MainRepository
import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseUseCase
import com.aya.currency.feature.fragment.home.data.SymbolsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SymbolsUseCase  @Inject constructor(private val mainRepository: MainRepository) :
    BaseUseCase<SymbolsResponse,SymbolsResponse, String>() {
    override fun mapper(req: SymbolsResponse): SymbolsResponse =
          req


    override fun executeRemote(params: String?): Flow<NetworkResponse<SymbolsResponse, ErrorResponse>> =
        flow {
            emit(mainRepository.symbols())
        }

}