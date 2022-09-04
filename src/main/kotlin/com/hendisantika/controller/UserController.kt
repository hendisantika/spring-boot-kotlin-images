package com.hendisantika.controller

import com.hendisantika.service.UserService
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-images
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/4/22
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
@RestController
class UserController(private val userService: UserService)