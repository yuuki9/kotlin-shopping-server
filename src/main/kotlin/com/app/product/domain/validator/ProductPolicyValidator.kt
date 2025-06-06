package com.app.product.domain.validator

import com.app.product.application.port.input.command.CreateProductCommand

interface ProductPolicyValidator {
    fun validate(command: CreateProductCommand)
}