package com.app.product.application.port.input.usecase.Impl

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.command.UpdateProductCommand
import com.app.product.application.port.input.usecase.UpdateProductUseCase
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.model.ProductId
import com.app.product.domain.validator.ProductPolicyValidator

class UpdateProductService(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
): UpdateProductUseCase {
    override fun updateProduct(command: UpdateProductCommand) {

    }
}