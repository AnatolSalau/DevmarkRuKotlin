package com.example.devmarkrukotlin.controller

import com.example.devmarkrukotlin.dto.CountryDto
import com.example.devmarkrukotlin.service.CountryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class CountryController @Autowired constructor (
    private val countryService: CountryService,
) {

    @GetMapping
    fun getAllCountries(): List<CountryDto> = countryService.getAll()
}