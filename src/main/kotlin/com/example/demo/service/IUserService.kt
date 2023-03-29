package com.example.demo.service

import com.example.demo.dto.UserPasswordUpdateDto

interface IUserService {
    fun updateUserPassword(id: Long, password: UserPasswordUpdateDto)
}