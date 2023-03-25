package com.example.demo.repository

import com.example.demo.model.Empleado
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpleadoRepository : JpaRepository<Empleado, Long>