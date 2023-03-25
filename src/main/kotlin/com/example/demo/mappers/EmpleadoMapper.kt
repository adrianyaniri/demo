package com.example.demo.mappers

import com.example.demo.dto.EmpleadoDto
import com.example.demo.model.Empleado

object EmpleadoMapper {
    fun EmpleadoDto(empleado: Empleado): EmpleadoDto {
        return EmpleadoDto(
            id = empleado.id,
            nombre = empleado.nombre,
            apellido = empleado.apellido,
            edad = empleado.edad,
            salario = empleado.salario
        )
    }
    fun empleadoDtoAEmpleado(empleadoDto: EmpleadoDto): Empleado {
        return Empleado(
            id = empleadoDto.id,
            nombre = empleadoDto.nombre,
            apellido = empleadoDto.apellido,
            edad = empleadoDto.edad,
            salario = empleadoDto.salario
        )
    }
}