package com.example.devmarkrukotlin.repository

import com.example.devmarkrukotlin.entity.Country
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface CountryRepository: JpaRepository<Country, Int> {

    fun findAllByOrderByName(pageable: Pageable): List<Country>
}