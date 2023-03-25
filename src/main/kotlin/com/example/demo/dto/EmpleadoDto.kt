package com.example.demo.dto

import java.math.BigDecimal

data class EmpleadoDto(
    val id: Long?,
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val salario: Double
)
