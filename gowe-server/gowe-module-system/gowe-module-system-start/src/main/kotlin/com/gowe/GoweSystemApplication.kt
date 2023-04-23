package com.gowe

import com.gowe.core.util.getLog
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * GOWE后台启动类
 */
@SpringBootApplication
open class GoweSystemApplication

private val log = getLog(GoweSystemApplication::class.java)

fun main(args: Array<String>) {
    runApplication<GoweSystemApplication>(*args)
    log.info("========== gowe started !! ==========")
}

