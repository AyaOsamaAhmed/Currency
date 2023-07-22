package com.aya.currency.feature.fragment.home.domain

import com.aya.currency.core.network.MainRepository
import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseResponse
import com.aya.currency.core.usecase.BaseUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LatestUseCase  @Inject constructor(private val mainRepository: MainRepository) :
    BaseUseCase<BaseResponse<Any>,BaseResponse<Any>, String>() {
    override fun mapper(req: BaseResponse<Any>): BaseResponse<Any> =
          req


    override fun executeRemote(params: String?): Flow<NetworkResponse<BaseResponse<Any>, ErrorResponse>> =
        flow {
            emit(mainRepository.latest())
        }

}