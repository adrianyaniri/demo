package com.example.demo.mappers

import com.example.demo.dto.UserDto
import com.example.demo.model.User
import org.springframework.stereotype.Component

@Component
class UserMapper {
    fun toUserDto(user: User): UserDto {
        return UserDto(
            name = user.name,
            lastName = user.lastname,
            email = user.email,
            active = user.active,
            password = user.password
        )
    }

    fun toUser(userDto: UserDto): User {
        return User(
            name = userDto.name,
            lastname = userDto.lastName,
            email = userDto.email,
            age = userDto.age,
            active = userDto.active,
            password = userDto.password
        )
    }
}