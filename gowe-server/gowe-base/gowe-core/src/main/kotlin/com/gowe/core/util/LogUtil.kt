package com.gowe.core.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * 获取log方法
 */
fun getLog(that:Class<*>):Logger = LoggerFactory.getLogger(that)

/**
 * log扩展属性
 */
val Any.log: Logger
    get() = getLog(this.javaClass)

