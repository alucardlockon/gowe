package com.gowe.core.constant

/**
 * Http接口返回状态码
 */
enum class HttpResultConstants(val code: Int, val message: String) {
    // Http状态码
    OK(200, "成功"),
    Forbidden(403, "资源未授权"),
    NotFound(404, "未找到资源"),
    ServerError(500, "服务器错误"),

    // 自定义错误
    Error(5000, "发生错误"),
    LoginError(5001, "登录失败"),
    TokenError(5002, "Token错误"),
}
