package com.hendisantika.entity

import javax.persistence.*

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-images
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/4/22
 * Time: 10:56
 * To change this template use File | Settings | File Templates.
 */
@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    // the database column is not nullable, has a max length of 30 characters, is called “username”, and must be unique across all entries
    @Column(nullable = false, length = 30, name = "username", unique = true)
    var username: String,
    // the database column is not nullable and has a name of “password”
    @Column(nullable = false, name = "password")
    var password: String,
    // the database column is called "profile_picture" and it has a type of BLOB
    @Lob
    @Column(name = "profile_picture")
    var profilePicture: ByteArray
)
