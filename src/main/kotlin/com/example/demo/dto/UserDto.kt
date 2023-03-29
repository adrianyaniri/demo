package com.example.demo.dto

import com.example.demo.util.AGE_DEFAULT
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

data class UserDto(
    @field:NotBlank(message = "El nombre no puede estar vacío")
    val name: String,

    @field:NotBlank(message = "El apellido no puede estar vacío")
    val lastName: String,

    @field:NotBlank(message = "El email no puede estar vacío")
    @field:Email(message = "El email no es válido")
    val email: String,

    val age: Int = AGE_DEFAULT,
    val active: Boolean = true,

    @field:NotBlank(message = "La contraseña no puede estar vacía")
    @field:Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    @field:Size(max = 16, message = "La contraseña debe tener como máximo 16 caracteres")
    @field:Pattern(
        regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\$%^&+=])(?=\\S+\$).{8,16}\$",
        message = "La contraseña debe tener al menos un número, una letra minúscula, una letra mayúscula y un caracter especial")
    val password: String,
)

data class UserPasswordUpdateDto(

    val id: Long,

    @field:NotBlank(message = "La contraseña no puede estar vacía")
    @field:Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    @field:Size(max = 16, message = "La contraseña debe tener como máximo 16 caracteres")
    @field:Pattern(
        regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\$%^&+=])(?=\\S+\$).{8,16}\$",
        message = "La contraseña debe tener al menos un número, una letra minúscula, una letra mayúscula y un caracter especial")
    val password: String?,
)
