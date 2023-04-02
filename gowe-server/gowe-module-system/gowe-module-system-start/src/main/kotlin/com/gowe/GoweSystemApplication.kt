package com.gowe

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * GOWE后台启动类
 */
@SpringBootApplication
open class GoweSystemApplication


private val log = LoggerFactory.getLogger(GoweSystemApplication::class.java)

fun main(args: Array<String>) {
    runApplication<GoweSystemApplication>(*args)
    log.info("gowe started !!")
}



