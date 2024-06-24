package com.example.devmarkrukotlin.service.impl

import com.example.devmarkrukotlin.dto.CountryDto
import com.example.devmarkrukotlin.service.CountryService
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl : CountryService {
    override fun getAll(): List<CountryDto> {
        return listOf(
            CountryDto(1, "Germany", 3_000_000),
            CountryDto(1, "France", 2_000_000),
            CountryDto(1, "Italy", 1_000_000)
        )
    }
}