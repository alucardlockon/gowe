package com.gowe.core.config

import com.gowe.common.annotation.CustomApiResult
import com.gowe.core.entity.ApiResult
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice


@RestControllerAdvice
class ResponseAdvice : ResponseBodyAdvice<Any> {

    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean =
        true

    override fun beforeBodyWrite(
        body: Any?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Any? {
        // 如果项目都返回统一格式，可以不启用自定义注解检测
        val find = returnType.methodAnnotations.find { it.annotationClass == CustomApiResult::class }
        if (find != null) {
            return body
        }
        if (body is ApiResult<*>) {
            return body
        }
        return ApiResult.success(body)
    }

}