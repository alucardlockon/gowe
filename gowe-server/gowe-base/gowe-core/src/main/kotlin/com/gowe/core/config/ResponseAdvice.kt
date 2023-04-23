package com.gowe.core.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.gowe.core.entity.ApiResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice


@RestControllerAdvice
class ResponseAdvice :ResponseBodyAdvice<Any> {
    @Autowired
    private val objectMapper: ObjectMapper? = null

    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean  = true

    override fun beforeBodyWrite(
        body: Any?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Any? {
        if(body is String){
            return objectMapper?.writeValueAsString(ApiResult.success(body))
        }
        if(body is ApiResult<*>){
            return body
        }
        return ApiResult.success(body)
    }

}