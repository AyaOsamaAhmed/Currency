package com.aya.currency.core.network

import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseResponse
import javax.inject.Inject

class MainRepository @Inject constructor(private val mainApiService: MainApis) {


    suspend fun latest(): NetworkResponse<BaseResponse<Any>, ErrorResponse> =
        mainApiService.latest()

}