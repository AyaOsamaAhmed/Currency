package com.aya.currency.core.mapper

import com.aya.currency.core.usecase.BaseResponse

object AnyMapper {

    fun mapData(res: BaseResponse<Any>): BaseResponse<Any> {
        return res
    }

}