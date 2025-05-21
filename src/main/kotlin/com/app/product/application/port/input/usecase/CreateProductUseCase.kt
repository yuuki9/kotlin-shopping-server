package com.app.product.application.port.input.usecase

import com.app.product.application.port.input.command.CreateProductCommand

interface CreateProductUseCase {
    fun create(command: CreateProductCommand)
}