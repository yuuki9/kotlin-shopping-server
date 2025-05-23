package com.app.product.application.service

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.application.port.input.usecase.CreateProductUseCase
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.*
import java.time.LocalDateTime

class CreateProductService (
        private val productRepository: ProductRepository
) : CreateProductUseCase {

    override fun create(command: CreateProductCommand) {
        val product = Product(
                name = ProductName(command.name),
                price = Price(command.price),
                description = command.description,
                stockQuantity = command.stockQuantity,
                status = ProductStatus.ON_SALE,
                createAt = LocalDateTime.now(),
                updatedAt = LocalDateTime.now()
        )
        productRepository.save(product)
    }
}