package com.app.product.application.port.input.command

import java.math.BigDecimal

data class CreateProductCommand(
        val name: String,
        val price: BigDecimal,
        val description: String,
        val stockQuantity: Long
)