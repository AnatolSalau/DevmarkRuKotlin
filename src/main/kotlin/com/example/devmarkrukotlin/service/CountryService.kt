package com.example.devmarkrukotlin.service

import com.example.devmarkrukotlin.dto.CountryDto

interface CountryService {
    fun getAll(pageIndex: Int): List<CountryDto>
}