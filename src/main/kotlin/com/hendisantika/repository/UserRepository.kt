package com.hendisantika.repository

import com.hendisantika.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

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
@Repository
interface UserRepository : JpaRepository<User, Long>