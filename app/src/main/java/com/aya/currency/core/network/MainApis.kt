package  com.aya.currency.core.network

import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.feature.fragment.history.data.HistoryResponse
import com.aya.currency.feature.fragment.home.data.LatestResponse
import com.aya.currency.feature.fragment.home.data.SymbolsResponse
import com.aya.currency.utils.Constants.ACCESS_KEY
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface MainApis {

    companion object {
        private const val LATEST = "latest"
        private const val SYMBOLS = "symbols"

    }


    @GET("{date}")
    suspend fun historyData(@Path ("date") data : String ,@Query ("access_key") access_key : String = ACCESS_KEY): NetworkResponse<HistoryResponse, ErrorResponse>


    @GET(LATEST)
    suspend fun latest(@Query ("access_key") access_key : String = ACCESS_KEY): NetworkResponse<LatestResponse, ErrorResponse>
    //, @Query ("symbols") symbols : String


    @GET(SYMBOLS)
    suspend fun symbols(@Query ("access_key") access_key : String = ACCESS_KEY  ): NetworkResponse<SymbolsResponse, ErrorResponse>


}