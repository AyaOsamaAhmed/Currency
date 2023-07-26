package com.aya.currency.feature.fragment.home.domain

import com.aya.currency.core.network.MainRepository
import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseUseCase
import com.aya.currency.feature.fragment.home.data.LatestItem
import com.aya.currency.feature.fragment.home.data.LatestResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LatestUseCase  @Inject constructor(private val mainRepository: MainRepository) :
    BaseUseCase<LatestResponse,LatestItem, String>() {
    override fun mapper(req: LatestResponse): LatestItem =
         LatestMapper.mapData(req)


    override fun executeRemote(params: String?): Flow<NetworkResponse<LatestResponse, ErrorResponse>> =
        flow {
            emit(mainRepository.latest())
        }

}