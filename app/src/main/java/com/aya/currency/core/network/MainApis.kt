package  com.aya.currency.core.network

import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseResponse
import com.aya.currency.utils.Constants.ACCESS_KEY
import retrofit2.http.GET
import retrofit2.http.Query


interface MainApis {

    companion object {
        private const val LATEST = "latest"


    }

    @GET(LATEST)
    suspend fun latest(@Query ("access_key") access_key : String = ACCESS_KEY): NetworkResponse<BaseResponse<Any>, ErrorResponse>

}