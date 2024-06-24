package com.example.devmarkrukotlin.entity
import jakarta.persistence.*

@Entity
@Table(name = "country")
class Country(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = "",
    val population: Int = 0,
)