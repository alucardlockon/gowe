package com.gowe.module.system.biz.entity

import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import com.gowe.common.annotation.NoArg
import java.util.*

@NoArg
@TableName("sys_user")
data class User constructor(
    @TableId
    var id: String? = null,
    var userName: String? = null,
    var realName: String? = null,
    var sex: String? = null,
    var idCard: String? = null,
    var email: String? = null,
    var birthday: Date? = null,
    var phone: String? = null,
    var workPhone: String? = null,
)

