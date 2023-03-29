package com.example.demo.service

import com.example.demo.dto.UserPasswordUpdateDto
import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import com.example.demo.util.PasswordUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService (
    @Autowired
    private val userRepository: UserRepository
): IUserService {

    fun create(user: User): User {
        // Verificar que si hay u usuario con el mismo email
        userRepository.findByEmail(user.email).ifPresent {
            throw Exception("Ya existe un usuario con el email ${user.email}")
        }
        // Encriptar la contraseña
        user.password = PasswordUtils.encodePassword(user.password)
        return userRepository.save(user)
    }

    override fun updateUserPassword(id: Long, password: UserPasswordUpdateDto) {
        TODO("Not yet implemented")
    }

}