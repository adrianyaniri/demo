package com.example.demo.util

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

object PasswordUtils {
    private val passwordEncode = BCryptPasswordEncoder(PASSWORD_ENCODE)

    fun encodePassword(password: String): String {
        return passwordEncode.encode(password)
    }

    fun matchPassword(password: String, passwordEncoded: String): Boolean {
        return passwordEncode.matches(password, passwordEncoded)
    }
}