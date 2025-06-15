package com.app.product.application.port.input.usecase

import com.app.product.application.port.input.command.UpdateProductCommand
import com.app.product.domain.model.ProductId

interface UpdateProductUseCase {
    fun updateProduct(command: UpdateProductCommand)
}