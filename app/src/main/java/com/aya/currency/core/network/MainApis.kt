package  com.aya.currency.core.network

import com.aya.currency.core.response.ErrorResponse
import com.aya.currency.core.response.NetworkResponse
import com.aya.currency.core.usecase.BaseResponse
import retrofit2.http.GET


interface MainApis {

    companion object {
        private const val MAIN = "client/"

        private const val LIST_COUNTRIES_LOCALES = MAIN.plus("list_countries_locales")

    }

    //common
    @GET(LIST_COUNTRIES_LOCALES)
    suspend fun listCountriesLocales(): NetworkResponse<BaseResponse<Any>, ErrorResponse>

}