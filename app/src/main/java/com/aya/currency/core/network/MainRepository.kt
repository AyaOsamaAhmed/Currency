package com.aya.currency.core.network

import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.feature.fragment.history.data.HistoryResponse
import com.aya.currency.feature.fragment.home.data.LatestResponse
import com.aya.currency.feature.fragment.home.data.SymbolsResponse
import javax.inject.Inject

class MainRepository @Inject constructor(private val mainApiService: MainApis) {



    suspend fun historyData( date : String): NetworkResponse<HistoryResponse, ErrorResponse> =
        mainApiService.historyData(date)

    suspend fun latest( ): NetworkResponse<LatestResponse, ErrorResponse> =
        mainApiService.latest()


    suspend fun symbols(): NetworkResponse<SymbolsResponse, ErrorResponse> =
        mainApiService.symbols()

}