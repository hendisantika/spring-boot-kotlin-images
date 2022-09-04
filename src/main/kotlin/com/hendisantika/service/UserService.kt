package com.hendisantika.service

import com.hendisantika.entity.User
import com.hendisantika.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

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
class UserService(private val userRepository: UserRepository) {

    fun setProfilePicture(id: Long, file: MultipartFile) {
        val user: User = userRepository.findById(id).orElseThrow()
        user.profilePicture = file.bytes
        userRepository.save(user)
    }

    fun getProfilePicture(id: Long): ByteArray {
        val user: User = userRepository.findById(id).orElseThrow()
        return user.profilePicture
    }
}