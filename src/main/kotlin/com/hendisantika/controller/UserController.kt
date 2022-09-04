package com.hendisantika.controller

import com.hendisantika.service.UserService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.net.URI

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
class UserController(private val userService: UserService) {
    @PostMapping(value = ["/api/user/{userId}/profile-picture"], consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun setProfilePicture(@PathVariable("userId") id: Long, @RequestParam file: MultipartFile): ResponseEntity<Void> {

        return try {
            userService.setProfilePicture(id, file)
            ResponseEntity
                .created(URI("/api/user/${id}/profile-picture"))
                .build()
        } catch (error: NoSuchElementException) {
            ResponseEntity
                .notFound()
                .build()
        }

    }
}