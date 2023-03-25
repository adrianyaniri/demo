package com.example.demo.service.empleado

import com.example.demo.dto.EmpleadoDto
import com.example.demo.mappers.EmpleadoMapper
import com.example.demo.repository.EmpleadoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
abstract class EmpleadoService(
    @Autowired
    private val empleadoRepository: EmpleadoRepository,

    ) : IEmpleadoService{

    override fun findAll(): List<EmpleadoDto> {
        return empleadoRepository.findAll().map { EmpleadoMapper.EmpleadoDto(it) }
    }
   override fun createdEmpleado(empleado: EmpleadoDto): ResponseEntity<EmpleadoDto> {
        val newEmpleado = EmpleadoMapper.empleadoDtoAEmpleado(empleado)
        empleadoRepository.save(newEmpleado)
        return ResponseEntity.status(HttpStatus.CREATED).body(EmpleadoMapper.EmpleadoDto(newEmpleado))
    }
}