package com.app.product.application.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.application.port.input.usecase.CreateProductUseCase
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.*
import com.app.product.domain.validator.ProductPolicyValidator
import java.time.LocalDateTime

class CreateProductService (
        private val productRepository: ProductRepository,
        private val validator: ProductPolicyValidator,
        private val productMapper: ProductMapper
) : CreateProductUseCase {

    override fun create(command: CreateProductCommand) : Product {
        validator.validate(command)
        val product = productMapper.toDomain(command)
        return productRepository.save(product)
    }
}