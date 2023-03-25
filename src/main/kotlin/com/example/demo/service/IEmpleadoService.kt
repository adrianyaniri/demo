package com.example.demo.service

import com.example.demo.dto.EmpleadoDto

interface IEmpleadoService {
    fun findAll(): List<EmpleadoDto>
    fun createdEmpleado(empleado: EmpleadoDto): EmpleadoDto
}