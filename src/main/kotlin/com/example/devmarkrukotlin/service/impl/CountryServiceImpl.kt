package com.example.devmarkrukotlin.service.impl

import com.example.devmarkrukotlin.dto.CountryDto
import com.example.devmarkrukotlin.entity.Country
import com.example.devmarkrukotlin.repository.CountryRepository
import com.example.devmarkrukotlin.service.CountryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl @Autowired constructor(
    private val countryRepository: CountryRepository
) : CountryService {
    override fun getAll(pageIndex: Int): List<CountryDto> {
        return countryRepository
            .findAllByOrderByName(PageRequest.of(pageIndex, 2))
            .map { it.toDto() }
    }

    private fun Country.toDto() : CountryDto =
        CountryDto(
            id = this.id,
            name = this.name,
            population = this.population
        )

}