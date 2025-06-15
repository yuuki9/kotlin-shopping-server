package com.app.product.domain.validator

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.model.Product

interface ProductPolicyValidator {
    fun validate(domain: Product)
}