package com.example.demo.model

import com.example.demo.util.AGE_DEFAULT
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*


@Entity(name = "usuario")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, name = "nombre")
    val name: String,

    @Column(nullable = false, name = "apellido")
    val lastname: String,

    @Column(name = "email", unique = true)
    val email: String,

    @Column(name = "password")
    @JsonIgnore
    var password: String,

    @Column(name = "edad")
    val age: Int,

    @Column(name = "estado")
    val active: Boolean
) {}