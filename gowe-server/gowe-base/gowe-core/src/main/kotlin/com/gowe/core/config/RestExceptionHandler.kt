package com.gowe.core.config

import com.gowe.core.constant.HttpResultConstants
import com.gowe.core.entity.ApiResult
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class RestExceptionHandler {
    private val log = LoggerFactory.getLogger(this::class.java)

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun exception(e: Exception): ApiResult<String> {
        log.error("发生异常:${e.message}", e)
        return ApiResult.error(HttpResultConstants.Error.code, e.message!!)
    }

}