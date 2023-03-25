package com.example.demo.controller

import com.example.demo.service.empleado.EmpleadoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping("/api/v1/empleado")
class EmpleadoController(
    @Autowired
    private val empleadoService: EmpleadoService
) {
    @GetMapping
    fun empleados() {
        empleadoService.findAll()
    }
}