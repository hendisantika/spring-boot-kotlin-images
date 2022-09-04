package com.hendisantika.service

import com.hendisantika.repository.UserRepository
import org.springframework.stereotype.Service

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-images
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/4/22
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 */
@Service
class UserService(private val userRepository: UserRepository)