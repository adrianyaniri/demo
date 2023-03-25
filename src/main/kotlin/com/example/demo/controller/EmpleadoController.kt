package com.example.demo.controller

import com.example.demo.dto.EmpleadoDto
import com.example.demo.service.EmpleadoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/api")
class EmpleadoController(

    @Autowired
    private val empleadoService: EmpleadoService
) {
    @GetMapping("/empleados")
    fun empleados(): ResponseEntity< List<EmpleadoDto>> =
        ResponseEntity.ok(empleadoService.findAll())
}