package com.aya.currency.core.network

import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.feature.fragment.home.data.LatestResponse
import com.aya.currency.feature.fragment.home.data.SymbolsResponse
import javax.inject.Inject

class MainRepository @Inject constructor(private val mainApiService: MainApis) {


    suspend fun latest(symbol : String ): NetworkResponse<LatestResponse, ErrorResponse> =
        mainApiService.latest(symbols =  symbol)


    suspend fun symbols(): NetworkResponse<SymbolsResponse, ErrorResponse> =
        mainApiService.symbols()

}