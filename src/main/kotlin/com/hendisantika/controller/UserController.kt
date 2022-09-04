package com.hendisantika.controller

import com.hendisantika.service.UserService
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
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

    @GetMapping("/api/user/{userId}/profile-picture")
    fun getProfilePicture(@PathVariable("userId") id: Long): ResponseEntity<Any> {
        return try {
            val image: ByteArray = userService.getProfilePicture(id)
            ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"${System.currentTimeMillis()}\"")
                .body(image)
        } catch (error: NoSuchElementException) {
            ResponseEntity
                .notFound()
                .build()
        }

    }
}