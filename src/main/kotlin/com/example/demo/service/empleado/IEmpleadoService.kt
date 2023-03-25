package com.example.demo.service.empleado

import com.example.demo.dto.EmpleadoDto
import com.example.demo.model.Empleado


interface IEmpleadoService {
    fun findAll(): List<EmpleadoDto>
}