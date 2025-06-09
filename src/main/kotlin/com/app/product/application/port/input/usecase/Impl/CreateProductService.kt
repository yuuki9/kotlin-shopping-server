package com.app.product.application.port.input.usecase.Impl

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.application.port.input.usecase.CreateProductUseCase
import com.app.product.domain.repository.ProductRepository
import com.app.product.domain.model.Product

class CreateProductService (
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) : CreateProductUseCase {

    override fun create(command: CreateProductCommand) : Product {
        val product = productMapper.toDomain(command)
        return productRepository.save(product)
    }
}