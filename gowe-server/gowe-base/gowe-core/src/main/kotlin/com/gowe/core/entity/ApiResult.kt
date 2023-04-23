package com.gowe.core.entity

import com.gowe.core.constant.HttpResultConstants

data class ApiResult<T>(
    val status: Int = HttpResultConstants.OK.code,
    val message: String = HttpResultConstants.OK.message,
    val data: T? = null
) {

    companion object {

        fun <T> success(data: T): ApiResult<T> {
            return ApiResult<T>(
                data = data
            )
        }

        fun <T> error(code: HttpResultConstants): ApiResult<T> = ApiResult(
            status = code.code,
            message = code.message
        )

        fun <T> error(status: Int, message: String): ApiResult<T> = ApiResult(
            status = status,
            message = message
        )
    }

}
