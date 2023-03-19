package com.github.alucardlockon.gowe

import lombok.extern.slf4j.Slf4j
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * GOWE后台启动类
 */
@SpringBootApplication
@Slf4j
open class GoweSystemApplication

fun main(args: Array<String>) {
    runApplication<GoweSystemApplication>(*args)
}
