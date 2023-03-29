package com.example.demo.controller

import com.example.demo.dto.UserDto
import com.example.demo.mappers.UserMapper
import com.example.demo.model.User
import com.example.demo.service.UserService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    @Autowired
    private val userService: UserService
) {

    @PostMapping
    fun createUser(@Valid @RequestBody user: UserDto): User {
        val newUser = UserMapper().toUser(user)
        return userService.create(newUser)
    }
}