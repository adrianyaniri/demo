package com.example.demo.controller

import com.example.demo.dto.EmpleadoDto
import com.example.demo.service.EmpleadoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/api")
class EmpleadoController(
    @Autowired
    private val empleadoService: EmpleadoService
) {
    @GetMapping("/empleados")
    fun empleados(): ResponseEntity< List<EmpleadoDto>> =
        ResponseEntity.ok(empleadoService.findAll())

    @PostMapping("/empleados")
    fun createEmpleado(@RequestBody empleado: EmpleadoDto): ResponseEntity<EmpleadoDto> {
        val newEmpleado = empleadoService.createdEmpleado(empleado)
        return ResponseEntity.status(HttpStatus.CREATED).body(newEmpleado)
    }
}