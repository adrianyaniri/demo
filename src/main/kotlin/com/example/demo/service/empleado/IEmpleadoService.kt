package com.example.demo.service.empleado

import com.example.demo.dto.EmpleadoDto
import org.springframework.http.ResponseEntity


interface IEmpleadoService {
    fun findAll(): List<EmpleadoDto>
    fun createdEmpleado(empleado: EmpleadoDto): ResponseEntity<EmpleadoDto>
}