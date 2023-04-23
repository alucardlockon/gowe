package com.gowe.common.annotation

import java.lang.annotation.ElementType.*

@Target(AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class CustomApiResult()
