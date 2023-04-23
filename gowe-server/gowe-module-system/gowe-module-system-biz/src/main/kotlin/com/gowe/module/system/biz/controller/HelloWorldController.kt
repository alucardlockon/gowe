package com.gowe.module.system.biz.controller

import com.gowe.common.annotation.CustomApiResult
import com.gowe.core.util.log
import com.gowe.module.system.biz.entity.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController {

    @GetMapping("/say")
    fun openFetch(@RequestParam("word") word: String): String {
        return "hello $word"
    }

    @GetMapping("/say2")
    fun openFetch(): User {
        val u = User(id = "1122", userName = "aassa")

        val output = with(u) {
            email = "ccc@gmail.com"
            sex = "1"
            buildString {
                appendLine(
                    """
                @NoArg
                @TableName("sys_user")
                data class User constructor(
                    @TableId
                    var id: String? = null,
                    var userName: String? = null,
                    var realName: String? = null,
                    var sex: String? = null,
                    var idCard: String? = null,
                    var email: String? = "${email}",
                """.trimIndent()
                )

                for (col in mapOf("thirdName" to "String", "thirdPass" to "Int"))
                    appendLine(
                        """
                |    var ${col.key}: ${col.value}? = null,
                    """.trimMargin()
                    )

                appendLine(
                    """
                    var birthday: Date? = null,
                    var phone: String? = null,
                    var workPhone: String? = null,
                )
                """.trimIndent()
                )
            }
        }
        log.info(output)
        return u
    }

    @CustomApiResult
    @GetMapping("/say3")
    fun say3(): String {
        return "hello only"
    }

}