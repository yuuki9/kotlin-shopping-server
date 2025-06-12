package com.app.product.adapter.port.input.web.controller

import com.app.product.adapter.port.input.web.dto.CreateProductRequest
import com.app.product.application.port.input.usecase.CreateProductUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(
    private val createProductUseCase: CreateProductUseCase
) {
    @PostMapping("/products")
    fun register(@RequestBody request: CreateProductRequest) {

    }
}