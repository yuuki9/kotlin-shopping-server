package com.app.product.application.port.input.usecase

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.model.Product

interface CreateProductUseCase {
    fun create(command: CreateProductCommand) : Product
}